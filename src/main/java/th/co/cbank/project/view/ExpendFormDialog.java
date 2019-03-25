package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.CbExpenseControl;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.CbExpTransactionBean;
import th.co.cbank.project.model.CbExpenseBean;
import th.co.cbank.util.DateChooseDialog;

public class ExpendFormDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(ExpendFormDialog.class);
    private Frame parent;

    public ExpendFormDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.parent = parent;

        loadData();
        loadDataTransaction();
        
        BRANCH_CODE.setText(Value.BRANCH_CODE);
        EMP_CODE.setText(Value.USER_CODE);
        EXP_DATE.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        
        EXP_DOC.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbExpendsTransaction = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        EMP_CODE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EMP_AMOUNT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BRANCH_CODE = new javax.swing.JTextField();
        EXP_TYPE = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        EXP_DATE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EXP_DOC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("บันทึกค่าใช้จ่าย");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("บันทึกรายการค่าใช้จ่ายต่าง ๆ  ในกิจการ");

        tbExpendsTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "วันที่เอกสาร", "สาขา", "พนักงาน", "ค่าใช้จ่าย", "จำนวนเงิน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbExpendsTransaction);

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("ออก (Close)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        EMP_CODE.setEditable(false);
        EMP_CODE.setBackground(new java.awt.Color(255, 255, 204));
        EMP_CODE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EMP_CODE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        EMP_CODE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EMP_CODEKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("เลือกค่าใช้จ่าย");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("จำนวนเงิน");

        EMP_AMOUNT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EMP_AMOUNT.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        EMP_AMOUNT.setText("0.00");
        EMP_AMOUNT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        EMP_AMOUNT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EMP_AMOUNTFocusGained(evt);
            }
        });
        EMP_AMOUNT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EMP_AMOUNTKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("วันที่เอกสาร");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("บาท");

        BRANCH_CODE.setEditable(false);
        BRANCH_CODE.setBackground(new java.awt.Color(255, 255, 204));
        BRANCH_CODE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BRANCH_CODE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        BRANCH_CODE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BRANCH_CODEKeyPressed(evt);
            }
        });

        EXP_TYPE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EXP_TYPE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EXP_TYPEKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("สาขาที่ทำรายการ");

        EXP_DATE.setEditable(false);
        EXP_DATE.setBackground(new java.awt.Color(255, 255, 204));
        EXP_DATE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EXP_DATE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        EXP_DATE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EXP_DATEKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("พนักงานทำรายการ");

        EXP_DOC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EXP_DOC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        EXP_DOC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EXP_DOCKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("เลขที่เอกสาร");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("บันทึก");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setText("ยกเลิก");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDate.setText("...");
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(EXP_TYPE, javax.swing.GroupLayout.Alignment.LEADING, 0, 129, Short.MAX_VALUE)
                    .addComponent(EXP_DOC)
                    .addComponent(BRANCH_CODE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EMP_AMOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(EXP_DATE)
                    .addComponent(EMP_CODE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDate)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EXP_DOC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(EXP_DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(EMP_CODE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BRANCH_CODE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(EXP_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(EMP_AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed
        Point point = EXP_DATE.getLocationOnScreen();
        point.setLocation(point.getX() + EXP_DATE.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            EXP_DATE.setText(dcd.getDateString());
            EXP_DATE.requestFocus();
        }
    }//GEN-LAST:event_btnDateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(!EXP_DOC.getText().equals("")){
            saveData();
        }else{
            EXP_DOC.requestFocus();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void EXP_DOCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EXP_DOCKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            EXP_DATE.requestFocus();
        }
    }//GEN-LAST:event_EXP_DOCKeyPressed

    private void EXP_DATEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EXP_DATEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BRANCH_CODE.requestFocus();
        }
    }//GEN-LAST:event_EXP_DATEKeyPressed

    private void BRANCH_CODEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BRANCH_CODEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            EMP_CODE.requestFocus();
        }
    }//GEN-LAST:event_BRANCH_CODEKeyPressed

    private void EMP_CODEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EMP_CODEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            EXP_TYPE.requestFocus();
        }
    }//GEN-LAST:event_EMP_CODEKeyPressed

    private void EXP_TYPEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EXP_TYPEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            EMP_AMOUNT.requestFocus();
        }
    }//GEN-LAST:event_EXP_TYPEKeyPressed

    private void EMP_AMOUNTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EMP_AMOUNTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSave.requestFocus();
        }
    }//GEN-LAST:event_EMP_AMOUNTKeyPressed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveActionPerformed(null);
        }
    }//GEN-LAST:event_btnSaveKeyPressed

    private void EMP_AMOUNTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EMP_AMOUNTFocusGained
        EMP_AMOUNT.selectAll();
    }//GEN-LAST:event_EMP_AMOUNTFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BRANCH_CODE;
    private javax.swing.JTextField EMP_AMOUNT;
    private javax.swing.JTextField EMP_CODE;
    private javax.swing.JTextField EXP_DATE;
    private javax.swing.JTextField EXP_DOC;
    private javax.swing.JComboBox EXP_TYPE;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDate;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbExpendsTransaction;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        tbExpendsTransaction.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbExpendsTransaction.setRowHeight(30);
        JTableHeader tHeader = tbExpendsTransaction.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        DefaultTableModel model = (DefaultTableModel) tbExpendsTransaction.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        CbExpenseControl ec = new CbExpenseControl();
        ArrayList<CbExpenseBean> listBean = ec.listExpense();
        EXP_TYPE.removeAllItems();
        for (int i = 0; i < listBean.size(); i++) {
            CbExpenseBean bean = (CbExpenseBean) listBean.get(i);
            EXP_TYPE.addItem(bean.getExp_desc());
        }
    }

    private void clearForm() {
        EXP_DOC.setText("");
        EXP_DATE.setText("");
        BRANCH_CODE.setText("");
        EMP_CODE.setText("");
        if (EXP_TYPE.getItemCount() > 0) {
            EXP_TYPE.setSelectedIndex(0);
        }
        EMP_AMOUNT.setText("0.00");
        EXP_DOC.requestFocus();
    }

    private void saveData() {
        CbExpTransactionBean bean = new CbExpTransactionBean();
        bean.setEXP_DOC(EXP_DOC.getText());
        bean.setEXP_DATE(DateFormat.getLocal_ddMMyyyy(EXP_DATE.getText()));
        bean.setBRANCH_CODE(BRANCH_CODE.getText());
        bean.setEMP_CODE(EMP_CODE.getText());
        bean.setEXP_TYPE("" + EXP_TYPE.getSelectedItem());
        try {
            bean.setEMP_AMOUNT(Double.parseDouble(EMP_AMOUNT.getText()));
        } catch (NumberFormatException e) {
            EMP_AMOUNT.requestFocus();
            return;
        }
        
        if(bean.getEMP_AMOUNT()<=0){
            EMP_AMOUNT.requestFocus();
        }else{            
            getCbExpTransactionControl().saveCbExpTransaction(bean);

            loadDataTransaction();
            clearForm();
        }
    }

    private void loadDataTransaction() {
        DefaultTableModel model = (DefaultTableModel) tbExpendsTransaction.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        ArrayList<CbExpTransactionBean> listBean = getCbExpTransactionControl().listCbExpTransaction();
        for (int i = 0; i < listBean.size(); i++) {
            CbExpTransactionBean bean = (CbExpTransactionBean) listBean.get(i);
            model.addRow(new Object[]{
                bean.getEXP_DOC(),
                DateFormat.getLocale_ddMMyyyy(bean.getEXP_DATE()),
                bean.getBRANCH_CODE(),
                bean.getEMP_CODE(),
                bean.getEXP_TYPE(),
                NumberFormat.showDouble2(bean.getEMP_AMOUNT())
            });
        }
    }
}
