package th.co.cbank.project.report.view;

import com.sun.glass.ui.Cursor;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.ViewReport;

public class ReportInvoiceHoon extends javax.swing.JDialog {

    private DefaultTableModel model;

    public ReportInvoiceHoon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        model = (DefaultTableModel) tableData.getModel();
        initTable();
        setLocation(0, 0);
        setSize(parent.getMaximumSize());
        txtIdCard.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtIdCard = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAccountCode = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnPrintAll = new javax.swing.JButton();
        lbMsg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("หนังสือแจ้งเงินกู้และค่าหุ้น");

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ชื่อบัญชี", "เลขที่บัญชี", "วันที่กู้", "วันครบกำหนดชำระ", "เงินกู้คงเหลือ", "ยอดชำระแล้ว", "ดอกเบี้ย", "หุ้นถือครอง", "มูลค่าหุ้น (บาท)", "บัตรประชาชน", "ที่อยู่"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);
        if (tableData.getColumnModel().getColumnCount() > 0) {
            tableData.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableData.getColumnModel().getColumn(1).setPreferredWidth(130);
            tableData.getColumnModel().getColumn(2).setPreferredWidth(120);
            tableData.getColumnModel().getColumn(3).setPreferredWidth(150);
            tableData.getColumnModel().getColumn(4).setPreferredWidth(120);
            tableData.getColumnModel().getColumn(5).setPreferredWidth(120);
            tableData.getColumnModel().getColumn(6).setPreferredWidth(100);
            tableData.getColumnModel().getColumn(7).setPreferredWidth(100);
            tableData.getColumnModel().getColumn(8).setPreferredWidth(150);
            tableData.getColumnModel().getColumn(9).setPreferredWidth(120);
            tableData.getColumnModel().getColumn(10).setPreferredWidth(250);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtIdCard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdCardKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("บัตรประชาชน :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("เลขที่บัญชี :");

        txtAccountCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccountCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccountCodeKeyPressed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFind.setText("ค้นหาข้อมูล");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAccountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFind)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClose.setBackground(new java.awt.Color(204, 51, 0));
        btnClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClose.setText("ปิดหน้าต่าง");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnPrintAll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintAll.setText("พิมพ์ข้อมูล");
        btnPrintAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintAllActionPerformed(evt);
            }
        });

        lbMsg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMsg.setText("ข้อมูลทั้งหมด 0 รายการ");

        jMenu1.setText("แฟ้มข้อมูล");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("พิมพ์ข้อมูลทั้งหมด");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbMsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrintAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrintAll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMsg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtIdCardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCardKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAccountCode.requestFocus();
        }
    }//GEN-LAST:event_txtIdCardKeyPressed

    private void btnPrintAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintAllActionPerformed
        printRow();
    }//GEN-LAST:event_btnPrintAllActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        find();
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtAccountCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountCodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountCodeKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int iCon = JOptionPane.showConfirmDialog(this, "ท่านต้องการพิมพ์ข้อมูลทั้งหมด " + tableData.getRowCount() + " รายการใช่หรือไม่ !");
        if (iCon == JOptionPane.YES_OPTION) {
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            printAll();
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        if (evt.getClickCount() == 2) {
            printRow();
        }
    }//GEN-LAST:event_tableDataMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnPrintAll;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMsg;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtAccountCode;
    private javax.swing.JTextField txtIdCard;
    // End of variables declaration//GEN-END:variables

    private void printPerson(String idCard, String accCode, String address) {
        ViewReport view = new ViewReport();
        Map m = new HashMap();
        m.put("date", DateFormat.getEnglish_ddMMyyyy(new Date()));
        m.put("idCard", idCard);
        m.put("accountNo", accCode);
        m.put("address", address);
        view.printSample(m, AppConstants.JASPER_INVOICE_HOON_REPORT);
    }

    private void printAll() {
        ViewReport view = new ViewReport();
        List<Map> listMap = new ArrayList<>();
        for (int i = 0; i < tableData.getRowCount(); i++) {
            Map m = new HashMap();
            m.put("date", DateFormat.getEnglish_ddMMyyyy(new Date()));
            m.put("idCard", "" + tableData.getValueAt(i, 9));
            m.put("accountNo", "" + tableData.getValueAt(i, 1));
            m.put("address", "" + tableData.getValueAt(i, 10));
            listMap.add(m);
        }

        view.printReport(listMap, AppConstants.JASPER_INVOICE_HOON_REPORT);
    }

    private void find() {
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        String sql = "select p.p_custcode, concat(p_custname, ' ', p_custsurname) name, "
                + "loan_docno, loan_docdate, loan_amount, '0.00' loan_interest, loan_datepay, "
                + "pay_amount, (select concat(addr_no, ' " + toStr("หมู่") + "', addr_moo, ' ', addr_road, ' ', addr_soi, "
                + "' " + toStr("ตำบล") + "', addr_tambon, ' " + toStr("อำเภอ") + "', addr_aumphur, ' " + toStr("จังหวัด") + "', addr_province, ' " + toStr("รหัสไปรษณีย์") + " ', addr_post) address "
                + "from cb_profile_address where cust_code=a.cust_code limit 0,1 "
                + ") address, hoon_qty,"
                + "(select hoonrate from cb_hoon_config limit 0,1) hoonrate "
                + "from cb_loan_account a "
                + "inner join cb_profile p on a.cust_code=p.p_custcode "
                + "where 1=1 ";
        try {
            if (!txtIdCard.getText().equals("")) {
                sql += "and a.cust_code='" + txtIdCard.getText() + "' ";
            }
            if (!txtAccountCode.getText().equals("")) {
                sql += "and a.loan_docno='" + txtAccountCode.getText() + "' ";
            }

            sql += "order by p_custcode, loan_docno";
            System.out.println(sql);
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    ThaiUtil.ASCII2Unicode(rs.getString("name")),
                    rs.getString("loan_docno"),
                    rs.getDate("loan_docdate"),
                    rs.getDate("loan_datepay"),
                    NumberFormat.showDouble2(rs.getDouble("loan_amount")),
                    NumberFormat.showDouble2(rs.getDouble("pay_amount")),
                    NumberFormat.showDouble2(rs.getDouble("loan_interest")),
                    NumberFormat.showDouble2(rs.getInt("hoon_qty")),
                    NumberFormat.showDouble2(rs.getInt("hoon_qty") * rs.getInt("hoonrate")),
                    rs.getString("p_custcode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("address"))
                });
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        lbMsg.setText("ข้อมูลทั้งหมด " + model.getRowCount() + " รายการ");
    }

    private void initTable() {
        tableData.setFont(new Font("Tahoma", Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tableData.setRowHeight(30);

        JTableHeader tHeader = tableData.getTableHeader();
        tHeader.setFont(new Font("Tahoma", Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        tableData.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tableData.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
        tableData.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
        tableData.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
        tableData.getColumnModel().getColumn(8).setCellRenderer(rightRenderer);
    }

    private void printRow() {
        if (tableData.getSelectedRow() != -1) {
            String idCard = "" + tableData.getValueAt(tableData.getSelectedRow(), 9);
            String accountCode = "" + tableData.getValueAt(tableData.getSelectedRow(), 1);
            String address = "" + tableData.getValueAt(tableData.getSelectedRow(), 10);
            printPerson(idCard, accountCode, address);
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกข้อมูลที่ต้องการพิมพ์");
        }
    }

    private String toStr(String str) {
        return ThaiUtil.Unicode2ASCII(str);
    }
}
