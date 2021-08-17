/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4mintic;

/**
 *
 * @author ASUS
 */
public class proveedores {
    private String nombre;
    private int NIT;
    private String direccion;
    private String razonSocial;
    private int telefono;
    private String representanteLegal;
    private String Sitioweb;
    private String correoEmpresarial;


    
    //CONSTRUCTOR 

    public proveedores(String nombre, int NIT, String direccion, String razonSocial, int telefono, String representanteLegal, String Sitioweb, String correoEmpresarial) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.direccion = direccion;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.representanteLegal = representanteLegal;
        this.Sitioweb = Sitioweb;
        this.correoEmpresarial = correoEmpresarial;
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
     * @return the NIT
     */
    public int getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(int NIT) {
        this.NIT = NIT;
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
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the representanteLegal
     */
    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    /**
     * @param representanteLegal the representanteLegal to set
     */
    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    /**
     * @return the Sitioweb
     */
    public String getSitioweb() {
        return Sitioweb;
    }

    /**
     * @param Sitioweb the Sitioweb to set
     */
    public void setSitioweb(String Sitioweb) {
        this.Sitioweb = Sitioweb;
    }

    /**
     * @return the correoEmpresarial
     */
    public String getCorreoEmpresarial() {
        return correoEmpresarial;
    }

    /**
     * @param correoEmpresarial the correoEmpresarial to set
     */
    public void setCorreoEmpresarial(String correoEmpresarial) {
        this.correoEmpresarial = correoEmpresarial;
    }
    
    
}
