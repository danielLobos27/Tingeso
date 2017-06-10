/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel
 */

@Entity

@Table(name = "menu")

public class Menu implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_menu;
    
    @Column(name= "nombre_menu")
    private String nombre_menu;
    
    @Column(name="precio_menu")
    private int precio_menu;
    
    @Column(name="cant_disponible")
    private int cant_disponible;
    
    @Column(name="tiempo_preparacion")
    private int tiempo_preparacion;
    
    @Column(name="especial_menu")
    private int especial_menu;
    
    /*@Temporal(TemporalType.TIMESTAMP)
    @Column(name="dia_especial_menu", insertable=false)
    private Date dia_especial_menu;*/

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getNombre_menu() {
        return nombre_menu;
    }

    public void setNombre_menu(String nombre_menu) {
        this.nombre_menu = nombre_menu;
    }

    public int getPrecio_menu() {
        return precio_menu;
    }

    public void setPrecio_menu(int precio_menu) {
        this.precio_menu = precio_menu;
    }

    public int getCant_disponible() {
        return cant_disponible;
    }

    public void setCant_disponible(int cant_disponible) {
        this.cant_disponible = cant_disponible;
    }

    
    
    public int getTiempo_preparacion() {
        return tiempo_preparacion;
    }

    public void setTiempo_preparacion(int tiempo_preparacion) {
        this.tiempo_preparacion = tiempo_preparacion;
    }

    public int getEspecial_menu() {
        return especial_menu;
    }

    public void setEspecial_menu(int especial_menu) {
        this.especial_menu = especial_menu;
    }

   /* public Date getDia_especial_menu() {
        return dia_especial_menu;
    }

    public void setDia_especial_menu(Date dia_especial_menu) {
        this.dia_especial_menu = dia_especial_menu;
    }*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id_menu;
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
        final Menu other = (Menu) obj;
        if (this.id_menu != other.id_menu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Menu{" + "id_menu=" + id_menu + '}';
    }
    
    
    
}
