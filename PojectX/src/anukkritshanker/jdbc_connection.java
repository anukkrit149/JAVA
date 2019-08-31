package anukkritshanker;
import java.sql.*;
/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

public class jdbc_connection {
    public static void main(String[] args) {

        String myDriver = "org.gjt.mm.mysql.Driver";
        String myUrl = "jdbc:mysql://localhost/test";
        try {
            Class.forName(myDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection(myUrl, "root", "1234");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
