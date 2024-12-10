/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Extras;
// EquipmentCategoryTableModel class

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

public class EquipmentCategoryTableModel extends AbstractTableModel {
    private List<Equipment> equipmentList;
    private Map<String, Integer> equipmentQuantityMap;

    public EquipmentCategoryTableModel(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
        this.equipmentQuantityMap = new HashMap<>();
        for (Equipment equipment : equipmentList) {
            equipmentQuantityMap.merge(equipment.getName(), 1, Integer::sum);
        }
    }

    @Override
    public int getRowCount() {
        return equipmentQuantityMap.size();
    }

    @Override
    public int getColumnCount() {
        return 2; // Two columns: Equipment Name and Quantity
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<String> equipmentNames = new ArrayList<>(equipmentQuantityMap.keySet());
        String equipmentName = equipmentNames.get(rowIndex);
        if (columnIndex == 0) {
            return equipmentName; // Equipment Name
        } else {
            return equipmentQuantityMap.get(equipmentName); // Quantity
        }
    }

    @Override
    public String getColumnName(int column) {
        return column == 0 ? "Equipment Name" : "Quantity";
    }

    public Equipment getEquipmentAt(int rowIndex) {
        List<String> equipmentNames = new ArrayList<>(equipmentQuantityMap.keySet());
        String equipmentName = equipmentNames.get(rowIndex);
        return equipmentList.stream().filter(e -> e.getName().equals(equipmentName)).findFirst().orElse(null);
    }

    public void decrementQuantity(String equipmentName) {
        equipmentQuantityMap.put(equipmentName, equipmentQuantityMap.get(equipmentName) - 1);
        if (equipmentQuantityMap.get(equipmentName) == 0) {
            equipmentQuantityMap.remove(equipmentName);
        }
        fireTableDataChanged();
    }
}