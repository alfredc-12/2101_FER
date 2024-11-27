package GUI.Extras;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CartTableModel extends AbstractTableModel {
    private final List<EquipmentCount> cartItems;
    private final String[] columnNames = {"Equipment Name", "Rent Price"};

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
        EquipmentCount equipment = cartItems.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return equipment.getName();
            case 1:
                return String.format("%.2f", equipment.getPrice()); // Format price as needed
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
}