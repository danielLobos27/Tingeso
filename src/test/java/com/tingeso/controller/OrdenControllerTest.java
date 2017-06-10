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
     * Test of getCliente method, of class OrdenController.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        OrdenController instance = new OrdenController();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }


    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        OrdenController instance = new OrdenController();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    @Test
    public void testGetTipoPago() {
        System.out.println("getTipoPago");
        OrdenController instance = new OrdenController();
        TipoPago expResult = null;
        TipoPago result = instance.getTipoPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testSetTipoPago() {
        System.out.println("setTipoPago");
        TipoPago tipoPago = null;
        OrdenController instance = new OrdenController();
        instance.setTipoPago(tipoPago);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetTipoPagos() {
        System.out.println("getTipoPagos");
        OrdenController instance = new OrdenController();
        List<TipoPago> expResult = null;
        List<TipoPago> result = instance.getTipoPagos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testSetTipoPagos() {
        System.out.println("setTipoPagos");
        List<TipoPago> tipoPagos = null;
        OrdenController instance = new OrdenController();
        instance.setTipoPagos(tipoPagos);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    @Test
    public void testGetPago() {
        System.out.println("getPago");
        OrdenController instance = new OrdenController();
        Pago expResult = null;
        Pago result = instance.getPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

  
    @Test
    public void testSetPago() {
        System.out.println("setPago");
        Pago pago = null;
        OrdenController instance = new OrdenController();
        instance.setPago(pago);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetOrden() {
        System.out.println("getOrden");
        OrdenController instance = new OrdenController();
        Orden expResult = null;
        Orden result = instance.getOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    @Test
    public void testSetOrden() {
        System.out.println("setOrden");
        Orden orden = null;
        OrdenController instance = new OrdenController();
        instance.setOrden(orden);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    @Test
    public void testGetMenu() {
        System.out.println("getMenu");
        OrdenController instance = new OrdenController();
        Menu expResult = null;
        Menu result = instance.getMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    @Test
    public void testSetMenu() {
        System.out.println("setMenu");
        Menu menu = null;
        OrdenController instance = new OrdenController();
        instance.setMenu(menu);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetMenues() {
        System.out.println("getMenues");
        OrdenController instance = new OrdenController();
        List<Menu> expResult = null;
        List<Menu> result = instance.getMenues();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetMenues() {
        System.out.println("setMenues");
        List<Menu> menues = null;
        OrdenController instance = new OrdenController();
        instance.setMenues(menues);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    @Test
    public void testGetUbicacion() {
        System.out.println("getUbicacion");
        OrdenController instance = new OrdenController();
        Ubicacion expResult = null;
        Ubicacion result = instance.getUbicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetUbicacion() {
        System.out.println("setUbicacion");
        Ubicacion ubicacion = null;
        OrdenController instance = new OrdenController();
        instance.setUbicacion(ubicacion);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetUbicaciones() {
        System.out.println("getUbicaciones");
        OrdenController instance = new OrdenController();
        List<Ubicacion> expResult = null;
        List<Ubicacion> result = instance.getUbicaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetUbicaciones() {
        System.out.println("setUbicaciones");
        List<Ubicacion> ubicaciones = null;
        OrdenController instance = new OrdenController();
        instance.setUbicaciones(ubicaciones);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetUnionMenuOrden() {
        System.out.println("getUnionMenuOrden");
        OrdenController instance = new OrdenController();
        UnionMenuOrden expResult = null;
        UnionMenuOrden result = instance.getUnionMenuOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testSetUnionMenuOrden() {
        System.out.println("setUnionMenuOrden");
        UnionMenuOrden unionMenuOrden = null;
        OrdenController instance = new OrdenController();
        instance.setUnionMenuOrden(unionMenuOrden);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testInit() {
        System.out.println("init");
        OrdenController instance = new OrdenController();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        
    }


    @Test
    public void testComprar() {
        System.out.println("comprar");
        OrdenController instance = new OrdenController();
        instance.comprar();
        // TODO review the generated test code and remove the default call to fail.
       
    }


    @Test
    public void testOrdenar() {
        System.out.println("ordenar");
        OrdenController instance = new OrdenController();
        instance.ordenar();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testOrdenarComida() {
        System.out.println("ordenarComida");
        OrdenController instance = new OrdenController();
        instance.ordenarComida();
        // TODO review the generated test code and remove the default call to fail.
       
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
