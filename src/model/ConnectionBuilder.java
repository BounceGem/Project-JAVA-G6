package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://10.4.56.21:3306/facility", "facility", "facility");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("!" + ex);
        }
        return conn;
    }
}
