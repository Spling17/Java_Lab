package SignUp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dbUnil.dbConnection;

public class SignUpModel {
    
    Connection conn = null;

    public SignUpModel(){
        this.conn = dbConnection.getConnection();

        if(this.conn == null){
            System.exit(1);
        }

    }

    public boolean isDatabaseConnected(){
        return this.conn != null;
    }

    public void isSignUp(String username, String password){
        PreparedStatement statement = null;

        String query = "INSERT INTO login_tbl (username, password) VALUES(?,?);";

        try {
            statement = this.conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                // resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}