/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Extras;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PackageTableModel extends AbstractTableModel {
    private List<Package> packageList;

    public PackageTableModel(List<Package> packageList) {
        this.packageList = packageList;
    }

    @Override
    public int getRowCount() {
        return packageList.size();
    }

    @Override
    public int getColumnCount() {
        return 1; // Displaying only one column (image and name)
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return packageList.get(rowIndex);
    }
}

