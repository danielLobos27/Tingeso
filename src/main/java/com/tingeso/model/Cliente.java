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
@Table(name="cliente")

public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cliente;
    
    @Column(name= "nombre_cliente")
    private String nombre_cliente;
    
    @Column(name= "usuario_cliente")
    private String usuario_cliente;
    
    @Column(name= "pass_cliente")
    private String pass_cliente;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getUsuario_cliente() {
        return usuario_cliente;
    }

    public void setUsuario_cliente(String usuario_cliente) {
        this.usuario_cliente = usuario_cliente;
    }

    public String getPass_cliente() {
        return pass_cliente;
    }

    public void setPass_cliente(String pass_cliente) {
        this.pass_cliente = pass_cliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id_cliente;
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
        final Cliente other = (Cliente) obj;
        if (this.id_cliente != other.id_cliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + '}';
    }
            
    
    
}
