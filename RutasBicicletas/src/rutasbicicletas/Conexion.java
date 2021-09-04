/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutasbicicletas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author omen
 */
public class Conexion {
    Connection connection;
    
        public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rutasciclistas_bd","root","");
            
            if (connection!=null) {
                System.out.println("Conexion exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e);
        }
    }
        
    public Connection getConnection(){
        return connection;
    }    
        
}
