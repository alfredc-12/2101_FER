package Connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connectosql {
    private static final String URL = "jdbc:mysql://localhost:3306/tester";
    private static final String USER = "root";
    private static final String PASS = "";

    private static Connectosql instance;

    private Connectosql() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Connectosql getInstance() {
        if (instance == null) {
            instance = new Connectosql();
        }
        return instance;
    }

    public Connection getConnection() {
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection error: " + e.getMessage(), "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        return connect;
    }
}