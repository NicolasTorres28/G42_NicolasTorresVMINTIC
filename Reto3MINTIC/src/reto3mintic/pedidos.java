/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3mintic;

/**
 *
 * @author ASUS
 */
public class pedidos {
    private int id;
    private int nroProductos;
    
    //CONSTRUCTOR 

    public pedidos(int id, int nroProductos) {
        this.id = id;
        this.nroProductos = nroProductos;
    }
    
    //GETTER Y SETTER

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nroProductos
     */
    public int getNroProductos() {
        return nroProductos;
    }

    /**
     * @param nroProductos the nroProductos to set
     */
    public void setNroProductos(int nroProductos) {
        this.nroProductos = nroProductos;
    }
   
    public void agregar(){
        
        
    }
    
    
}
