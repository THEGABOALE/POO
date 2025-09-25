package run;

import utils.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        conn = Conexion.getConnection();
        if (conn != null) {
            System.out.println("Conectado");
        } else {
            System.out.println("No Conectado");
        }
    }
}
