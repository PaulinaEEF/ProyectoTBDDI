
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Judá Aarón
 */
public class conectarBase {
        public static Connection getConexion() {

        String conexionUrl = "jdbc:proyectofinal.ctaduxdfxkkv.us-east-1.rds.amazonaws.com://localhost:1433;"
                + "database=proyectoFinal;"
                + "user=Equipo1;"
                + "password=DPJREP**;"
                + "loginTimeout=20";

        try {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException e) {
            return null;
        }

    }
}
