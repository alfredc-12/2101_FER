/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Extras;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Allend
 */
public class Calcs {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/try lang"; // Replace with your database name
    private static final String USER = "root"; // Replace with your database username
    private static final String PASSWORD = ""; // Replace with your database password

    public void fetchCustomerData(int CustomerOrderID) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish connection to the database
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            stmt = conn.createStatement();

            // SQL query to fetch customer data
            String query = "SELECT CustomerName, CustomerStartDate, CustomerEndDate, ReturnStatus FROM userlist INNER JOIN customerorder WHERE CustomerOrderID = " + CustomerOrderID; // Replace 'your_table' with your actual table name
            rs = stmt.executeQuery(query);

            // Process the results
            if (rs.next()) {
                String customerName = rs.getString("CustomerName");
                String startDate = rs.getString("CustomerStartDate");
                String endDate = rs.getString("CustomerEndDate");
                String returnStatus = rs.getString("ReturnStatus");

                // Display the fetched data (for example, print to console)
                System.out.println("Customer Name: " + customerName);
                System.out.println("Start Date: " + startDate);
                System.out.println("End Date: " + endDate);
                System.out.println("Return Status: " + returnStatus);
            } else {
                System.out.println("No data found for the selected customer.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error fetching data: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
