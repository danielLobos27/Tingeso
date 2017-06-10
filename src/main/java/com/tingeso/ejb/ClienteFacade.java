/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.ejb;

import com.tingeso.model.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Daniel
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> implements ClienteFacadeLocal {

    @PersistenceContext(unitName = "tingesoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }
    
    @Override
    public Cliente iniciarSesion(Cliente cli){
    
        Cliente cliente = null;
        String consulta;
        
        try{
            
            consulta = "FROM Cliente c WHERE c.usuario_cliente= ?1 and c.pass_cliente= ?2 ";
            Query query = em.createQuery(consulta);
            query.setParameter(1, cli.getUsuario_cliente());
            query.setParameter(2, cli.getPass_cliente());
            
            List<Cliente> lista= query.getResultList();
            if(!lista.isEmpty()){
                cliente= lista.get(0);
            }
            
        }catch(Exception e){
        }
        return cliente;
    }
    
}
