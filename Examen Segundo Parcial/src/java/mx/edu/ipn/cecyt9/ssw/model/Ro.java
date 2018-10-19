/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.ssw.model;

import java.io.Serializable;


/**
 *
 * @author Alumno
 */

public class Ro implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idRo;
   
    private String descripcion;
   
    private Registro registro;

    public Ro() {
    }

    public Ro(Integer idRo) {
        this.idRo = idRo;
    }

    public Integer getIdRo() {
        return idRo;
    }

    public void setIdRo(Integer idRo) {
        this.idRo = idRo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

   
    @Override
    public String toString() {
        return "mx.edu.ipn.cecyt9.ssw.model.Ro[ idRo=" + idRo + " ]";
    }
    
}
