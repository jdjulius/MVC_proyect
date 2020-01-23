/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ine-1
 */
public class conexion {

    Connection con;
    String url = "jdbc:postgresql://10.0.4.174:5432/Ventas";
    String driver = "org.postgresql.Driver";
    String user = "postgres";
    String clave = "123456";

    public conexion() {

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, clave);

        } catch (Exception er) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, er);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
