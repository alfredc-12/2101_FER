/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Extras;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class PackageTableCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Package pkg = (Package) value;
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel nameLabel = new JLabel(pkg.getPackageName());
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel imageLabel = new JLabel(new ImageIcon(pkg.getPackageImage()));
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        panel.add(imageLabel, BorderLayout.CENTER);
        panel.add(nameLabel, BorderLayout.SOUTH);

        if (isSelected) {
            panel.setBackground(table.getSelectionBackground());
        } else {
            panel.setBackground(table.getBackground());
        }

        return panel;
    }
}
