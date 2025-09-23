package run;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;

        try{
            conn = utils.Conexion.get();
            if (conn != null) {
                System.out.println("Conexión exitosa a la base de datos");
            } else {
                System.out.println("No se pudo conectar a la base de datos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
