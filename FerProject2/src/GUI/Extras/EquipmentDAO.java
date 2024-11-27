package GUI.Extras;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipmentDAO {
    
    public EquipmentCount getEquipmentByName(String name) {
        String query = "SELECT EquipmentID, EquipmentName, RentedPrice, COUNT(*) as TotalCount, SUM(CASE WHEN EquipmentAvailability = TRUE THEN 1 ELSE 0 END) as AvailableCount, EquipmentCategoryID, EquipmentDesc, EquipmentImage FROM Equipment WHERE EquipmentName = ? GROUP BY EquipmentID, EquipmentName, RentedPrice, EquipmentCategoryID, EquipmentDesc, EquipmentImage";
        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                EquipmentCount equipment = new EquipmentCount(
                    rs.getString("EquipmentName"),
                    rs.getDouble("RentedPrice"),
                    rs.getInt("TotalCount"),
                    rs.getInt("AvailableCount"),
                    rs.getInt("EquipmentCategoryID"),
                    rs.getString("EquipmentDesc")
                );
                equipment.setID(rs.getInt("EquipmentID"));
                byte[] imageBytes = rs.getBytes("EquipmentImage");
                equipment.setImage(imageBytes);
                return equipment;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<EquipmentCount> getAllEquipment() {
        List<EquipmentCount> equipmentList = new ArrayList<>();
        String query = "SELECT EquipmentID, EquipmentName, RentedPrice, SUM(CASE WHEN EquipmentAvailability = TRUE THEN 1 ELSE 0 END) as AvailableCount, EquipmentCategoryID, EquipmentDesc, EquipmentImage FROM equipment GROUP BY EquipmentID, EquipmentName, RentedPrice, EquipmentCategoryID, EquipmentDesc, EquipmentImage";

        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                EquipmentCount equipment = new EquipmentCount(
                    rs.getString("EquipmentName"),
                    rs.getDouble("RentedPrice"),
                    rs.getInt("AvailableCount"), // Using available count
                    rs.getInt("AvailableCount"), // Using available count for initialization
                    rs.getInt("EquipmentCategoryID"),
                    rs.getString("EquipmentDesc")
                );
                equipment.setID(rs.getInt("EquipmentID"));
                equipment.setImage(rs.getBytes("EquipmentImage"));
                equipmentList.add(equipment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return equipmentList;
    }

    public List<EquipmentCount> getEquipmentListDetailsByPackageID(int packageID) {
        List<EquipmentCount> equipmentList = new ArrayList<>();
        String query = "SELECT e.EquipmentID, e.EquipmentName, e.RentedPrice, SUM(CASE WHEN e.EquipmentAvailability = TRUE THEN 1 ELSE 0 END) as AvailableCount, e.EquipmentCategoryID, e.EquipmentDesc, e.EquipmentImage FROM packageequipment pe JOIN Equipment e ON pe.EquipmentID = e.EquipmentID WHERE pe.PackageID = ? GROUP BY e.EquipmentID, e.EquipmentName, e.RentedPrice, e.EquipmentCategoryID, e.EquipmentDesc, e.EquipmentImage";

        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setInt(1, packageID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                EquipmentCount equipment = new EquipmentCount(
                    rs.getString("EquipmentName"),
                    rs.getDouble("RentedPrice"),
                    rs.getInt("AvailableCount"),
                    rs.getInt("AvailableCount"),
                    rs.getInt("EquipmentCategoryID"),
                    rs.getString("EquipmentDesc")
                );
                equipment.setID(rs.getInt("EquipmentID"));
                equipment.setImage(rs.getBytes("EquipmentImage"));
                equipmentList.add(equipment);
                System.out.println("Retrieved equipment details successfully for package ID: " + packageID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (equipmentList.isEmpty()) {
            System.out.println("No equipment found for package ID: " + packageID);
        }

        return equipmentList;
    }

    public List<EquipmentCount> getPackageList() {
        List<EquipmentCount> packageList = new ArrayList<>();
        String query = "SELECT PackageID AS EquipmentID, PackageName AS Name, PackageDesc AS Description, PackageImage AS Image, RentedPrice AS Price FROM package";
        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                EquipmentCount equipment = new EquipmentCount(
                    rs.getString("Name"), 
                    rs.getDouble("Price"), 
                    0, // totalCount
                    0, // availableCount
                    0, // categoryID
                    rs.getString("Description")
                );
                equipment.setID(rs.getInt("EquipmentID")); // Set equipment ID
                equipment.setImage(rs.getBytes("Image")); // Set image bytes
                packageList.add(equipment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return packageList;
    }

    public String getEquipmentListByPackageID(int packageID) {
        StringBuilder equipmentList = new StringBuilder();
        String query = "SELECT e.EquipmentName FROM packageequipment pe JOIN equipment e ON pe.EquipmentID = e.EquipmentID WHERE pe.PackageID = ?";
        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setInt(1, packageID);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    equipmentList.append(rs.getString("EquipmentName")).append("\n");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return equipmentList.toString();
    }
    
    public EquipmentCount getPackageByName(String name) {
        String query = "SELECT PackageID AS EquipmentID, PackageName AS Name, PackageDesc AS Description, PackageImage AS Image, RentedPrice AS Price FROM package WHERE PackageName = ?";
        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                EquipmentCount equipment = new EquipmentCount(
                    rs.getString("Name"),
                    rs.getDouble("Price"),
                    0, // totalCount
                    0, // availableCount
                    0, // categoryID
                    rs.getString("Description")
                );
                equipment.setID(rs.getInt("EquipmentID")); // Set package ID
                equipment.setImage(rs.getBytes("Image")); // Set image bytes
                System.out.println("Retrieved package details successfully for " + name);
                return equipment;
            } else {
                System.out.println("No package found with the given name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getEquipmentIDByName(String name) {
        String query = "SELECT EquipmentID FROM Equipment WHERE EquipmentName = ?";
        try (Connection conn = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("EquipmentID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Return -1 if not found
    }

    public List<EquipmentCount> getEquipmentCountByCategory(int categoryID) {
        List<EquipmentCount> equipmentCounts = new ArrayList<>();
        String query = "SELECT EquipmentName, RentedPrice, COUNT(*) as TotalCount, SUM(CASE WHEN EquipmentAvailability = TRUE THEN 1 ELSE 0 END) as AvailableCount, EquipmentCategoryID, EquipmentDesc FROM Equipment WHERE EquipmentCategoryID = ? GROUP BY EquipmentName, RentedPrice, EquipmentCategoryID, EquipmentDesc";

        try (Connection connect = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = connect.prepareStatement(query)) {

            stmt.setInt(1, categoryID);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                EquipmentCount equipmentCount = new EquipmentCount(
                    rs.getString("EquipmentName"),
                    rs.getDouble("RentedPrice"),
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
            String updateQuery = "UPDATE Equipment SET EquipmentName = ?, EquipmentCategoryID = ?, RentedPrice = ?, EquipmentDesc = ?, EquipmentImage = ? WHERE EquipmentName = ?";
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
                String insertQuery = "INSERT INTO Equipment (EquipmentName, EquipmentCategoryID, RentedPrice, EquipmentDesc, EquipmentAvailability, EquipmentImage) VALUES (?, ?, ?, ?, ?, ?)";
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