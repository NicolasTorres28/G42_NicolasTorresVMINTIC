/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class Conexion {
    Connection con ;
    public Conexion(){
        try{
            Class.ForName("http://localhost/phpmyadmin/index.php?route=/sql&server=1&db=reto3minticclientes&table=clientes&pos=0");
            con=DriverManager.getConnection("se ha conectado")
        }catch (Exception e){}
    
    }
    public Connection getConnection(){
        return con;
    }
}
