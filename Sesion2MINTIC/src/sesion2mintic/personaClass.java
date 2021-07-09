/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2mintic;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class personaClass {
    //Atributos de la clase
    private String nombre;
    private int edad;
    private int personasVive;
    private int numeroDoc;
    
    //Metodos de la clase 
    public void pedirDatos(){
        nombre = JOptionPane.showInputDialog("Digite su nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
        personasVive = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de personas con las que vive"));
        numeroDoc = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de documento"));
        
    }
    
    public void consultarDatos(){
        System.out.println("Su nombre es: "+nombre+"\n" + "Vive con "+personasVive+" mas \n" +"y su numero de documento es " +numeroDoc);
        
    }
    
    public void validarEdad(){
        if(edad < 18){
            System.out.println("Su edad es "+ edad +" y es menor de edad");
        }else{
            System.out.println("Su edad es "+ edad +" y es mayor de edad ");
        }
        
    }
    
    
}
