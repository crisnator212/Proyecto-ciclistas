/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutasbicicletas;

import Vistas.Registro;

/**
 *
 * @author omen
 */
public class RutasBicicletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion inst_con = new Conexion();
       Registro inst_frame = new Registro();
       inst_frame.setVisible(true);
       inst_con.getConnection();
    }
    
}
