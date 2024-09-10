package A20240909;

import java.sql.*;

public class JDBC {
    public static void main(String[] args){

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // 1. 加載 JDBC 驅動
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 連接到具體的數據庫 "mydatabase"
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "A021890a");

            if (connection != null) {
                System.out.println("yes connect");
            }

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
