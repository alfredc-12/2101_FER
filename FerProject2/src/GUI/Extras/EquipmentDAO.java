package GUI.Extras;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipmentDAO {

    // Method to fetch equipment details by name
    public EquipmentCount getEquipmentByName(String name) {
        String query = "SELECT EquipmentName, EquipmentPrice, COUNT(*) as TotalCount, SUM(CASE WHEN EquipmentAvailability = TRUE THEN 1 ELSE 0 END) as AvailableCount, EquipmentCategoryID, EquipmentDesc FROM Equipment WHERE EquipmentName = ? GROUP BY EquipmentName, EquipmentPrice, EquipmentCategoryID, EquipmentDesc";
        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new EquipmentCount(
                    rs.getString("EquipmentName"),
                    rs.getDouble("EquipmentPrice"),
                    rs.getInt("TotalCount"),
                    rs.getInt("AvailableCount"),
                    rs.getInt("EquipmentCategoryID"),
                    rs.getString("EquipmentDesc")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Method to get equipment count by category
    public List<EquipmentCount> getEquipmentCountByCategory(int categoryID) {
        List<EquipmentCount> equipmentCounts = new ArrayList<>();
        String query = "SELECT EquipmentName, EquipmentPrice, COUNT(*) as TotalCount, SUM(CASE WHEN EquipmentAvailability = TRUE THEN 1 ELSE 0 END) as AvailableCount, EquipmentCategoryID, EquipmentDesc FROM Equipment WHERE EquipmentCategoryID = ? GROUP BY EquipmentName, EquipmentPrice, EquipmentCategoryID, EquipmentDesc";

        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {

            stmt.setInt(1, categoryID);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                EquipmentCount equipmentCount = new EquipmentCount(
                    rs.getString("EquipmentName"),
                    rs.getDouble("EquipmentPrice"),
                    rs.getInt("TotalCount"),
                    rs.getInt("AvailableCount"),
                    rs.getInt("EquipmentCategoryID"),
                    rs.getString("EquipmentDesc")
                );
                equipmentCounts.add(equipmentCount);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return equipmentCounts;
    }

    // Method to fetch image by equipment name
    public byte[] getImageByName(String name) {
        String query = "SELECT EquipmentImage FROM Equipment WHERE EquipmentName = ?";
        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getBytes("EquipmentImage");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private int getCategoryID(String category) {
        switch (category) {
            case "Camera": return 1;
            case "Lighting": return 2;
            case "Audio": return 3;
            case "Miscellaneous": return 4;
            default: return 0;
        }
    }
    
    public void updateEquipment(String originalName, String newName, String category, double price, String description, int newQuantity, byte[] imageBytes) {
        try (Connection connect = Connectosql.getInstance().getConnection()) {
            // Update equipment details except quantity
            String updateQuery = "UPDATE Equipment SET EquipmentName = ?, EquipmentCategoryID = ?, EquipmentPrice = ?, EquipmentDesc = ?, EquipmentImage = ? WHERE EquipmentName = ?";
            try (PreparedStatement stmt = connect.prepareStatement(updateQuery)) {
                stmt.setString(1, newName);
                stmt.setInt(2, getCategoryID(category));
                stmt.setDouble(3, price);
                stmt.setString(4, description);
                stmt.setBytes(5, imageBytes);
                stmt.setString(6, originalName);
                stmt.executeUpdate();
            }

            // Adjust quantity separately
            String getCountQuery = "SELECT COUNT(*) AS count FROM Equipment WHERE EquipmentName = ?";
            int currentQuantity;
            try (PreparedStatement stmt = connect.prepareStatement(getCountQuery)) {
                stmt.setString(1, originalName);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    currentQuantity = rs.getInt("count");
                } else {
                    return; // No matching records found
                }
            }

            if (newQuantity > currentQuantity) {
                // Add new instances
                int itemsToAdd = newQuantity - currentQuantity;
                String insertQuery = "INSERT INTO Equipment (EquipmentName, EquipmentCategoryID, EquipmentPrice, EquipmentDesc, EquipmentAvailability, EquipmentImage) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = connect.prepareStatement(insertQuery)) {
                    for (int i = 0; i < itemsToAdd; i++) {
                        stmt.setString(1, newName);
                        stmt.setInt(2, getCategoryID(category));
                        stmt.setDouble(3, price);
                        stmt.setString(4, description);
                        stmt.setBoolean(5, true); // Assuming new items are available
                        stmt.setBytes(6, imageBytes);
                        stmt.addBatch();
                    }
                    stmt.executeBatch();
                }
            } else if (newQuantity < currentQuantity) {
                // Delete excess instances
                int itemsToDelete = currentQuantity - newQuantity;
                String deleteQuery = "DELETE FROM Equipment WHERE EquipmentName = ? LIMIT ?";
                try (PreparedStatement stmt = connect.prepareStatement(deleteQuery)) {
                    stmt.setString(1, originalName);
                    stmt.setInt(2, itemsToDelete);
                    stmt.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEquipment(String name) {
        String deleteQuery = "DELETE FROM Equipment WHERE EquipmentName = ?";
        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(deleteQuery)) {
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}