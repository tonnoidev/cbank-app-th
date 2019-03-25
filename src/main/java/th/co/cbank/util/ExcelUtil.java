package th.co.cbank.util;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

import jxl.CellView;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.UnderlineStyle;
import jxl.write.Formula;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.apache.log4j.Logger;

public class ExcelUtil {
    private final Logger logger = Logger.getLogger(ExcelUtil.class);
    private WritableCellFormat timesBoldUnderline;
    private WritableCellFormat times;
    private String inputFile;
    private String[] charArr = new String[]{
        "A", "B", "C", "D", "E", "F",
        "G", "H", "I", "J", "K", "L",
        "M", "N", "O", "P", "Q", "R",
        "S", "T", "U", "V", "W", "X",
        "Y", "Z"
    };

    public void setOutputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void write(DefaultTableModel model, String sheetName, int[] colsNumber) throws IOException, WriteException {
        File file = new File(inputFile);
        WorkbookSettings wbSettings = new WorkbookSettings();
        wbSettings.setLocale(new Locale("en", "EN"));

        WritableWorkbook workbook = Workbook.createWorkbook(file, wbSettings);
        workbook.createSheet(sheetName, 0);
        WritableSheet excelSheet = workbook.getSheet(0);
        createLabel(excelSheet, model);
        createContent(excelSheet, model, colsNumber);

        workbook.write();
        workbook.close();
    }

    private void createLabel(WritableSheet sheet, DefaultTableModel model) throws WriteException {
        WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
        times = new WritableCellFormat(times10pt);
        times.setWrap(true);

        WritableFont times10ptBoldUnderline = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.SINGLE);
        timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
        timesBoldUnderline.setWrap(true);

        CellView cv = new CellView();
        cv.setFormat(times);
        cv.setFormat(timesBoldUnderline);
        cv.setAutosize(true);

        for (int i = 0; i < model.getColumnCount(); i++) {
            addCaption(sheet, i, 0, model.getColumnName(i));
        }
    }

    private void createContent(WritableSheet sheet, DefaultTableModel model, int[] colsNumber) throws WriteException, RowsExceededException {

        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                boolean isLock = false;
                for (int a = 0; a < colsNumber.length; a++) {
                    if (colsNumber[a] == j) {
                        isLock = true;
                        break;
                    }
                }
                if (isLock) {
                    addDouble(sheet, j, i + 1, Double.parseDouble(model.getValueAt(i, j).toString()));
                } else {
                    addLabel(sheet, j, i + 1, model.getValueAt(i, j).toString());
                }
            }
        }

        int maxRow = model.getRowCount()+1;
        if (colsNumber.length > 0) {
            for (int i = 0; i < colsNumber.length; i++) {
                StringBuilder buf = new StringBuilder();
                buf.append("SUM(").append(charArr[colsNumber[i]]).append("2:").append(charArr[colsNumber[i]]).append("").append(maxRow).append(")");
                Formula f = new Formula(colsNumber[i], maxRow, buf.toString());
                sheet.addCell(f);
            }
        }
    }

    private void addCaption(WritableSheet sheet, int column, int row, String s) throws RowsExceededException, WriteException {
        Label label;
        label = new Label(column, row, s, timesBoldUnderline);
        sheet.addCell(label);
    }

    private void addNumber(WritableSheet sheet, int column, int row, Integer integer) throws WriteException, RowsExceededException {
        Number number;
        number = new Number(column, row, integer, times);
        sheet.addCell(number);
    }

    private void addDouble(WritableSheet sheet, int column, int row, Double db) throws WriteException, RowsExceededException {
        Number number;
        number = new Number(column, row, db, times);
        sheet.addCell(number);
    }

    private void addLabel(WritableSheet sheet, int column, int row, String s) throws WriteException, RowsExceededException {
        Label label;
        label = new Label(column, row, s, times);
        sheet.addCell(label);
    }

}
