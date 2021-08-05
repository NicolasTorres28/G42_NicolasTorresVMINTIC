/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2mintic;

/**
 *
 * @author ASUS
 */
public class clienteClass extends personaClass{
    private String direccion;
    private int telefono;
    
    //CONSTRUCTOR

    public clienteClass(String direccion, int telefono, String nombre, String apellidos, int documento, String correoElectronico) {
        super(nombre, apellidos, documento, correoElectronico);
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
}
