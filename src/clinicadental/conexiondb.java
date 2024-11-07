package clinicadental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexiondb {
    public static Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/clinica";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }
}
