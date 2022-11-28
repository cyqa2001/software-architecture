package experiment5.dao;

import java.sql.*;

public class BaseDao {
    private static String url = "jdbc:mysql:///lab5?useSSL=false&characterEncoding=UTF-8";
    private static String username = "root";
    private static String password = "root";
        static {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

}
