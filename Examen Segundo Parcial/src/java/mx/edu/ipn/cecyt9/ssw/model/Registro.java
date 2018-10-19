/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.ssw.model;

import java.io.Serializable;
import java.util.Collection;



/**
 *
 * @author Alumno
 */

public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idRegistro;
   
    private String nombre;
   
    private String apellido;
   
    private Collection<Ro> roCollection;

    public Registro() {
    }

    public Registro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    @Override
    public String toString() {
        return "mx.edu.ipn.cecyt9.ssw.model.Registro[ idRegistro=" + idRegistro + " ]";
    }
    
}
