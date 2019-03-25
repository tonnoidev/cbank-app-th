package th.co.cbank.util;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;

public class TableUtil {
    private final Logger logger = Logger.getLogger(TableUtil.class);
    
    public static void initTable(JTable table) {
        JTableHeader hTable = table.getTableHeader();
        hTable.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        table.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        table.setRowHeight(25);
    }

    public static void alignTable(JTable table, int colsAt, int swingConstants) {
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(swingConstants);
        table.getColumnModel().getColumn(colsAt).setCellRenderer(render);
    }
}
