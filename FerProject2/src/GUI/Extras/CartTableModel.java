package GUI.Extras;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CartTableModel extends AbstractTableModel {
    private List<EquipmentCount> cartItems;
    private final String[] columnNames = {"Name", "Price"};

    public CartTableModel(List<EquipmentCount> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public int getRowCount() {
        return cartItems.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EquipmentCount item = cartItems.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return item.getName();
            case 1:
                return item.getPrice();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}