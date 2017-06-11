/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.controller;

import com.tingeso.model.Cliente;
import com.tingeso.model.Menu;
import com.tingeso.model.Orden;
import com.tingeso.model.Pago;
import com.tingeso.model.TipoPago;
import com.tingeso.model.Ubicacion;
import com.tingeso.model.UnionMenuOrden;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class OrdenControllerTest {
    
    public OrdenControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of add method, of class OrdenController.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 2;
        OrdenController instance = new OrdenController();
        int expResult = 4;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
}
