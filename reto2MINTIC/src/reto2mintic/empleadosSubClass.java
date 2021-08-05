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
public class empleadosSubClass extends personaClass{
    private int salario;
    private String cargo;
    private int nivelJerarquico;
 
    //CONSTRUCTOR

    public empleadosSubClass(int salario, String cargo, int nivelJerarquico, String nombre, String apellidos, int documento, String correoElectronico) {
        super(nombre, apellidos, documento, correoElectronico);
        this.salario = salario;
        this.cargo = cargo;
        this.nivelJerarquico = nivelJerarquico;
    }
    
    
    
    
 
}
