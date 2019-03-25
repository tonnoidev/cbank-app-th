package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.DocumentGarunteeBean;

public class DocumentGarunteeControl extends BaseControl {
    private final Logger logger = Logger.getLogger(DocumentGarunteeControl.class);

    public ArrayList<DocumentGarunteeBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<DocumentGarunteeBean> listBean = new ArrayList<>();
        while (rs.next()) {
            DocumentGarunteeBean bean = new DocumentGarunteeBean();
            bean.setDOC_NO(rs.getString("DOC_NO"));
            bean.setDOC_DESC(ThaiUtil.ASCII2Unicode(rs.getString("DOC_DESC")));
            bean.setIMAGE1(rs.getString("IMAGE1"));
            bean.setIMGAE2(rs.getString("IMGAE2"));
            bean.setIMAGE3(rs.getString("IMAGE3"));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public ArrayList<DocumentGarunteeBean> listDocumentGaruntee() {
        try {
            String sql = "select * from document_garuntee";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<DocumentGarunteeBean> listDocumentGaruntee(String DOC_NO) {
        ArrayList<DocumentGarunteeBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from document_garuntee where DOC_NO='" + DOC_NO + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public DocumentGarunteeBean getDocumentGaruntee(String DOC_NO) {
        try {
            String sql = "select * from document_garuntee where DOC_NO='" + DOC_NO + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<DocumentGarunteeBean> listBean = mappingBean(rs);
            if(listBean.isEmpty()){
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean saveDocumentGaruntee(DocumentGarunteeBean bean) {
        boolean result = false;
        try {
            String sql = "insert into document_garuntee(DOC_NO,DOC_DESC,IMAGE1,IMGAE2,IMAGE3)  "
                    + "values('" + bean.getDOC_NO() + "','" + bean.getDOC_DESC() + "','" + bean.getIMAGE1() + "',"
                    + "'" + bean.getIMGAE2() + "','" + bean.getIMAGE3() + "')";
            String sqlChk = "select * from document_garuntee "
                    + "where DOC_NO='" + bean.getDOC_NO() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                result = updateDocumentGaruntee(bean);
            } else {
                update(sql);
                result = true;
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public boolean updateDocumentGaruntee(DocumentGarunteeBean bean) {
        try {
            String sql = "update document_garuntee set "
                    + "DOC_DESC='" + bean.getDOC_DESC() + "', "
                    + "IMAGE1='" + bean.getIMAGE1() + "', "
                    + "IMGAE2='" + bean.getIMGAE2() + "', "
                    + "IMAGE3='" + bean.getIMAGE3() + "' "
                    + "where DOC_NO='" + bean.getDOC_NO() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public void deleteData(String loanDocCode) {
        try {
            String sql = "delete from document_garuntee where doc_no='" + loanDocCode + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
