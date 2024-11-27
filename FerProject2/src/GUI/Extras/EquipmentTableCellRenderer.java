package GUI.Extras;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class EquipmentTableCellRenderer extends JPanel implements TableCellRenderer {
    private EquipmentDAO equipmentDAO;
    private JLabel imageLabel;
    private JLabel nameLabel;

    public EquipmentTableCellRenderer(EquipmentDAO equipmentDAO) {
        this.equipmentDAO = equipmentDAO;
        setLayout(new BorderLayout(5, 5));
        imageLabel = new JLabel("", JLabel.CENTER);
        nameLabel = new JLabel("", JLabel.CENTER);

        JPanel namePanel = new JPanel(new BorderLayout());
        namePanel.add(nameLabel, BorderLayout.NORTH);
        namePanel.setBorder(BorderFactory.createEmptyBorder(1, 0, 0, 0)); // Add padding above name label

        add(imageLabel, BorderLayout.CENTER);
        add(namePanel, BorderLayout.SOUTH);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        EquipmentCount equipment = (EquipmentCount) value;

        // Adjust image size to fit within the scroll pane
        byte[] imageBytes = equipmentDAO.getImageByName(equipment.getName());
        if (imageBytes != null) {
            ImageIcon imageIcon = new ImageIcon(imageBytes);
            Image image = imageIcon.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH); // Adjust image size
            imageLabel.setIcon(new ImageIcon(image));
        } else {
            imageLabel.setIcon(null);
        }

        // Set equipment name
        nameLabel.setText("<html><center>" + equipment.getName() + "</center></html>"); // Center align text using HTML

        return this;
    }
}
