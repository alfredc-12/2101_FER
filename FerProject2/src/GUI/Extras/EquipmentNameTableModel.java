/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Extras;
// EquipmentNameTableModel class

import java.util.List;
import javax.swing.table.AbstractTableModel;

// EquipmentNameTableModel class
public class EquipmentNameTableModel extends AbstractTableModel {
    public List<Equipment> equipmentList;

    public EquipmentNameTableModel(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    @Override
    public int getRowCount() {
        return equipmentList.size();
    }

    @Override
    public int getColumnCount() {
        return 1; // Displaying only one column (equipment name)
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return equipmentList.get(rowIndex).getName(); // Displaying equipment name
    }

    @Override
    public String getColumnName(int column) {
        return "Equipment Name"; // Column name
    }

    public void removeEquipmentAt(int rowIndex) {
        equipmentList.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public Equipment getEquipmentAt(int rowIndex) {
        return equipmentList.get(rowIndex);
    }
}
