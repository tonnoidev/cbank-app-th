package th.co.cbank.project.view;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.JTableUtil;
import th.co.cbank.util.DateFormat;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.model.CbMemberTypeBean;
import th.co.cbank.project.model.ProfileMapping;
import th.co.cbank.util.DateChooseDialog;
import th.co.cbank.util.ExcelUtil;

public class ProfileListDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(ProfileListDialog.class);
    private final Frame parent;

    public ProfileListDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.parent = parent;

        init();

        setLocation(0, 0);
        setSize(parent.getMaximumSize());

        jTable1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbMemberType = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDate1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDate2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานทะเบียนสมาชิก");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสบัตร/กลุ่ม", "ชื่อ", "นามสกุล", "อายุ", "วันที่สมัคร", "ประเภทสมาชิก", "เงินฝาก", "บัญชีเงินฝาก", "หุ้น", "เงินกู้", "บัญชีเงินกู้", "สิทธิ์ค้ำ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(65);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(145);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(155);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(150);
        }

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("ออก (Exit)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("รายงานทะเบียนสมาชิก");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("ค้นหาข้อมูล");

        cbMemberType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("แสดงข้อมูล");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("สมาชิกรายบุคคล");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("สมาชิกรายกลุ่ม");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("คน");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("กลุ่ม");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("เลือกวันที่สมัคร");

        txtDate1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("ถึง");

        txtDate2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDate2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Export Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMemberType, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cbMemberType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        loadData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Point point = txtDate1.getLocationOnScreen();
        point.setLocation(point.getX() + txtDate1.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDate1.setText(dcd.getDateString());
            txtDate1.requestFocus();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Point point = txtDate2.getLocationOnScreen();
        point.setLocation(point.getX() + txtDate2.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDate2.setText(dcd.getDateString());
            txtDate2.requestFocus();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rows = jTable1.getSelectedRow();
        if (rows != -1) {

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ExcelUtil excel = new ExcelUtil();
            excel.setOutputFile("test.xls");
            excel.write((DefaultTableModel) jTable1.getModel(), "Report-1", new int[]{7,9,10});
            Desktop.getDesktop().open(new File("test.xls"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbMemberType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtDate2;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        Date d1 = DateFormat.getLocal_ddMMyyyy(txtDate1.getText());
        String sql = "select p.*, group_concat(account_code) listAcc, group_concat(loan_docno) listLoan "
                + "from cb_profile p left join cb_save_account s on p.p_custcode=s.b_cust_code "
                + "left join cb_loan_account l on p.p_custcode=l.cust_code "
                + "where 1=1 "
                + "and p_member_start >= '" + DateFormat.getMySQL_Date(d1) + "' ";
        if (cbMemberType.getSelectedIndex() != 0) {
            sql += " and p_member_type='" + cbMemberType.getSelectedIndex() + "' ";
        }

        sql += " group by p.p_custCode order by p.p_index ";

        ArrayList<ProfileMapping> listProfile = getProfileControl().searchProfile(sql);
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < listProfile.size(); i++) {
            ProfileMapping bean = (ProfileMapping) listProfile.get(i);
            CbMemberTypeBean mBean = getMemberTypeControl().listMemberType(bean.getProfileBean().getP_member_type());
            if (bean.getProfileBean().getP_member_type() == null) {
                bean.getProfileBean().setP_member_type("1");
            }
            switch (bean.getProfileBean().getP_member_type()) {
                case "1":
                    i1++;
                    break;
                case "2":
                    i2++;
                    break;
            }
            model.addRow(new Object[]{
                bean.getProfileBean().getP_index(),
                bean.getProfileBean().getP_custCode(),
                bean.getProfileBean().getP_custName(),
                bean.getProfileBean().getP_custSurname(),
                bean.getProfileBean().getP_custAge(),
                DateFormat.getLocale_ddMMyyyy(bean.getProfileBean().getP_member_start()),
                mBean.getTypeName(),
                bean.getProfileBean().getSave_Balance(),
                bean.getListAcc(),
                bean.getProfileBean().getHoon_Qty(),
                bean.getProfileBean().getLoan_Balance(),
                bean.getListLoan(),
                bean.getProfileBean().getApproveLimit()
            });
        }

        JTableUtil.sortDouble(jTable1, 7);
        JTableUtil.sortDouble(jTable1, 10);

        jTextField1.setText("" + i1);
        jTextField2.setText("" + i2);
    }

    private void init() {
        jTable1.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        jTable1.setRowHeight(30);

        JTableHeader tHeader = jTable1.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        JTableUtil.alignCenter(jTable1, 0);
        JTableUtil.alignCenter(jTable1, 1);
        JTableUtil.alignCenter(jTable1, 4);
        JTableUtil.alignCenter(jTable1, 5);
        JTableUtil.alignCenter(jTable1, 6);
        JTableUtil.alignCenter(jTable1, 10);

        JTableUtil.alignRight(jTable1, 7);
        JTableUtil.alignRight(jTable1, 8);
        JTableUtil.alignRight(jTable1, 9);

        ArrayList<CbMemberTypeBean> listM = getMemberTypeControl().listMemberType();
        cbMemberType.addItem("เลือกทั้งหมด");
        for (int i = 0; i < listM.size(); i++) {
            CbMemberTypeBean mBean = (CbMemberTypeBean) listM.get(i);
            cbMemberType.addItem(mBean.getTypeName());
        }

        txtDate1.setText("01/01/2558");
        txtDate2.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
    }

    private void updateMasterStartMember() {
        try {
            String sql = "select b_cust_code, b_start from cb_save_account group by b_cust_code";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                String b_cust_code = rs.getString("b_cust_code");
                String b_start = rs.getString("b_start");
                try {
                    String sql2 = "update cb_profile set "
                            + "p_member_start='" + b_start + "' "
                            + "where p_custcode='" + b_cust_code + "'";
                    MySQLConnect.exeUpdate(sql2);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                    e.printStackTrace();
                }
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
}
