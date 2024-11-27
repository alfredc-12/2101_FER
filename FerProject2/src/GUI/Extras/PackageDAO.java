package GUI.Extras;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PackageDAO {

    public int insertPackage(String packageName, double rentedPrice, String packageDesc, byte[] packageImage) {
        String query = "INSERT INTO package (PackageName, RentedPrice, PackageDesc, PackageImage) VALUES (?, ?, ?, ?)";
        try (Connection conn = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, packageName);
            stmt.setDouble(2, rentedPrice);
            stmt.setString(3, packageDesc);
            stmt.setBytes(4, packageImage);
            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1); // Return the generated PackageID
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public void insertPackageEquipment(int packageID, int equipmentID) {
        String query = "INSERT INTO packageequipment (PackageID, EquipmentID) VALUES (?, ?)";
        try (Connection conn = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, packageID);
            stmt.setInt(2, equipmentID);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
