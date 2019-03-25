package th.co.cbank.project.view;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.MoneyToWord;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.AddressBean;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbBondsmanBean;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.ProfileBean;

public class PaperLoanJDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(PaperLoanJDialog.class);
    private final String LoanAccountCode;

    public PaperLoanJDialog(java.awt.Frame parent, boolean modal, String LoanAccountCode) {
        super(parent, modal);
        initComponents();

        this.LoanAccountCode = LoanAccountCode;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("พิมพ์สัญญา");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("พิมพ์สัญญาผู้ค้ำประกันแผ่นที่ 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("พิมพ์สัญญาผู้ค้ำประกันแผ่นที่ 1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("พิมพ์สัญญาการกู้ยืมเงิน");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        print1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        print2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        print3();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void print1() {
        try {
            Map p = new HashMap();
            BranchBean bBean = getBranchControl().getData();
            for (int i = 1; i <= 38; i++) {
                p.put("p" + i, "");
            }

            p.put("p1", bBean.getName());
            p.put("p2", "สัญญากู้เงิน");
            p.put("p3", bBean.getName());
            SimpleDateFormat simp = new SimpleDateFormat("dd MMMM yyyy");
            CbLoanAccountBean lBean = getLoanAccountControl().listLoanAccount(LoanAccountCode);
            if (lBean == null) {
                JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลผู้กู้ในระบบ ไม่สามารถออกเอกสารได้ กรุณาตรวจสอบ");
                return;
            }

            p.put("p4", simp.format(lBean.getLoan_docdate()));
            p.put("p5", lBean.getLoan_docno());

            ProfileBean pBean = getProfileControl().listCbProfile(Value.CUST_CODE);

            AddressBean aBean = getAddressControl().listProfileAddress(pBean.getP_custCode(), "1");
            if (aBean == null) {
                JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลที่อยู่ของผู้ต้องการทำสัญญาเงินกู้ !");
                return;
            }

            p.put("p6", pBean.getP_custName() + " " + pBean.getP_custSurname());
            p.put("p7", "" + pBean.getP_custAge());
            p.put("p8", aBean.getAddr_No());
            p.put("p9", aBean.getAddr_Moo());
            p.put("p10", aBean.getAddr_Soi());
            p.put("p11", aBean.getAddr_Road());
            p.put("p12", aBean.getAddr_Tambon());
            p.put("p13", aBean.getAddr_Aumphur());
            p.put("p14", aBean.getAddr_Province());
            p.put("p15", aBean.getAddr_Post());
            p.put("p16", aBean.getAddr_Tel());
            p.put("p17", aBean.getCust_Code());
            p.put("p18", DateFormat.getLocale_ddMMyyyy(pBean.getP_member_end()));
            p.put("p19", DateFormat.getLocale_ddMMyyyy(pBean.getCard_Expire()));
            p.put("p20", bBean.getName());
            p.put("p21", "-");

            CbLoanConfigBean cBean = getLoanConfigControl().listLoanConfig(lBean.getLoan_type());
            p.put("p22", cBean.getLoanName());
            p.put("p23", NumberFormat.showDouble2(lBean.getLoan_amount()));
            BigDecimal bg = new BigDecimal(lBean.getLoan_amount());
            p.put("p24", "(" + MoneyToWord.getBahtText(bg) + ")");
            p.put("p25", "");
            p.put("p26", NumberFormat.showDouble2(lBean.getLoan_interest()));
            p.put("p27", "" + lBean.getPeriod_pay());
            p.put("p28", NumberFormat.showDouble2(lBean.getPayPerAmount()));
            p.put("p29", "" + lBean.getPeriod_pay());
            SimpleDateFormat s1 = new SimpleDateFormat("dd/MMMM/yyyy");
            String[] dateStart = s1.format(lBean.getLoan_start_date()).split("/");
            p.put("p30", dateStart[0]);
            p.put("p31", dateStart[1]);
            p.put("p32", dateStart[2]);
            SimpleDateFormat s2 = new SimpleDateFormat("dd/MMMM/yyyy");
            String[] dateEnd = s2.format(lBean.getLoan_end_date()).split("/");
            p.put("p33", dateEnd[0]);
            p.put("p34", dateEnd[1]);
            p.put("p35", dateEnd[2]);
            p.put("p36", "" + cBean.getLoanPenaltyDay());
            p.put("p37", NumberFormat.showDouble2(cBean.getLoanPenaltyINT() / 12));
            p.put("p38", pBean.getP_custName() + " " + pBean.getP_custSurname());

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_LOAN_PAPER_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("สัญญากู้เงิน");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Log.write.error(e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }

    private void print2() {
        try {
            Map p = new HashMap();
            BranchBean bBean = getBranchControl().getData();
            for (int i = 1; i <= 41; i++) {
                p.put("p" + i, "");
            }

            p.put("p1", bBean.getName());
            p.put("p2", LoanAccountCode);
            p.put("p3", bBean.getName());

            CbLoanAccountBean lBean = getLoanAccountControl().listLoanAccount(LoanAccountCode);

            SimpleDateFormat simp = new SimpleDateFormat("dd MMMM yyyy");
            p.put("p4", simp.format(lBean.getLoan_docdate()));

            ArrayList<CbBondsmanBean> listBondsman = getCbBondsmanControl().listCbBondsman(LoanAccountCode);

            ProfileBean pBean = getProfileControl().listCbProfile(lBean.getCust_code());
            if (listBondsman.size() > 0) {
                CbBondsmanBean sbBean1 = (CbBondsmanBean) listBondsman.get(0);
                ProfileBean pBean1 = getProfileControl().listCbProfile(sbBean1.getIdcard());
                p.put("p5", pBean1.getP_custName() + " " + pBean1.getP_custSurname());
                p.put("p6", "" + pBean1.getP_custAge());
                p.put("p7", "" + pBean1.getP_custNation());
                AddressBean bean1 = getAddressControl().listProfileAddress(pBean1.getP_custCode(), "1");
                p.put("p8", "" + bean1.getAddr_No());
                p.put("p9", "" + bean1.getAddr_Moo());
                p.put("p10", "" + bean1.getAddr_Soi());
                p.put("p11", "" + bean1.getAddr_Road());
                p.put("p12", "" + bean1.getAddr_Tambon());
                p.put("p13", "" + bean1.getAddr_Aumphur());
                p.put("p14", "" + bean1.getAddr_Province());
                p.put("p15", "" + bean1.getAddr_Post());
                p.put("p16", "" + bean1.getAddr_Tel());
                p.put("p17", "" + pBean1.getP_custCode());
                p.put("p18", "" + DateFormat.getLocale_ddMMyyyy(pBean1.getCard_Expire()));

                if (listBondsman.size() > 1) {
                    CbBondsmanBean sbBean2 = (CbBondsmanBean) listBondsman.get(1);
                    ProfileBean pBean2 = getProfileControl().listCbProfile(sbBean2.getIdcard());
                    p.put("p19", pBean2.getP_custName() + " " + pBean2.getP_custSurname());
                    p.put("p20", "" + pBean2.getP_custAge());
                    p.put("p21", "" + pBean2.getP_custNation());
                    AddressBean bean2 = getAddressControl().listProfileAddress(pBean2.getP_custCode(), "1");
                    p.put("p22", "" + bean2.getAddr_No());
                    p.put("p23", "" + bean2.getAddr_Moo());
                    p.put("p24", "" + bean2.getAddr_Soi());
                    p.put("p25", "" + bean2.getAddr_Road());
                    p.put("p26", "" + bean2.getAddr_Tambon());
                    p.put("p27", "" + bean2.getAddr_Aumphur());
                    p.put("p28", "" + bean2.getAddr_Province());
                    p.put("p29", "" + bean2.getAddr_Post());
                    p.put("p30", "" + bean2.getAddr_Tel());
                    p.put("p31", "" + pBean2.getP_custCode());
                    p.put("p32", "" + DateFormat.getLocale_ddMMyyyy(pBean2.getCard_Expire()));

                    p.put("p33", pBean.getP_custName() + " " + pBean.getP_custSurname());
                    p.put("p37", pBean.getP_custName() + " " + pBean.getP_custSurname());
                    p.put("p34", pBean.getP_custCode());
                    p.put("p38", NumberFormat.showDouble2(lBean.getLoan_amount()));
                    MoneyToWord m = new MoneyToWord(lBean.getLoan_amount());
                    p.put("p39", "(" + m.toString() + ")");
                    p.put("p40", lBean.getLoan_docno());
                    p.put("p41", DateFormat.getLocale_ddMMyyyy(lBean.getLoan_docdate()));

                    p.put("p35", pBean1.getP_custName() + " " + pBean1.getP_custSurname());
                    p.put("p36", pBean2.getP_custName() + " " + pBean2.getP_custSurname());
                }
            }

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_LOAN_PAPER_GARUNTEE_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("สัญญาค้ำประกันการกู้ยืมเงิน ฉบับที่ 1");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Log.write.error(e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }

    private void print3() {
        try {
            Map p = new HashMap();
            p.put("p42", "");

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_LOAN_PAPER_GARUNTEE_REPORT_2));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("สัญญาค้ำประกันการกู้ยืมเงิน ฉบับที่ 2");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Log.write.error(e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }
}
