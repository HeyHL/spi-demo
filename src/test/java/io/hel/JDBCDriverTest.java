package io.hel;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * helei
 * 2022/2/22 10:49
 * description:
 */
@SuppressWarnings("all")
public class JDBCDriverTest {
    public static void main(String[] args) throws Exception {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/hel_order", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM order_info");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("order_name"));
        }
        resultSet.close();
        connection.close();
    }
}
