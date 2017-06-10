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
import javax.inject.Named;

/**
 *
 * @author Daniel
 */

@Named
@ViewScoped

public class IndexController implements Serializable{
    
    @EJB
    private ClienteFacadeLocal EJBCliente;
    private Cliente cliente;
    
    @PostConstruct
    public void init(){
        cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String iniciarSesion(){
        Cliente cli;
        
        String redireccion=null;
        
        try{
            cli= EJBCliente.iniciarSesion(cliente);
            if(cli!=null){
                
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("cliente", cli);
                
                redireccion ="/protegido/OrderMeal?faces-redirect=true";
            }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Aviso","Ingrese bien los datos por favor :) "));
        
            }
            
            
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso","Error"));
        }
        return redireccion;
    }
    
}
