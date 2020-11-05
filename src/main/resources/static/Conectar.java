import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
    
    private static Connenction conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String usuario = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/poo";
    
    public Conectar(){
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, password);

            if (conn != null){
                System.out.println("Conexion Establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar " + e);
        }
    }

    public Connection getConectar (){
        return conn;
    }

    public void Desconectar(){
        conn = null;
        if (conn == null){
            System.out.println("Conexion Finalizada");
        }
    }
}
