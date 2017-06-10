/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */

@Entity
@Table(name="tipo_pago")

public class TipoPago implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_pago;
    
    @Column(name="nombre_tipo_pago")
    private String nombre_tipo_pago;

    public int getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(int id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public String getNombre_tipo_pago() {
        return nombre_tipo_pago;
    }

    public void setNombre_tipo_pago(String nombre_tipo_pago) {
        this.nombre_tipo_pago = nombre_tipo_pago;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id_tipo_pago;
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
        final TipoPago other = (TipoPago) obj;
        if (this.id_tipo_pago != other.id_tipo_pago) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TipoPago{" + "id_tipo_pago=" + id_tipo_pago + '}';
    }
    
    
    
}
