package th.co.cbank.project.view;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.model.PrintSlipBean;
import th.co.cbank.project.control.PassBook_PSiPR9;
import th.co.cbank.project.model.ReportGreenBean;

public class ListSaveConfirmDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(ListSaveConfirmDialog.class);

    private PrintSlipBean psBean;
    private Frame parent;

    public ListSaveConfirmDialog(java.awt.Frame parent, boolean modal, PrintSlipBean psBean) {
        super(parent, modal);
        initComponents();

        this.psBean = psBean;
        this.parent = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("เมนูจัดการ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("พิมพ์สลิป");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("พิมพ์ความเคลื่อนไหวลงสมุด");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("ออก (Exit)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PassBook_PSiPR9 v = new PassBook_PSiPR9();
        v.printSlipSaveBook(psBean);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        printTransactionBookAdd(psBean.getAccountCode());
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables

    private void printTransactionBookAdd(String txtAccCode) {
        //print รายการลงในสมุด
        PassBook_PSiPR9 v = new PassBook_PSiPR9();

        ArrayList<ReportGreenBean> listBean = new ArrayList<>();
        ConfigBean cBean = getConfigControl().getConfigBean();

        try {
            String sql1 = "select * from "
                    + "cb_transaction_save "
                    + "where t_acccode='" + txtAccCode + "' "
                    + "and printchk='N' and LineNo>0 and t_booktype not in"
                    + "('" + cBean.getLoanDocPrefix() + "','" + cBean.getPaymentDocPrefix() + "') "
                    + "order by t_index;";
            try (ResultSet rs = MySQLConnect.getResultSet(sql1)) {
                SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yy");
                while (rs.next()) {
                    ReportGreenBean bean1 = new ReportGreenBean();
                    bean1.setDate(sim.format(rs.getDate("t_date")));
                    bean1.setType(rs.getString("t_booktype"));
                    double money_in = rs.getDouble("money_in");
                    double money_out = rs.getDouble("money_out");
                    if (money_in == 0) {
                        bean1.setDp("");
                    } else {
                        bean1.setDp(NumberFormat.showDouble2(money_in));
                    }
                    if (money_out == 0) {
                        bean1.setWd("");
                    } else {
                        bean1.setWd(NumberFormat.showDouble2(money_out));
                    }
                    bean1.setBalance(NumberFormat.showDouble2(rs.getDouble("t_balance")));
                    bean1.setIn("" + rs.getInt("t_hoon"));
                    bean1.setLine(rs.getString("LineNo"));

                    listBean.add(bean1);

                    //update book
                    try {
                        String sql = "update cb_transaction_save "
                                + "set PrintChk='Y' "
                                + "where t_acccode='" + txtAccCode + "' "
                                + "and lineNo='" + bean1.getLine() + "' "
                                + "and printChk='N' and t_booktype<>'" + cBean.getLoanDocPrefix() + "' ";
                        MySQLConnect.exeUpdate(sql);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                        Log.write.error(e.getMessage());
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            Log.write.error(e.getMessage());
        }

        // print passbook
        v.printTransactionGreen2(listBean, true);
    }
}
