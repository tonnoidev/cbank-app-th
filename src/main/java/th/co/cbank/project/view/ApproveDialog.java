package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.log.Log;

public class ApproveDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(ApproveDialog.class);
    private String CUST_CODE;

    public ApproveDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initTable();
        txtSearch.requestFocus();
    }

    public String getCUST_CODE() {
        return CUST_CODE;
    }

    public void setCUST_CODE(String CUST_CODE) {
        this.CUST_CODE = CUST_CODE;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbApprove = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายชื่อสมาชิกที่มีสิทธิ์อนุมัติเงินกู้");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tbApprove.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสบัตรประชาชน", "ชื่อ", "นามสกุล", "อนุมัติได้ (กี่คน)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbApprove.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbApprove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbApproveMouseClicked(evt);
            }
        });
        tbApprove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbApproveKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbApprove);

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ค้นหาชื่อลูกค้า");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setCUST_CODE(null);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbApproveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbApproveMouseClicked
        if (evt.getClickCount() == 2) {
            int rowSelected = tbApprove.getSelectedRow();
            if (rowSelected != -1) {
                setCUST_CODE(tbApprove.getValueAt(rowSelected, 0).toString());
                dispose();
            }
        }
    }//GEN-LAST:event_tbApproveMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setCUST_CODE(null);
    }//GEN-LAST:event_formWindowClosing

    private void tbApproveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbApproveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int rowSelected = tbApprove.getSelectedRow();
            if (rowSelected != -1) {
                setCUST_CODE(tbApprove.getValueAt(rowSelected, 0).toString());
                dispose();
            }
        }
    }//GEN-LAST:event_tbApproveKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchCustomer();
    }//GEN-LAST:event_txtSearchKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbApprove;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tbApprove.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbApprove.setRowHeight(30);

        JTableHeader tHeader = tbApprove.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        DefaultTableModel model = (DefaultTableModel) tbApprove.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        try {
            String sql = "select p_custCode, p_custName,p_custsurname,ApproveLimit "
                    + "from cb_profile "
                    + "where ApproveLimit>0 "
                    + "and p_custCode<>'" + Value.CUST_CODE + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("p_custCode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custName")),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custSurname")),
                    rs.getInt("ApproveLimit")
                });
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }

    private void searchCustomer() {
        DefaultTableModel model = (DefaultTableModel) tbApprove.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        try {
            String sql = "select p_custCode, p_custName,p_custsurname,ApproveLimit "
                    + "from cb_profile "
                    + "where ApproveLimit>0 "
                    + "and p_custCode<>'" + Value.CUST_CODE + "' "
                    + "and p_custName like '%" + ThaiUtil.Unicode2ASCII(txtSearch.getText()) + "%'";
            System.out.println(sql);
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("p_custCode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custName")),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custSurname")),
                    rs.getInt("ApproveLimit")
                });
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }
}
