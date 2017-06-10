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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */

@Entity
@Table(name="pago")

public class Pago implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pago;
    
    @ManyToOne
    @JoinColumn(name="id_tipo_pago")
    private TipoPago id_tipo_pago;
    
    @Column(name="costo_pago")
    private int costo_pago;

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public TipoPago getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(TipoPago id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public int getCosto_pago() {
        return costo_pago;
    }

    public void setCosto_pago(int costo_pago) {
        this.costo_pago = costo_pago;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id_pago;
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
        final Pago other = (Pago) obj;
        if (this.id_pago != other.id_pago) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pago{" + "id_pago=" + id_pago + '}';
    }
    
    
    
}
