/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.ejb;

import com.tingeso.model.UnionMenuOrden;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Daniel
 */
@Local
public interface UnionMenuOrdenFacadeLocal {

    void create(UnionMenuOrden unionMenuOrden);

    void edit(UnionMenuOrden unionMenuOrden);

    void remove(UnionMenuOrden unionMenuOrden);

    UnionMenuOrden find(Object id);

    List<UnionMenuOrden> findAll();

    List<UnionMenuOrden> findRange(int[] range);

    int count();
    
}
