/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicadental;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Metodo {
    


public static boolean Insertar(persona x) {
    Connection con = conexiondb.conectar();
    PreparedStatement ps = null;
    String sql = "INSERT INTO clientes (Nombre, Telefono, DPI, Correo   ) VALUES (?,?,?,?,?)";
    try {
        ps = con.prepareStatement(sql);
        
        ps.setString(1, x.getNombre());          // Nombre
        ps.setInt(2, x.getTelefono());           // Telefono (int o long)
        ps.setInt(3, x.getDpi());                // DPI (int o long)
        ps.setString(4, x.getCorreo());          // Correo (String)
        
        // Conversión de fecha si `x.getFecha()` devuelve un String en formato "yyyy-MM-dd"
        
      //  ps.setInt(5, x.getFecha());

        ps.execute();
        con.close();
        return true;

    } catch (SQLException e) {
        System.out.println(e.toString());
        return false;
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.toString());
        }
    }
}

    
    
    
    
}
