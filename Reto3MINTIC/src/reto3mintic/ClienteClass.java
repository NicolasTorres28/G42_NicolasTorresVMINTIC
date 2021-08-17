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
public class ClienteClass {
    private String nombre;
    private int id;
    private String direccion;
    private int celular;
    private String correo;

    //Constructor 
    public ClienteClass(String nombre, int id, String direccion, int celular, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
    }
    
    
    //GETTER Y SETTER

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the celular
     */
    public int getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(int celular) {
        this.celular = celular;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    public void agregarCliente(){
        String nombre = txtNombre.getNombre();
        int documento = txtDocumento.getDocumento();
        String dirrecion = txtDireccion.getDireccion();
        int celular = txtCelular.getCelular();
        String correo = txtCorreo();
    
    }
    
    
    
    
    
    
    
}
