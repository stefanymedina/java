/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;



import java.sql.*;



/**
 *
 * @author stefanymedina
 */
public class TestMysqlJdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useTimezone=true&erverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver"); cuando trabajamos con app web en caso de que no nos podamos conectar agregamos esta linea para conexiones locales no es necesario ç
            Connection conexion = DriverManager.getConnection(url,"root", "1234");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT id_persona, nombre, apellido, email, telefno FROM persona;";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("id persona:" + resultado.getInt("id_persona"));
                System.out.print(" Nombre:" + resultado.getString("nombre"));
                System.out.print(" Apellido:" + resultado.getString("apellido"));
                System.out.print(" email:" + resultado.getString("email"));
                System.out.print(" telefono:" + resultado.getString("telefno") +"\n");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
  }    