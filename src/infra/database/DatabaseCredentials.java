package infra.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseCredentials {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/tech_store?user=root";
    private static final String USER = "root";
    private static final String PASSWORD = "mysqlPW";

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
