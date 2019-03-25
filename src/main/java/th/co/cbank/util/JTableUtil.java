package th.co.cbank.util;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import th.co.cbank.project.constants.AppConstants;

public class JTableUtil {

    public static void defaultTemplate(JTable table) {
        table.setFont(new Font("Tahoma", Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        JTableHeader tHeader = table.getTableHeader();
        tHeader.setFont(new Font("Tahoma", Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));
    }

    public static void alignRight(JTable table, int column) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        table.getColumnModel().getColumn(column).setCellRenderer(rightRenderer);
    }

    public static void alignLeft(JTable table, int column) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.LEFT);
        table.getColumnModel().getColumn(column).setCellRenderer(rightRenderer);
    }

    public static void alignCenter(JTable table, int column) {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(column).setCellRenderer(rightRenderer);
    }
    
    public static void sortDouble(JTable table, int column){
        table.getColumnModel().getColumn(column).setCellRenderer(new DoubleFormatSort());
    }
}
