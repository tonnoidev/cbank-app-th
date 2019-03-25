package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.project.model.CbTransactionSaveBean;
import th.co.cbank.util.StringUtil;

public class CbTransactionSaveControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbTransactionSaveControl.class);

    public ArrayList<CbTransactionSaveBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<CbTransactionSaveBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbTransactionSaveBean bean = new CbTransactionSaveBean();
            bean.setT_date(rs.getDate("T_date"));
            bean.setT_time(rs.getString("T_time"));
            bean.setT_acccode(rs.getString("T_acccode"));
            bean.setT_custcode(rs.getString("T_custcode"));
            bean.setT_description(rs.getString("T_description"));
            bean.setT_amount(rs.getDouble("T_amount"));
            bean.setT_empcode(rs.getString("T_empcode"));
            bean.setT_docno(rs.getString("t_docno"));
            bean.setRemark(rs.getString("remark"));
            bean.setT_booktype(rs.getString("T_booktype"));
            bean.setT_hoon(rs.getInt("t_hoon"));
            bean.setLineNo(rs.getInt("LineNo"));
            bean.setPrintChk(rs.getString("PrintChk"));
            bean.setT_balance(rs.getDouble("t_balance"));
            bean.setT_index(rs.getInt("t_index"));
            bean.setMoney_in(rs.getDouble("money_in"));
            bean.setMoney_out(rs.getDouble("money_out"));
            bean.setUpdate_interest(rs.getDate("update_interest"));
            bean.setT_hoon_amt(rs.getDouble("t_hoon_amt"));
            bean.setT_hoon_cash(rs.getDouble("t_hoon_cash"));
            bean.setT_hoon_ton(rs.getDouble("t_hoon_ton"));
            bean.setT_hoon_rate(rs.getDouble("t_hoon_rate"));
            bean.setBranchCode(rs.getString("branch_code"));
            bean.setT_interest(rs.getDouble("t_interest"));
            bean.setT_fee(rs.getDouble("t_fee"));
            bean.setT_status(rs.getString("t_status"));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public ArrayList<CbTransactionSaveBean> listCbTransactionSave() {
        try {
            String sql = "select * from cb_transaction_save";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbTransactionSaveBean> listTransactionSave(String where) {
        try {
            String sql = "select * from cb_transaction_save where 1=1 ";
            if (StringUtil.isNotNullString(where)) {
                sql += where;
            }
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbTransactionSaveBean> listCbTransactionSave(String date1, String date2) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where T_date between '" + date1 + "' and '" + date2 + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbTransactionSaveBean> getTransactionSave(String t_custcode, String t_acccode) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where t_custcode='" + t_custcode + "' "
                    + "and t_acccode='" + t_acccode + "' "
                    + "and t_status in('2','3','8') "
                    + "order by t_date, t_time";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbTransactionSaveBean> getTransaction(String t_custcode, String t_acccode, Date t_date) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where t_custcode='" + t_custcode + "' "
                    + "and t_acccode='" + t_acccode + "' "
                    + "and t_date='" + DateFormat.getMySQL_Date(t_date) + "' "
                    + "and t_status in('2','3','8') "
                    + "order by t_date, t_time";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbTransactionSaveBean> listCbTransactionSaveAll(String accCode) {
        try {
            String sql = "select * "
                    + "from cb_transaction_save "
                    + "where t_acccode='" + accCode + "' "
                    + "and LineNo>0 "
                    + "and PrintChk='N' "
                    + "and t_status in('2','3','8') "
                    + "order by t_index";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbTransactionSaveBean> listCbTransactionSaveAllAddStatus11(String accCode) {
        try {
            String sql = "select * "
                    + "from cb_transaction_save "
                    + "where t_acccode='" + accCode + "' "
                    + "and PrintChk='N' "
                    + "and t_status in('2','3','8', '11') "
                    + "order by t_date, t_time, LineNo";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public CbTransactionSaveBean listCbTransactionSave(String T_custcode) {
        try {
            String sql = "select * from cb_transaction_save "
                    + "where T_custcode='" + T_custcode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbTransactionSaveBean> listBean = mappingBean(rs);
            if (listBean.isEmpty()) {
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public CbTransactionSaveBean checkTransactionSave(String T_DocNO) {
        try {
            String sql = "select * from cb_transaction_save where t_docno='" + T_DocNO + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbTransactionSaveBean> listBean = mappingBean(rs);
            if (listBean.isEmpty()) {
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean saveCbTransactionSave(CbTransactionSaveBean bean) {
        if (bean.getT_date() == null) {
            bean.setT_date(new Date());
        }
        try {
            String sql = "insert into cb_transaction_save "
                    + "(t_date,t_time,t_acccode,t_custcode,t_description,t_amount,t_empcode,t_docno,remark,"
                    + "t_booktype,t_hoon,LineNo,PrintChk,t_balance,t_index,money_in,money_out,update_interest,"
                    + "t_hoon_amt,t_hoon_ton,t_hoon_cash,t_hoon_rate,branch_code,t_interest,t_fee,t_status)  "
                    + "values('" + DateFormat.getMySQL_Date(bean.getT_date()) + "',curtime(),"
                    + "'" + bean.getT_acccode() + "','" + bean.getT_custcode() + "',"
                    + "'" + bean.getT_description() + "','" + bean.getT_amount() + "',"
                    + "'" + bean.getT_empcode() + "','" + bean.getT_docno() + "',"
                    + "'" + bean.getRemark() + "','" + bean.getT_booktype() + "',"
                    + "'" + bean.getT_hoon() + "','" + bean.getLineNo() + "',"
                    + "'" + bean.getPrintChk() + "','" + bean.getT_balance() + "','" + bean.getT_index() + "',"
                    + "'" + bean.getMoney_in() + "','" + bean.getMoney_out() + "',curdate(),"
                    + "'" + bean.getT_hoon_amt() + "','" + bean.getT_hoon_ton() + "','" + bean.getT_hoon_cash() + "',"
                    + "'" + bean.getT_hoon_rate() + "','" + bean.getBranchCode() + "','" + bean.getT_interest() + "',"
                    + "'" + bean.getT_fee() + "','" + bean.getT_status() + "')";
            String sqlChk = "select t_date from cb_transaction_save "
                    + "where t_docno='" + bean.getT_docno() + "' "
                    + "and t_custcode='" + bean.getT_custcode() + "' "
                    + "and t_acccode='" + bean.getT_acccode() + "' "
                    + "and t_date='" + DateFormat.getMySQL_Date(bean.getT_date()) + "' "
                    + "and t_booktype='INT'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                String sqlDel = "delete from cb_transaction_save "
                        + "where t_docno='" + bean.getT_docno() + "' "
                        + "and t_custcode='" + bean.getT_custcode() + "' "
                        + "and t_acccode='" + bean.getT_acccode() + "' "
                        + "and t_date='" + DateFormat.getMySQL_Date(bean.getT_date()) + "' "
                        + "and t_booktype='INT'";
                update(sqlDel);
            }
            rs.close();

            update(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int getLineByAccount(String AccCode) {
        int LineMax = 1;
        try {
            String sql = "select max(t_index)+1 as MaxLineNO "
                    + "from cb_transaction_save "
                    + "where t_acccode='" + AccCode + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                LineMax = rs.getInt("MaxLineNO");
                if (LineMax > 24) {
                    LineMax = LineMax % 24;
                }
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (LineMax == 0) {
            LineMax = 1;
        }

        return LineMax;
    }

    public int getMaxIndex(String AccCode) {
        int LineMax = 1;
        try {
            String sql = "select max(t_index)+1 as MaxLineNO "
                    + "from cb_transaction_save "
                    + "where t_acccode='" + AccCode + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                LineMax = rs.getInt("MaxLineNO");
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (LineMax == 0) {
            LineMax = 1;
        }

        return LineMax;
    }

    public void updateLinePrint(String t_acccode, int lineNo, String t_date) {
        try {
            String sql = "update cb_transaction_save set "
                    + "PrintChk='Y' "
                    + "where t_acccode='" + t_acccode + "' "
                    + "and lineNo='" + lineNo + "' "
                    + "and t_date='" + t_date + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateLoanLinePrint(String t_acccode, int lineNo, String t_date) {
        try {
            String sql = "update cb_transaction_loan set "
                    + "PrintChk='Y' "
                    + "where t_acccode='" + t_acccode + "' "
                    + "and lineNo='" + lineNo + "' "
                    + "and t_date='" + t_date + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteData(String custCode, String accCode) {
        try {
            String sql1 = "delete from cb_transaction_save "
                    + "where t_custcode='" + custCode + "' "
                    + "and t_acccode='" + accCode + "' "
                    + "and t_booktype='INT'";
            update(sql1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
