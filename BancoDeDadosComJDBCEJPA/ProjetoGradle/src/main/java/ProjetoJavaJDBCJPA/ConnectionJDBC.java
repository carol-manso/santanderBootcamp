package ProjetoJavaJDBCJPA;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionJDBC {
    public static Connection getConnection() {
        Connection connection = null;
        String driver = "postgresql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "aulajdbcjpa";
        String user = "";
        String password = "";

        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String connectionUrl = sb.toString(); //sb.toString() == "jdbc:postgresql://localhost/aulajdbcjpa"
        try {
            connection = DriverManager.getConnection(connectionUrl, user, password);
        } catch (SQLException e) {
            System.out.println("FALHA ao tentar criar conexão");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
