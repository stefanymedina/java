package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stefanymedina
 *
 * Esta es una clase que realizara las operaciones de crear leer actualizar (se
 * les conoce como DAO) DAO = data access object en este caso se realizaran
 * sobre la clase de entidad persona
 *
 */
public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?,?,?,?)";
    private static final String SQL_DELET = "DELETE FROM persona where id_persona=?";
    private static final String SQL_UPDATE_ALL = "UPDATE persona SET nombre=?, apellido = ?, email = ?, telefono = ? where id_persona=?";

    public List<Persona> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return personas;
    }

    public int insertar(Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int registros = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }

    public void eliminar(int idPersona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELET);
            stmt.setInt(1, idPersona);
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        
        System.out.println("Se ha eliminado la persona");
    }
    
    public void actualizar(int idPersona, String nombre, String apellido, String email, String telefono ){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE_ALL);
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setString(3, email);
            stmt.setString(4, telefono);
            stmt.setInt(5, idPersona);
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        finally{
            try {
                close(stmt);
                close(conn);
                
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
