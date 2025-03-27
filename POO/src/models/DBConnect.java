
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnect {
    // Constantes de conexión a la base de datos
    public final String URLDB = "jdbc:mysql://localhost:3306/";
    public final String USERDB = "root";
    public final String PASSDB = "";
    public final String DBNAME = "contact";
    
    // Método que se encarga de obtener la conexión a la base de datos
    public Connection getConnection() {
        // Iniciamos una conexión con un valor Nulo
        Connection con = null;
        // Utilizamos un Try y Catch para atrapar el error en caso de ocurrencia
        try {
            // Utilizamos el driver requerido (mysql)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecemos la conexión
            con = (Connection) DriverManager.getConnection(URLDB + DBNAME, USERDB, PASSDB);
            // Si ocurre un error cuando se establece la conexión, esta se atrapa aquí
        } catch (ClassNotFoundException|SQLException e) {
            // Muestra un mensaje de error y termina la ejecución de la aplicación
            JOptionPane.showMessageDialog(null, "Error: NO fue posible conectarme a la base de datos.");
            System.exit(0);
        }
        // En caso que se establezca la conexión sin problemas la retornamos
        return con;
    }
}