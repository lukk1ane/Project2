package ge.tbc.itacademy.utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBMethods {

    public User getUser(String username){
        User user = new User();
        try(Connection connection = MSSQLConnection.connect()){
            String SQL = "SELECT username, password FROM Users where username = '" + username + "'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL);
            resultSet.next();
            user.setPass(resultSet.getString("password"));
            user.setUsername(resultSet.getString("username"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }


}
