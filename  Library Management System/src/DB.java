import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    static Connection conn = null;
    public static Connection connect () {
        try {
            String url = "jdbc:mysql://localhost:3306/library_db";
            String userName = "root";
            String password = "Divyang@2936";

            conn = DriverManager.getConnection(url, userName, password);

        } catch(Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
