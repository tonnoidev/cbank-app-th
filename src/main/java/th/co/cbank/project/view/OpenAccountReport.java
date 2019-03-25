package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import th.co.cbank.project.model.CbSaveConfigBean;
import th.co.cbank.util.DateChooseDialog;

public class OpenAccountReport extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(OpenAccountReport.class);

    private final DecimalFormat dec = new DecimalFormat("#,##0.00");
    private final Frame parent;
    private String sqlAll;

    public OpenAccountReport(java.awt.Frame parent, boolean modal) {
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
        tbTransaction = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtTotalPeople = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotalFee = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cbAccType = new javax.swing.JComboBox();
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
        setTitle("รายงานการเปิดบัญชี");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("รายงานการเปิดบัญชี");

        tbTransaction.setAutoCreateRowSorter(true);
        tbTransaction.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "วันที่", "เลขที่บัญชี", "ประเภทบัญชี", "ค่าธรรมเนียม", "ประเภทสมาชิก", "ชื่อ-สกุล", "พนักงาน", "สาขา"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTransaction.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tbTransaction);
        if (tbTransaction.getColumnModel().getColumnCount() > 0) {
            tbTransaction.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbTransaction.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbTransaction.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbTransaction.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbTransaction.getColumnModel().getColumn(4).setPreferredWidth(120);
            tbTransaction.getColumnModel().getColumn(5).setPreferredWidth(220);
            tbTransaction.getColumnModel().getColumn(6).setPreferredWidth(200);
            tbTransaction.getColumnModel().getColumn(7).setPreferredWidth(100);
            tbTransaction.getColumnModel().getColumn(8).setPreferredWidth(200);
        }

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("จำนวนคน");

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
        txtTotalFee.setText("0.00");
        txtTotalFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(726, 726, 726)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("เลือกประเภทบัญชี");

        cbAccType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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
        jLabel4.setText("วันที่เปิดบัญชี");

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
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JComboBox cbAccType;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTransaction;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtDate2;
    private javax.swing.JTextField txtTotalFee;
    private javax.swing.JTextField txtTotalPeople;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tbTransaction.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbTransaction.setRowHeight(30);

        JTableHeader tHeader = tbTransaction.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tbTransaction.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        SimpleDateFormat simp1 = new SimpleDateFormat("dd/MM/yyyy");
        txtDate1.setText(simp1.format(new Date()));
        txtDate2.setText(simp1.format(new Date()));

        ArrayList<CbSaveConfigBean> listBean = getSaveConfigControl().listSaveConfig();
        cbAccType.removeAllItems();
        cbAccType.addItem("เลือกทั้งหมด");
        for (int i = 0; i < listBean.size(); i++) {
            CbSaveConfigBean bBean = (CbSaveConfigBean) listBean.get(i);
            cbAccType.addItem(bBean.getTypeCode() + " - " + bBean.getTypeName());
        }

    }

    private void showAll() {
        DefaultTableModel model = (DefaultTableModel) tbTransaction.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        try {
            String sql = "select b_start, account_code, type_name,b_fee,typeName,"
                    + "concat(b_cust_name,' ', b_cust_lastname) cust_name,emp_code,branch_code "
                    + "from cb_save_account a, cb_save_config s,cb_member_type m "
                    + "where a.account_type=s.typecode "
                    + "and a.member_type=m.type_code ";

            if (cbAccType.getSelectedIndex() > 0) {
                String[] data = cbAccType.getSelectedItem().toString().split("-");
                sql += " and account_type='" + data[0].trim() + "' ";
            }

            if (!txtDate1.getText().equals("") && !txtDate2.getText().equals("")) {
                Date date1 = DateFormat.getLocal_ddMMyyyy(txtDate1.getText());
                Date date2 = DateFormat.getLocal_ddMMyyyy(txtDate2.getText());
                sql += " and b_start between '" + DateFormat.getMySQL_Date(date1) + "' and '" + DateFormat.getMySQL_Date(date2) + "' ";
            }

            sqlAll = sql;
            ResultSet rs = MySQLConnect.getResultSet(sql);
            int count = 0;
            while (rs.next()) {
                count++;
                model.addRow(new Object[]{
                    count,
                    DateFormat.getLocale_ddMMyyyy(rs.getDate("b_start")),
                    rs.getString("account_code"),
                    ThaiUtil.ASCII2Unicode(rs.getString("type_name")),
                    NumberFormat.showDouble2(rs.getDouble("b_fee")),
                    ThaiUtil.ASCII2Unicode(rs.getString("typeName")),
                    ThaiUtil.ASCII2Unicode(rs.getString("cust_name")),
                    rs.getString("emp_code"),
                    rs.getString("branch_code")
                });

            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        double totalFee = 0.0;
        int countCust = 0;

        txtTotalFee.setText(NumberFormat.showDouble2(totalFee));
        txtTotalPeople.setText("" + countCust);
    }

    private void exportReport() {
        ViewReport view = new ViewReport();
        Map m = new HashMap();
        BranchBean bean = getBranchControl().getData();
        m.put("BranchName", bean.getName());
        m.put("sql", sqlAll);
        view.printSample(m, AppConstants.JASPER_OPEN_ACCOUNT_REPORT);
    }

}
