package th.co.cbank.project.report.view;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import th.co.cbank.project.control.CbLoanAccountControl;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.model.ProfileBean;

public class ReportPersonDetail extends javax.swing.JDialog {

    private DefaultTableModel model;

    public ReportPersonDetail(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initTable();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableReport = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tableReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "ชื่อ - สกุล", "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableReport.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tableReport);
        if (tableReport.getColumnModel().getColumnCount() > 0) {
            tableReport.getColumnModel().getColumn(0).setPreferredWidth(55);
            tableReport.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableReport.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableReport.getColumnModel().getColumn(3).setPreferredWidth(150);
            tableReport.getColumnModel().getColumn(4).setPreferredWidth(120);
            tableReport.getColumnModel().getColumn(5).setPreferredWidth(150);
            tableReport.getColumnModel().getColumn(6).setPreferredWidth(120);
            tableReport.getColumnModel().getColumn(7).setPreferredWidth(120);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ค้นหาชื่อสมาชิก :");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("ค้นหา");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExport.setText("Export Excel Files");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("แสดงข้อมูลทั้งหมด");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExport)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        findText();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            findText();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        exportExcel();
    }//GEN-LAST:event_btnExportActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loadData();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableReport;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tableReport.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tableReport.setRowHeight(30);
        JTableHeader tHeader = tableReport.getTableHeader();
        tHeader.setFont(new Font("Tahoma", Font.BOLD, 12));

        model = (DefaultTableModel) tableReport.getModel();

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        tableReport.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tableReport.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
        tableReport.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
        tableReport.getColumnModel().getColumn(9).setCellRenderer(rightRenderer);
    }

    private void loadData() {
        MySQLConnect mySQLConnect = new MySQLConnect();

        ProfileControl pfCon = new ProfileControl();
        List<ProfileBean> listProfile = pfCon.listCbProfile();

        CbSaveAccountControl saveCon = new CbSaveAccountControl();
        CbLoanAccountControl loanCon = new CbLoanAccountControl();

        int count = 1;
        for (ProfileBean bean : listProfile) {
            model.addRow(new Object[]{
                count++, bean.getP_custName() + " " + bean.getP_custSurname(), "จำนวนหุ้น", bean.getHoon_Qty(), "หุ้น"
            });

            List<CbSaveAccountBean> listSaveAcc = saveCon.listCbSaveAccount(bean.getP_custCode());
            model.addRow(new Object[]{
                "", bean.getP_custCode(), "จำนวนบัญชีเงินฝาก", listSaveAcc.size(), "บัญชี"
            });
            int saveCount = 1;
            for (CbSaveAccountBean save : listSaveAcc) {
                model.addRow(new Object[]{
                    "", "", "บัญชี [" + saveCount++ + "]", save.getAccount_code(), "เงินฝากคงเหลือ", save.getB_BALANCE()
                });
            }

            List<CbLoanAccountBean> listLoanAcc = loanCon.listLoanAccountCust(bean.getP_custCode());
            model.addRow(new Object[]{
                "", "", "จำนวนบัญชีเงินกู้", listLoanAcc.size(), "บัญชี"
            });
            int loanCount = 1;
            for (CbLoanAccountBean loan : listLoanAcc) {
                model.addRow(new Object[]{
                    "", "", "บัญชี [" + loanCount++ + "]", loan.getLoan_docno(), "ชำระแล้วทั้งหมด", loan.getPayPerAmount(), "เงินค้างชำระ", loan.getLoan_amount()
                });
            }

            model.addRow(new Object[]{});
            model.addRow(new Object[]{});
        }
    }

    private int rowSelectTmp = 0;

    private void findText() {
        tableReport.clearSelection();
        boolean isFound = false;
        for (int i = rowSelectTmp; i < model.getRowCount(); i++) {
            String text = model.getValueAt(i, 1).toString();
            if (text.contains(txtSearch.getText())) {
                tableReport.getSelectionModel().addSelectionInterval(i, i);
                Rectangle rect = tableReport.getCellRect(i, 0, true);
                Point pt = ((JViewport) tableReport.getParent()).getViewPosition();
                rect.setLocation(rect.x - pt.x, rect.y);
                tableReport.scrollRectToVisible(rect);
                rowSelectTmp = i + 1;
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            rowSelectTmp = 0;
        }
    }

    private void exportExcel() {
        exportData(tableReport, this);
    }

    public static void exportData(JTable tableData, JDialog dialog) {
        dialog.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        String FILE_NAME = "output.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");
        int rowNum = 0;
        System.out.println("Creating excel");

        sheet.setColumnWidth((short) 0, (short) 2000);
        sheet.setColumnWidth((short) 1, (short) 10000);
        sheet.setColumnWidth((short) 2, (short) 4000);
        sheet.setColumnWidth((short) 3, (short) 3500);
        sheet.setColumnWidth((short) 4, (short) 3500);
        sheet.setColumnWidth((short) 5, (short) 3000);
        sheet.setColumnWidth((short) 6, (short) 3000);
        sheet.setColumnWidth((short) 7, (short) 3000);

        //font style
        XSSFCellStyle myStyle = workbook.createCellStyle();
        XSSFFont myFont = workbook.createFont();
        myFont.setFontName("Tahoma");
        myFont.setColor(HSSFFont.COLOR_NORMAL);
        myFont.setBold(true);
        myStyle.setFont(myFont);

        XSSFCellStyle centerStyle = workbook.createCellStyle();
        centerStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

        XSSFCellStyle rightStyle = workbook.createCellStyle();
        rightStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);

        String[] dataColumns = getTableColumns(tableData);
        int colNum1 = 0;
        Row row = sheet.createRow(rowNum);
        for (String col : dataColumns) {
            Cell cell = row.createCell(colNum1++);
            cell.setCellValue((String) col);
            cell.setCellStyle(myStyle);
        }

        rowNum++;

        Object[][] datatypes = getTableData(tableData);
        for (Object[] datatype : datatypes) {
            row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                if (field == null) {
                    field = "";
                }
                Cell cell = row.createCell(colNum);
                if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                } else if (field instanceof String) {
                    cell.setCellValue((String) "" + field);
                } else if (field instanceof Double) {
                    cell.setCellValue((Double) field);
                }

                if (colNum == 0) {
                    cell.setCellStyle(centerStyle);
                } else if (colNum == 5 || colNum == 7) {
                    cell.setCellStyle(rightStyle);
                }

                colNum++;
            }
        }

        //freeze pane
        sheet.createFreezePane(0, 1);

        try {
            try (FileOutputStream outputStream = new FileOutputStream(FILE_NAME)) {
                workbook.write(outputStream);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

        dialog.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

        try {
            Desktop.getDesktop().open(new File(FILE_NAME));
        } catch (IOException e) {
        }
    }

    static String[] getTableColumns(JTable tb) {
        String colName = "";
        for (int i = 0; i < tb.getColumnCount(); i++) {
            colName += tb.getColumnName(i) + ",";
        }

        return colName.split(",");
    }

    static Object[][] getTableData(JTable tableData) {
        DefaultTableModel dtm = (DefaultTableModel) tableData.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tDataObj = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                tDataObj[i][j] = dtm.getValueAt(i, j);
            }
        }
        return tDataObj;
    }
}
