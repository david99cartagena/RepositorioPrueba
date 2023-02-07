/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pc_Estiven
 */
public class conexion {

    Connection condavid;
    String url = "jdbc:mysql://localhost:3306/pruebainetum";
    String user = "root";
    String pass = "1234";

    public Connection ConexionDavid() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            condavid = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        
        return condavid;
    }
}
