package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

    public void pullInventory(int userID, String name, float price, String imageSource) throws SQLException {
        Connection con = new DBConnector().getConn();
        PreparedStatement ps =
                con.prepareStatement("INSERT INTO INVENTORY (ID, Name, Price, ImagePath) " + "VALUES (?, ?, ?, ?)");

        ps.setInt(1, userID);
        ps.setString(2, name);
        ps.setFloat(3, price);
        ps.setString(4, imageSource);
        ps.executeUpdate();
    }



}
