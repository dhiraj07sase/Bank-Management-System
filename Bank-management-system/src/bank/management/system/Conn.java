package bank.management.system;

import java.sql.*;

public class Conn {
    Connection connection;
    public Statement statement;

    public Conn() {
        try {
 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Dhiraj@2003");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
