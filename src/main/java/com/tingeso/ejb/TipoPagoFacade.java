/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.ejb;

import com.tingeso.model.TipoPago;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Daniel
 */
@Stateless
public class TipoPagoFacade extends AbstractFacade<TipoPago> implements TipoPagoFacadeLocal {

    @PersistenceContext(unitName = "tingesoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoPagoFacade() {
        super(TipoPago.class);
    }
    
}
