package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {

      public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://10.4.56.21:3306/facility","facility","facility");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex);
        }
        return con;
    }
    public static void main(String[] args) {
        Connection con = getConnection();
    }
}
