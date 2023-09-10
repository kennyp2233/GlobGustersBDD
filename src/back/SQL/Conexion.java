package back.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//gitasda
public class Conexion {

    private static Connection conn;
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String user = "sa";
    private static final String password = "P@ssw0rd";
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=GlobGusters-Guayaquil";

    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=GlobGusters-Quito;user=sa;password=P@ssw0rd;encrypt=false;loginTimeout=100;");;
            if (conn != null) {
                System.out.println("Conexión establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e);
        }
    }

    public void commit() {
        try {
            conn.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void rollback() {
        try {
            conn.rollback();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //------------------------GETTERS Y SETTERS------------------------
    public Connection getConnection() {
        return conn;
    }

    public void desconectar() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Conexión terminada");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e);
        }
    }

}