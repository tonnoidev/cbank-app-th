package th.co.cbank.util;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class DoubleFormatSort extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // First format the cell value as required

        value = NumberFormat.showDouble2((Double) value);

        // And pass it on to parent class 
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
