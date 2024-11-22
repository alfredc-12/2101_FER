package GUI.Extras;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import GUI.Extras.Connectosql;

public class CustomerOrderDAO {

    public CustomerOrder getCustomerOrderByName(String name) {
        CustomerOrder customerOrder = null;
        String query = "SELECT CustomerName, CustomerEmail, '1234567890' AS CustomerPhone, CustomerAddress FROM userlist WHERE CustomerName = ?";

        try (Connection conn = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                customerOrder = new CustomerOrder(
                    rs.getString("CustomerName"),
                    rs.getString("CustomerEmail"),
                    rs.getString("CustomerPhone"),
                    rs.getString("CustomerAddress")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerOrder;
    }
    
    public List<CustomerOrder> getCustomerOrders() {
        List<CustomerOrder> customerOrders = new ArrayList<>();
        String query = "SELECT CustomerName, CustomerEmail, '1234567890' AS CustomerPhone, CustomerAddress FROM userlist";

        try (Connection conn = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                CustomerOrder customerOrder = new CustomerOrder(
                    rs.getString("CustomerName"),
                    rs.getString("CustomerEmail"),
                    rs.getString("CustomerPhone"),
                    rs.getString("CustomerAddress")
                );
                customerOrders.add(customerOrder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerOrders;
    }
}