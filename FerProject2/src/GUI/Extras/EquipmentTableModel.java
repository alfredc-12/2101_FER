package GUI.Extras;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class EquipmentTableModel extends AbstractTableModel {
    private final List<EquipmentCount> equipmentList;

    public EquipmentTableModel(List<EquipmentCount> equipmentList) {
        this.equipmentList = equipmentList;
    }

    @Override
    public int getRowCount() {
        return 1; // Single row for horizontal arrangement
    }

    @Override
    public int getColumnCount() {
        return equipmentList.size(); // Each equipment item is a column
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return equipmentList.get(columnIndex); // Return the equipment item for the column
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
}