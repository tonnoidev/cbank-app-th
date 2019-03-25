package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.util.NumberUtil;
import th.co.cbank.util.TableUtil;

public class SaveAccountDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(SaveAccountDialog.class);
    private DefaultTableModel model;

    public SaveAccountDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        initTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("บัญชีเงินฝาก");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ออก (Close)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ระบุข้อมูลในการค้นหา");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        tbData.setAutoCreateRowSorter(true);
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "เลขที่บัญชี", "รหัสลูกค้า", "ชื่อลูกค้า", "จำนวนเงินฝาก"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tbData);
        if (tbData.getColumnModel().getColumnCount() > 0) {
            tbData.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbData.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbData.getColumnModel().getColumn(2).setPreferredWidth(120);
            tbData.getColumnModel().getColumn(3).setPreferredWidth(250);
            tbData.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setText("ค้นหา");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lbTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTotal.setText("รวมทั้งหมด 0 รายการ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbTotal)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTotal)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            loadData();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadData();
    }//GEN-LAST:event_btnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbData;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        int size = model.getRowCount();
        for(int i=0;i<size;i++){
            model.removeRow(0);
        }
                
        List<CbSaveAccountBean> listAccount = getSaveAccountControl().searchSaveAccount(ThaiUtil.Unicode2ASCII(txtSearch.getText()));
        for(int i=0;i<listAccount.size();i++){
            CbSaveAccountBean saveAcc = (CbSaveAccountBean)listAccount.get(i);
            System.out.println(saveAcc);
            model.addRow(new Object[]{
                (i+1),
                saveAcc.getAccount_code(),
                saveAcc.getB_CUST_CODE(),
                ThaiUtil.ASCII2Unicode(saveAcc.getB_CUST_NAME()+" "+saveAcc.getB_CUST_LASTNAME()),
                NumberUtil.toNumberFormat(saveAcc.getB_BALANCE())
            });
        }
        
        TableUtil.alignTable(tbData, 0, SwingConstants.CENTER);
        TableUtil.alignTable(tbData, 4, SwingConstants.RIGHT);
        
        lbTotal.setText("รวมทั้งหมด "+model.getRowCount()+" รายการ");
    }

    private void initTable() {
        model = (DefaultTableModel)tbData.getModel();
        tbData.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        JTableHeader tHeader = tbData.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbData.setRowHeight(30);
    }
}
