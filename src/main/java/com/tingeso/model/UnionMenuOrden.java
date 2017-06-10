/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity

@Table(name= "union_menu_orden")

public class UnionMenuOrden implements Serializable {
    
    @Id
    @ManyToOne
    @JoinColumn(name= "id_orden", nullable = false)
    private Orden id_orden;
    
    @ManyToOne
    @JoinColumn(name= "id_menu")
    private Menu id_menu;

    public Orden getId_orden() {
        return id_orden;
    }

    public void setId_orden(Orden id_orden) {
        this.id_orden = id_orden;
    }

    public Menu getId_menu() {
        return id_menu;
    }

    public void setId_menu(Menu id_menu) {
        this.id_menu = id_menu;
    }   
}
