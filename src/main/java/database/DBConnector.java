package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private Connection conn;
    public DBConnector() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            this.conn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/products" +
                            "user=root&password=Taylorswift1!&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        //Crosshatch3 PASSWORD NEEDS TO BE MYYYY PASSWORD
            //REQUEST DISPATCHER.FORWARD WILL BE IN THE SERV
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            ex.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Connection getConn() {
        return this.conn;
    }


}
