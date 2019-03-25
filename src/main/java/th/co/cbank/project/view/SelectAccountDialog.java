package th.co.cbank.project.view;

import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.Value;

public class SelectAccountDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(SelectAccountDialog.class);
    private String accountCode = "";

    public SelectAccountDialog(java.awt.Frame parent, boolean modal, String accountType) {
        super(parent, modal);
        initComponents();
        Value.CUST_ACCOUNT_CODE = null;
        if (accountType.equals("1")) {//บัญชีเงินฝาก
            int count = 0;

            try {
                String sql = "select account_code "
                        + "from cb_save_account "
                        + "where b_cust_code='" + Value.CUST_CODE + "' "
                        + "and account_status<>'8'";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                ltAccountList.removeAll();
                DefaultListModel model = new DefaultListModel();

                while (rs.next()) {
                    count++;
                    accountCode = rs.getString("account_code");
                    model.addElement(rs.getString("account_code"));
                }
                ltAccountList.setModel(model);

                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                e.printStackTrace();
            }

            if (count == 1) {
                setAccountCode(accountCode);
                dispose();
            }

        } else if (accountType.equals("2")) {//บัญชีเงินกู้
            int count = 0;
            try {
                String sql = "select loan_docno from cb_loan_account "
                        + "where cust_code='" + Value.CUST_CODE + "'";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                ltAccountList.removeAll();
                DefaultListModel model = new DefaultListModel();

                while (rs.next()) {
                    count++;
                    accountCode = rs.getString("loan_docno");
                    model.addElement(rs.getString("loan_docno"));
                }

                ltAccountList.setModel(model);

                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                e.printStackTrace();
            }
            
            if (count == 1) {
                setAccountCode(accountCode);
                dispose();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltAccountList = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("เลือกบัญชีเพื่อทำรายการ");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        ltAccountList.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ltAccountList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ltAccountList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltAccountListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ltAccountList);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("เลือกเลขที่บัญชี");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ยกเลิก (Close)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ltAccountListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltAccountListMouseClicked
        int rowSelected = ltAccountList.getSelectedIndex();
        if (rowSelected != -1) {
            setAccountCode(ltAccountList.getSelectedValue().toString());
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกบัญชี !");
            ltAccountList.requestFocus();
        }
    }//GEN-LAST:event_ltAccountListMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setAccountCode("");
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList ltAccountList;
    // End of variables declaration//GEN-END:variables

    public void setAccountCode(String accCode) {
        this.accountCode = accCode;
    }

    public String getAccontCode() {
        return this.accountCode;
    }
}
