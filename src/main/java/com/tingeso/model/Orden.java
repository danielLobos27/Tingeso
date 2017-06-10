/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel
 */

@Entity

@Table(name="orden")

public class Orden implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_orden;
    
    @ManyToOne
    @JoinColumn(name= "id_cliente")
    private Cliente id_cliente;
    
    @ManyToOne
    @JoinColumn(name= "id_ubicacion")
    private Ubicacion id_ubicacion;
    
    @ManyToOne
    @JoinColumn(name= "id_pago")
    private Pago id_pago;
    
    @Column(name= "total_orden")
    private int total_orden;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name= "dia_orden")
    private Date dia_orden;
    
    @Column(name= "terminada_orden")
    private short terminada_orden;
    
    @Column(name= "despacho_orden")
    private short despacho_orden;

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Ubicacion getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(Ubicacion id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public Pago getId_pago() {
        return id_pago;
    }

    public void setId_pago(Pago id_pago) {
        this.id_pago = id_pago;
    }

    public int getTotal_orden() {
        return total_orden;
    }

    public void setTotal_orden(int total_orden) {
        this.total_orden = total_orden;
    }

    public Date getDia_orden() {
        return dia_orden;
    }

    public void setDia_orden(Date dia_orden) {
        this.dia_orden = dia_orden;
    }

    public short getTerminada_orden() {
        return terminada_orden;
    }

    public void setTerminada_orden(short terminada_orden) {
        this.terminada_orden = terminada_orden;
    }

    public short getDespacho_orden() {
        return despacho_orden;
    }

    public void setDespacho_orden(short despacho_orden) {
        this.despacho_orden = despacho_orden;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id_orden;
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
        final Orden other = (Orden) obj;
        if (this.id_orden != other.id_orden) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Orden{" + "id_orden=" + id_orden + '}';
    }
    
    
    
}
