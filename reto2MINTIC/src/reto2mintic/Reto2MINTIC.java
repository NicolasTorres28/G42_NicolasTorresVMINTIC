/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2mintic;


import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author ASUS
 */
public class Reto2MINTIC {

    static Scanner inst_in_data =  new Scanner(System.in);
    
    public static void crudEmpleados(){
        ArrayList<empleadosSubClass> listaEmpleados = new ArrayList<>();
        boolean salir = false;
        
        while(!salir){
         System.out.println( "INGRESA UNA OPCIÓN" );
            System.out.println("    1. Crear empleados");
            System.out.println("    2. Listar empleados");
            System.out.println("    3. Editar empleado específico");
            System.out.println("    4. Eliminar empleado específico");
            System.out.println("    5. SALIR" );
            System.out.println("Opción: ");
            int opcion = Integer.parseInt(inst_in_data.nextLine());
            //add(valor)
            //instancia.get()
            //instancia.set(indice, valor)
            //remove(indice)
        
            switch(opcion){
                case 1:
                    System.out.println("Cuantos empleados desea ingresar\n");
                    int numeroEmpleados = Integer.parseint(inst_in_data.nextLine());
                    System.out.println("Ingrese la informacion del empelado\n");
                    
                    for(int i = 1; i <= numeroEmpleados; i++){
                        System.out.println("/////////////////////////////////////\n");
                        System.out.println("Nombre: ");
                        String nombre = inst_in_data.nextLine();
                        System.out.println("Documento: ");
                        int documento = inst_in_data.nextLine();
                        System.out.println("Correo Electronico: ");
                        String correoElectronico = inst_in_data.nextLine();
                        System.out.println("Nivel Jerarquico: ");
                        int nivelJerarquico = inst_in_data.nextLine();
                        System.out.println("Cargo: ");
                        String cargo =  inst_in_data.nextLine();
                        System.out.println("Salario: ");
                        int salario = inst_in_data.nextLine();
                        
                        empleadosSubClass empleado = new empleadosSubClass(String nombre,int documento,String correoElectronico,int nivelJerarquico,String cargo);
                        listaEmpleados.add(empleado);
                }
                    
            }
            
            
        }
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
