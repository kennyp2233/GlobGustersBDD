/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back.SQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class consultasSQL {

    private Conexion conectar;

    public consultasSQL() {
        this.conectar = new Conexion();
    }

    public void insertarEmpleado(String ID_Empleado, String Nombre, String Agencia_ID, String AgenciaUIO_GYE) throws SQLException {
        try {

            Statement sql = conectar.getConnection().createStatement();
            StringBuilder std = new StringBuilder();

            conectar.getConnection().setAutoCommit(false);
            sql.execute("Set XACT_ABORT ON");

            std.append("INSERT INTO Empleado (ID_Empleado, Nombre, AgenciaUIO_GYE, Agencia_ID) VALUES (");
            std.append(ID_Empleado);
            std.append(", '");
            std.append(Nombre);
            std.append("', '");
            std.append(AgenciaUIO_GYE);
            std.append("', ");
            std.append(Agencia_ID);
            std.append(");");

            int filasActualizadas = sql.executeUpdate(std.toString());
            System.out.println("Registros de empleado en Quito insertado: " + filasActualizadas + "filas afectadas");
            conectar.commit();

        } catch (SQLException e) {
            conectar.rollback();
            e.printStackTrace();
        } finally {
            conectar.getConnection().setAutoCommit(true);
        }

    }

    public DefaultTableModel consultarEmpleados() {
        DefaultTableModel modeloTabla = new NoEditableTableModel();

        try {
            String std = "SELECT * FROM empleado;";
            Statement sql = conectar.getConnection().createStatement();
            ResultSet resultado = sql.executeQuery(std);

            // Configurar las columnas del modelo de tabla
            int numColumnas = resultado.getMetaData().getColumnCount();
            for (int i = 1; i <= numColumnas; i++) {
                modeloTabla.addColumn(resultado.getMetaData().getColumnName(i));

            }

            // Agregar las filas de resultados al modelo de tabla
            while (resultado.next()) {
                Object[] fila = new Object[numColumnas];
                int j = 1;

                for (int i = 1; i <= numColumnas; i++) {
                    fila[i - 1] = resultado.getObject(i);
                }
                j++;
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return modeloTabla;
    }

    public void actualizarEmpleado(String ID_Empleado, String Nombre, String Agencia_ID, String AgenciaUIO_GYE) throws SQLException {

        try {

            Statement sql = conectar.getConnection().createStatement();
            StringBuilder std = new StringBuilder();

            conectar.getConnection().setAutoCommit(false);
            sql.execute("Set XACT_ABORT ON");

            std.append("UPDATE Empleado SET ID_Empleado = '").append(ID_Empleado);
            std.append("',");
            std.append("Nombre = '").append(Nombre);
            std.append("',");
            std.append("AgenciaUIO_GYE = '").append(AgenciaUIO_GYE);
            std.append("',");
            std.append("Agencia_ID = '").append(Agencia_ID);
            std.append("' ");
            std.append("Where ID_Empleado = ").append(ID_Empleado);

            int filasActualizadas = sql.executeUpdate(std.toString());
            System.out.println("Registros de empleado insertado: " + filasActualizadas + "filas afectadas");

        } catch (SQLException e) {
            conectar.rollback();
            e.printStackTrace();
        } finally {
            conectar.getConnection().setAutoCommit(true);
        }

    }

    public void eliminarEmpleado(String ID_Empleado, String AgenciaUIO_GYE) throws SQLException {
        try {

            Statement sql = conectar.getConnection().createStatement();
            StringBuilder std = new StringBuilder();

            conectar.getConnection().setAutoCommit(false);
            sql.execute("Set XACT_ABORT ON");

            std.append("DELETE FROM Empleado WHERE ID_Empleado = '").append(ID_Empleado);
            std.append("'");

            int filasActualizadas = sql.executeUpdate(std.toString());
            System.out.println("Registros de empleado eliminado: " + filasActualizadas + "filas afectadas");

        } catch (SQLException e) {
            conectar.rollback();
            e.printStackTrace();
        } finally {
            conectar.getConnection().setAutoCommit(true);
        }
    }

    public class NoEditableTableModel extends DefaultTableModel {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Todas las celdas son de solo lectura
        }
    }

    public void agregarEjemplar(String ID_Ejemplar, String pelicula_id, String agencia_id, String ubicacion, String estado_conservacion) {
        try {

            Statement sql = conectar.getConnection().createStatement();
            StringBuilder std = new StringBuilder();
            std.append("EXEC  InsertarEjemplar ");
            std.append(Integer.parseInt(ID_Ejemplar));
            std.append(", ");
            std.append(Integer.parseInt(pelicula_id));
            std.append(", ");
            std.append(Integer.parseInt(agencia_id));
            std.append(", '");
            std.append(ubicacion);
            std.append("', '");
            std.append(estado_conservacion);
            std.append("';");

            int filasActualizadas = sql.executeUpdate(std.toString());
            System.out.println("Registro de ejemplar actualizado: " + filasActualizadas + " filas afectadas");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public DefaultTableModel consultarEjemplar() {
        DefaultTableModel modeloTabla = new NoEditableTableModel();

        try {
            String std = "SELECT * FROM ejemplar;";
            Statement sql = conectar.getConnection().createStatement();
            ResultSet resultado = sql.executeQuery(std);

            // Configurar las columnas del modelo de tabla
            int numColumnas = resultado.getMetaData().getColumnCount();
            for (int i = 1; i <= numColumnas; i++) {
                modeloTabla.addColumn(resultado.getMetaData().getColumnName(i));

            }

            // Agregar las filas de resultados al modelo de tabla
            while (resultado.next()) {
                Object[] fila = new Object[numColumnas];
                int j = 1;

                for (int i = 1; i <= numColumnas; i++) {
                    fila[i - 1] = resultado.getObject(i);
                }
                j++;
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return modeloTabla;
    }

    public void actualizarEjemplar(String ID_Ejemplar, String pelicula_id, String agencia_id, String ubicacion, String estado_conservacion) throws SQLException {

        try {

            Statement sql = conectar.getConnection().createStatement();
            StringBuilder std = new StringBuilder();

            conectar.getConnection().setAutoCommit(false);
            sql.execute("Set XACT_ABORT ON");

            std.append("EXEC  actualizarEjemplar ").append(ID_Ejemplar);
            std.append(", ");
            std.append(Integer.parseInt(pelicula_id));
            std.append(", ");
            std.append(Integer.parseInt(agencia_id));
            std.append(", '");
            std.append(ubicacion);
            std.append("', '");
            std.append(estado_conservacion);
            std.append("';");

            int filasActualizadas = sql.executeUpdate(std.toString());
            //System.out.println("Registros de ejemplares actualizados: " + filasActualizadas + "filas afectadas");

        } catch (SQLException e) {
            conectar.rollback();
            e.printStackTrace();
        } finally {
            conectar.getConnection().setAutoCommit(true);
        }

    }

    public void eliminarEjemplar(String ID_Ejemplar, String ubicacion) throws SQLException {
        try {

            Statement sql = conectar.getConnection().createStatement();
            StringBuilder std = new StringBuilder();

            conectar.getConnection().setAutoCommit(false);
            sql.execute("Set XACT_ABORT ON");

            std.append("EXEC  eliminarEjemplar ").append(ID_Ejemplar);
            std.append(", '");
            std.append(ubicacion);
            std.append("';");

            int filasActualizadas = sql.executeUpdate(std.toString());
            System.out.println("Registros de ejemplar eliminado: " + filasActualizadas + "filas afectadas");

        } catch (SQLException e) {
            conectar.rollback();
            e.printStackTrace();
        } finally {
            conectar.getConnection().setAutoCommit(true);
        }
    }

    public DefaultTableModel consultarAgencia(String Ubicacion) {
        DefaultTableModel modeloTabla = new NoEditableTableModel();
        try {
            String std = "SELECT * FROM agencia " + "Where Ubicacion = '"+Ubicacion+"';";
            Statement sql = conectar.getConnection().createStatement();
            ResultSet resultado = sql.executeQuery(std);

            // Configurar las columnas del modelo de tabla
            int numColumnas = resultado.getMetaData().getColumnCount();
            for (int i = 1; i <= numColumnas; i++) {
                modeloTabla.addColumn(resultado.getMetaData().getColumnName(i));

            }

            // Agregar las filas de resultados al modelo de tabla
            while (resultado.next()) {
                Object[] fila = new Object[numColumnas];
                int j = 1;

                for (int i = 1; i <= numColumnas; i++) {
                    fila[i - 1] = resultado.getObject(i);
                }
                j++;
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return modeloTabla;
    }

    public DefaultTableModel consultarPelicula(String valorColumna1) {
        DefaultTableModel modeloTabla = new NoEditableTableModel();

        try {
            String std = "SELECT * FROM PeliculasEjemplar Where Agencia_ID = " + Integer.parseInt(valorColumna1);
            Statement sql = conectar.getConnection().createStatement();
            ResultSet resultado = sql.executeQuery(std);

            // Configurar las columnas del modelo de tabla
            int numColumnas = resultado.getMetaData().getColumnCount();
            for (int i = 1; i <= numColumnas; i++) {
                modeloTabla.addColumn(resultado.getMetaData().getColumnName(i));

            }

            // Agregar las filas de resultados al modelo de tabla
            while (resultado.next()) {
                Object[] fila = new Object[numColumnas];
                int j = 1;

                for (int i = 1; i <= numColumnas; i++) {
                    fila[i - 1] = resultado.getObject(i);
                }
                j++;
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return modeloTabla;
    }
    
    public void alquilarPelicula(String agencia_id, String idSocio, String ubicacion ) throws SQLException{
         try {

            Statement sql = conectar.getConnection().createStatement();
            StringBuilder std = new StringBuilder();
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(new Date());
       
            
            /*std.append("UPDATE TABLE EjemplarAlquiler ");
            std.append("set estadoAlquiler = 'Rentado' ");
            std.append("Where pelicula_id = ").append(pelicula_id);          
            

            int filasActualizadas = sql.executeUpdate(std.toString());
            System.out.println("Registro de pelicula actualizado: " + filasActualizadas + " filas afectadas");
*/
            
            
            std.append("EXEC Alquilar ").append(agencia_id);
            std.append(", ");
            System.out.println(agencia_id);
            std.append(Integer.parseInt(idSocio));
            System.out.println(idSocio);
            std.append(", '");           
            std.append(ubicacion);
            System.out.println(ubicacion);
            std.append("', '");
            std.append("").append(formattedDate);
            System.out.println(formattedDate);
            std.append("',");
            std.append("NULL;");
            
            
            int filasActualizadas2 = sql.executeUpdate(std.toString());
            System.out.println("Registro de alquiler actualizado: " + filasActualizadas2 + " filas afectadas");
            
            
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        
    }
    
  
}
