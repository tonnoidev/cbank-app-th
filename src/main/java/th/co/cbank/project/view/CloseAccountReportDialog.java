package th.co.cbank.project.view;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.ViewReport;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.util.DateChooseDialog;

public class CloseAccountReportDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(CloseAccountReportDialog.class);

    private final DecimalFormat dec = new DecimalFormat("#,##0.00");
    private final Frame parent;
    private String sqlAll;

    public CloseAccountReportDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.parent = parent;

        initTable();

        setLocation(0, 0);
        setSize(parent.getMaximumSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtTotalPeople = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotalFee = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDate2 = new javax.swing.JTextField();
        txtDate1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานการปิดบัญชี");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("รายงานการปิดบัญชี");

        tableData.setAutoCreateRowSorter(true);
        tableData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "วันที่ปิด", "เวลา", "ชื่อ-สกุล", "เลขที่บัญชี", "คงเหลือก่อนปิด บช.", "คงเหลือเมื่อปิด บช.", "พนักงาน", "สาขา"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tableData);
        if (tableData.getColumnModel().getColumnCount() > 0) {
            tableData.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableData.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableData.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableData.getColumnModel().getColumn(3).setPreferredWidth(150);
            tableData.getColumnModel().getColumn(4).setPreferredWidth(100);
            tableData.getColumnModel().getColumn(5).setPreferredWidth(150);
            tableData.getColumnModel().getColumn(6).setPreferredWidth(150);
            tableData.getColumnModel().getColumn(7).setPreferredWidth(100);
            tableData.getColumnModel().getColumn(8).setPreferredWidth(200);
        }

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("จำนวนรายการ");

        txtTotalPeople.setEditable(false);
        txtTotalPeople.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalPeople.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalPeople.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPeople.setText("0");
        txtTotalPeople.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("ค่าธรรมเนียม");

        txtTotalFee.setEditable(false);
        txtTotalFee.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalFee.setText("0");
        txtTotalFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(594, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtTotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ข้อมูลสำหรับค้นหา", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("ออก (Exit)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnShowAll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnShowAll.setText("แสดงข้อมูล");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExport.setText("พิมพ์รายงาน");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);

        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("วันที่ปิดบัญชี");

        txtDate2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtDate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDate1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDate1KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("ถึง");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        showAll();
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        if (sqlAll != null) {
            if (!sqlAll.equals("")) {
                exportReport();
            }
        }
    }//GEN-LAST:event_btnExportActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Point point = txtDate1.getLocationOnScreen();
        point.setLocation(point.getX() + txtDate1.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDate1.setText(dcd.getDateString());
            txtDate1.requestFocus();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Point point = txtDate2.getLocationOnScreen();
        point.setLocation(point.getX() + txtDate2.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDate2.setText(dcd.getDateString());
            txtDate2.requestFocus();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtDate1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDate1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtDate1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnShowAll;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtDate2;
    private javax.swing.JTextField txtTotalFee;
    private javax.swing.JTextField txtTotalPeople;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tableData.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tableData.setRowHeight(30);

        JTableHeader tHeader = tableData.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tableData.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        SimpleDateFormat simp1 = new SimpleDateFormat("dd/MM/yyyy");
        txtDate1.setText(simp1.format(new Date()));
        txtDate2.setText(simp1.format(new Date()));
    }

    private void showAll() {
        DefaultTableModel model = (DefaultTableModel) tableData.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        String sql = " select t_date, t_time, t_acccode, t_amount, t_balance,"
                + " concat(s.b_cust_name, ' ', s.b_cust_lastname) cust_name, t.t_empcode, t.branch_code "
                + " from cb_transaction_save t "
                + " inner join cb_save_account s on t.t_acccode = s.account_code "
                + " where 1=1 "
                + " and t_status='" + AppConstants.CB_STATUS_CLOSE_SAVE + "' ";
        if (!txtDate1.getText().equals("") && !txtDate2.getText().equals("")) {
            Date date1 = DateFormat.getLocal_ddMMyyyy(txtDate1.getText());
            Date date2 = DateFormat.getLocal_ddMMyyyy(txtDate2.getText());
            sql += " and t_date between '" + DateFormat.getMySQL_Date(date1) + "' and '" + DateFormat.getMySQL_Date(date2) + "' ";
        }

        sqlAll = sql;

        double totalFee = 0.0;
        int countCust = 0;
        try {
            ResultSet rs = MySQLConnect.getResultSet(sql);
            int count = 0;
            while (rs.next()) {
                count++;
                countCust++;
                model.addRow(new Object[]{
                    count,
                    DateFormat.getLocale_ddMMyyyy(rs.getDate("t_date")),
                    rs.getString("t_time"),
                    ThaiUtil.ASCII2Unicode(rs.getString("cust_name")),
                    rs.getString("t_acccode"),
                    NumberFormat.showDouble2(Math.abs(rs.getDouble("t_amount"))),
                    NumberFormat.showDouble2(rs.getDouble("t_balance")),
                    rs.getString("t_empcode"),
                    rs.getString("branch_code")
                });
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        txtTotalFee.setText(NumberFormat.showDouble2(totalFee));
        txtTotalPeople.setText("" + countCust);
    }

    private void exportReport() {
        ViewReport view = new ViewReport();
        Map m = new HashMap();
        BranchBean bean = getBranchControl().getData();
        m.put("BranchName", bean.getName());
        m.put("sql", sqlAll);
        view.printSample(m, AppConstants.JASPER_CLOSE_ACCOUNT_REPORT);
    }

}
