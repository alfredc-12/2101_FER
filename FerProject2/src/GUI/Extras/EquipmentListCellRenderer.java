package GUI.Extras;

import javax.swing.*;
import java.awt.*;

public class EquipmentListCellRenderer extends JPanel implements ListCellRenderer<GUI.Extras.Equipment> {
    private JLabel nameLabel = new JLabel();
    private JLabel priceLabel = new JLabel();
    private JLabel availabilityLabel = new JLabel();

    public EquipmentListCellRenderer() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(nameLabel);
        add(priceLabel);
        add(availabilityLabel);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends GUI.Extras.Equipment> list, GUI.Extras.Equipment equipment, int index, boolean isSelected, boolean cellHasFocus) {
        nameLabel.setText("Name: " + equipment.getName() + "  ");
        priceLabel.setText("Price: $" + equipment.getPrice() + "  ");
        availabilityLabel.setText("Available: " + (equipment.isAvailability() ? "Yes" : "No") + "  ");

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        return this;
    }
}
