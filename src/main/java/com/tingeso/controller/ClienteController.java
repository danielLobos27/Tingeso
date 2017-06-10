/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.controller;

import com.tingeso.ejb.ClienteFacadeLocal;
import com.tingeso.model.Cliente;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Daniel
 */

@Named
@ViewScoped

public class ClienteController implements Serializable{
    
    @EJB
    private ClienteFacadeLocal clienteEJB;
    
    @Inject
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @PostConstruct
    public void init(){
        
        //cliente = new Cliente();
        
    }
    
    public void registrar(){
    
        try{
        
            clienteEJB.create(cliente);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso","Se ha registrado"));
            
        }catch(Exception e){}
    
    }
    
    
}
