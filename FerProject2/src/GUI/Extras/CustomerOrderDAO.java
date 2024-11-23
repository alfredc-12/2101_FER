package GUI.Extras;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import GUI.Extras.Connectosql;
import java.util.Date;

public class CustomerOrderDAO {

    public CustomerOrder getCustomerOrderByName(String name) {
        CustomerOrder customerOrder = null;
        String query = "SELECT CustomerName, CustomerEmail, CustomerPhone, CustomerAddress, UserID FROM userlist WHERE CustomerName = ?";

        try (Connection conn = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                customerOrder = new CustomerOrder(
                    rs.getString("CustomerName"),
                    rs.getString("CustomerEmail"),
                    rs.getString("CustomerPhone"),
                    rs.getString("CustomerAddress"),
                    rs.getInt("UserID")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerOrder;
    }
    
    public List<Order> getCustomerOrderHistory(int userId) {
        List<Order> orders = new ArrayList<>();
        String query = "SELECT co.CustomerOrderID, co.CustomerStartDate, co.CustomerEndDate, cp.PaymentMethod, co.TotalCost " +
                       "FROM customerorder co " +
                       "JOIN customerpayment cp ON co.CustomerPaymentID = cp.CustomerPaymentID " +
                       "WHERE co.UserID = ?";

        try (Connection conn = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int customerOrderID = rs.getInt("CustomerOrderID");
                String startDate = rs.getString("CustomerStartDate");  // Fetch as String
                String endDate = rs.getString("CustomerEndDate");      // Fetch as String
                String paymentMethod = rs.getString("PaymentMethod");
                double totalCost = rs.getDouble("TotalCost");

                Order order = new Order(customerOrderID, startDate, endDate, paymentMethod, totalCost);
                orders.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }
    
    public List<CustomerOrder> getCustomerOrders() {
        List<CustomerOrder> customerOrders = new ArrayList<>();
        String query = "SELECT CustomerName, CustomerEmail, CustomerPhone, CustomerAddress, UserID FROM userlist";

        try (Connection conn = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                CustomerOrder customerOrder = new CustomerOrder(
                    rs.getString("CustomerName"),
                    rs.getString("CustomerEmail"),
                    rs.getString("CustomerPhone"),
                    rs.getString("CustomerAddress"),
                    rs.getInt("UserID")
                );
                customerOrders.add(customerOrder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerOrders;
    }
    
    public List<RentedEquipment> getRentedEquipmentByCustomerOrderID(int customerOrderID) {
        List<RentedEquipment> rentedEquipmentList = new ArrayList<>();
        String query = "SELECT e.EquipmentName " +
                       "FROM customerlist cl " +
                       "JOIN equipment e ON cl.EquipmentID = e.EquipmentID " +
                       "WHERE cl.CustomerOrderID = ?";

        try (Connection conn = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, customerOrderID);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                RentedEquipment rentedEquipment = new RentedEquipment(
                    rs.getString("EquipmentName")
                );
                rentedEquipmentList.add(rentedEquipment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rentedEquipmentList;
    }
    
    public boolean updateCustomerInfo(int userId, String name, String email, String phone, String address) {
        String query = "UPDATE userlist SET CustomerName = ?, CustomerEmail = ?, CustomerPhone = ?, CustomerAddress = ? WHERE UserID = ?";

        try (Connection conn = Connectosql.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, phone);
            stmt.setString(4, address);
            stmt.setInt(5, userId);

            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}