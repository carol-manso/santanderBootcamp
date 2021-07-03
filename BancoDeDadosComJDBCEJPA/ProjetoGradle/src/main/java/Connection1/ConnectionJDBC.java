package Connection1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionJDBC {
    public static Connection getConnection() {
        String driver = "postgresql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "aulajdbcjpa";
        String user = "";
        String password = "";

        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String urlConnection = sb.toString(); //sb.toString() == "jdbc:postgresql://localhost/aulajdbcjpa"
        Connection connection = null;
        try (Connection con = DriverManager.getConnection(urlConnection, user, password)){
            connection = con;
            System.out.println("SUCCESS :)");
        }catch (Exception e){
            System.out.println("FAILED :(");
            e.printStackTrace();
        }
        System.out.println(connection);
        return connection;
    }

}
