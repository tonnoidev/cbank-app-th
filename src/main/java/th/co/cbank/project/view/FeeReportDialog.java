package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.JTableUtil;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.ViewReport;

public class FeeReportDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(FeeReportDialog.class);
    private String sqlAll;

    public FeeReportDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        loadData();
        
        setLocation(0, 0);
        setSize(parent.getMaximumSize());
        
        jTable1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbFeeTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานค่าธรรมเนียมต่าง ๆ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("รายงานค่าธรรมเนียมต่าง ๆ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "ชื่อค่าธรรมเนียม", "จำนวนเงิน", "ชำระที่สาขา", "รหัสพนักงาน", "รหัสลูกค้า", "วันที่", "เวลา"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(55);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ออก (Close)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("พิมพ์รายงาน");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ีรวมค่าธรรมเนียม");

        lbFeeTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbFeeTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFeeTotal.setText("0.00");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("บาท");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lbFeeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbFeeTotal)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        exportReport();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_jTable1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbFeeTotal;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        jTable1.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        jTable1.setRowHeight(30);

        JTableHeader tHeader = jTable1.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        JTableUtil.alignCenter(jTable1, 0);
        JTableUtil.alignCenter(jTable1, 3);
        JTableUtil.alignCenter(jTable1, 4);
        JTableUtil.alignCenter(jTable1, 5);
        JTableUtil.alignRight(jTable1, 2);

        double total = 0.00;
        try {
            String sql = "select * from cb_fee_transaction "
                    + "order by fee_date, fee_time";
            sqlAll = sql;
            ResultSet rs = MySQLConnect.getResultSet(sql);
            int count = 0;
            while(rs.next()){
                count++;
                model.addRow(new Object[]{
                    count,
                    ThaiUtil.ASCII2Unicode(rs.getString("fee_desc")),
                    NumberFormat.showDouble2(rs.getDouble("fee_amount")),
                    rs.getString("fee_branch"),
                    rs.getString("fee_emp_code"),
                    rs.getString("fee_cust_code"),                    
                    DateFormat.getLocale_ddMMyyyy(rs.getDate("fee_date")),
                    rs.getString("fee_time")
                });
                total+=rs.getDouble("fee_amount");
            }
            
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        lbFeeTotal.setText(NumberFormat.showDouble2(total));
    }

    private void exportReport() {
        ViewReport view = new ViewReport();
        Map m = new HashMap();
        m.put("sql", sqlAll);
        view.printSample(m, AppConstants.JASPER_FEE_TRAN_REPORT);
    }
}
