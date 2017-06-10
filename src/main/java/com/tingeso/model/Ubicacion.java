/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */

@Entity
@Table(name="ubicacion")

public class Ubicacion implements Serializable {
    
    @Id
    private int id_ubicacion;
    
    @Column(name="nombre_ubicacion")
    private String nombre_ubicacion;

    public int getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getNombre_ubicacion() {
        return nombre_ubicacion;
    }

    public void setNombre_ubicacion(String nombre_ubicacion) {
        this.nombre_ubicacion = nombre_ubicacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id_ubicacion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ubicacion other = (Ubicacion) obj;
        if (this.id_ubicacion != other.id_ubicacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "id_ubicacion=" + id_ubicacion + '}';
    }
    
    
    
}
