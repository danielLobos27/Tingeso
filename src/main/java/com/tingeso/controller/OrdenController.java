/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tingeso.controller;

import com.tingeso.ejb.MenuFacadeLocal;
import com.tingeso.ejb.OrdenFacadeLocal;
import com.tingeso.ejb.PagoFacadeLocal;
import com.tingeso.ejb.TipoPagoFacadeLocal;
import com.tingeso.ejb.UbicacionFacadeLocal;
import com.tingeso.ejb.UnionMenuOrdenFacadeLocal;
import com.tingeso.model.Cliente;
import com.tingeso.model.Menu;
import com.tingeso.model.Orden;
import com.tingeso.model.Pago;
import com.tingeso.model.TipoPago;
import com.tingeso.model.Ubicacion;
import com.tingeso.model.UnionMenuOrden;
import java.io.Serializable;
import java.util.List;
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

public class OrdenController implements Serializable{
    
    @Inject
    private Cliente cliente;
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @EJB
    private TipoPagoFacadeLocal tipoPagoEJB;
    
    @Inject
    private TipoPago tipoPago;
    
    private List<TipoPago> tipoPagos;

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public List<TipoPago> getTipoPagos() {
        return tipoPagos;
    }

    public void setTipoPagos(List<TipoPago> tipoPagos) {
        this.tipoPagos = tipoPagos;
    }
    
    @EJB
    private PagoFacadeLocal pagoEJB;
    
    @Inject
    private Pago pago;

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    @EJB
    private OrdenFacadeLocal ordenEJB;
    
    @Inject
    private Orden orden;

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    
    @EJB
    private MenuFacadeLocal menuEJB;
    
    @Inject
    private Menu menu;
    
    private List<Menu> menues;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Menu> getMenues() {
        return menues;
    }

    public void setMenues(List<Menu> menues) {
        this.menues = menues;
    }
    
    @EJB
    private UbicacionFacadeLocal ubicacionEJB;
    
    @Inject
    private Ubicacion ubicacion;
    
    private List<Ubicacion> ubicaciones;

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
    
    @EJB
    private UnionMenuOrdenFacadeLocal unionMenuOrdenEJB;
    
    @Inject
    private UnionMenuOrden unionMenuOrden;

    public UnionMenuOrden getUnionMenuOrden() {
        return unionMenuOrden;
    }

    public void setUnionMenuOrden(UnionMenuOrden unionMenuOrden) {
        this.unionMenuOrden = unionMenuOrden;
    }

    
    
    
    
    
    @PostConstruct
    public void init(){
        Cliente cli = (Cliente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cliente");
        cliente.setId_cliente(cli.getId_cliente());
        cliente.setUsuario_cliente(cli.getUsuario_cliente());
        cliente.setNombre_cliente(cli.getNombre_cliente());
        tipoPagos = tipoPagoEJB.findAll();
        menues = menuEJB.findAll();
        ubicaciones = ubicacionEJB.findAll();

    }
    
    public void comprar(){
        
        try{
        
            pago.setId_tipo_pago(tipoPago);
            pagoEJB.create(pago);
            
        }catch(Exception e){}
        
    }
    
    
    public void ordenar(){
        try{
        orden.setId_cliente(cliente);
        orden.setId_ubicacion(ubicacion);
        orden.setId_pago(pago);
        
        orden.setTotal_orden(0);
        
        short terminadaOrden = 0;
        short despachoOrden=1; 
                
        orden.setTerminada_orden(terminadaOrden);
        orden.setDespacho_orden(despachoOrden);
        
        ordenEJB.create(orden);}
        catch(Exception e){}
    }
    
    
    public void ordenarComida(){
        
        try{
            pago.setId_tipo_pago(tipoPago);
            pagoEJB.create(pago);
            orden.setId_cliente(cliente);
            orden.setId_ubicacion(ubicacion);
            orden.setId_pago(pago);

            orden.setTotal_orden(0);

            short terminadaOrden = 0;
            short despachoOrden=1; 

            orden.setTerminada_orden(terminadaOrden);
            orden.setDespacho_orden(despachoOrden);

            ordenEJB.create(orden);
            
            unionMenuOrden.setId_menu(menu);
            unionMenuOrden.setId_orden(orden);
            
            unionMenuOrdenEJB.create(unionMenuOrden);
            
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso","Se ha ordenado su comida"));
            
        }catch(Exception e){}
    
    }
    
    
    public int add(int a,int b){
        return a+b;
    }
    
    
    
    
    
  /*  @EJB
    private OrdenFacadeLocal ordenEJB;
    
    @EJB
    private UbicacionFacadeLocal ubicacionEJB;
    
    @EJB
    private MenuFacadeLocal menuEJB;
    
    @EJB
    private PagoFacadeLocal pagoEJB;
    
    @EJB
    private TipoPagoFacadeLocal tipoPagoEJB;
    
    @Inject
    private TipoPago tipoPago;
    
    @Inject
    private Orden orden;
    
    @Inject
    private Cliente cliente;
    
    @Inject
    private Ubicacion ubicacion;
    
    @Inject
    private Pago pago;
    
    @Inject 
    private Menu menu;
    
    
    private List<Menu> menues;
    
    private List<Ubicacion> ubicaciones;
    
    private List<TipoPago> tipoPagos;
    
    private List<Pago> pagos;

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public List<TipoPago> getTipoPagos() {
        return tipoPagos;
    }

    public void setTipoPagos(List<TipoPago> tipoPagos) {
        this.tipoPagos = tipoPagos;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }    

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Menu> getMenues() {
        return menues;
    }

    public void setMenues(List<Menu> menues) {
        this.menues = menues;
    }
    
    public List<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
       
    @PostConstruct
    public void init(){
        Cliente cli = (Cliente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cliente");
        cliente.setId_cliente(cli.getId_cliente());
        cliente.setUsuario_cliente(cli.getUsuario_cliente());
        ubicaciones = ubicacionEJB.findAll();
        menues = menuEJB.findAll();
        tipoPagos = tipoPagoEJB.findAll();

    }
    
    public void comprar(){
        
        try{
            pago.setId_tipo_pago(tipoPago);
            pagoEJB.create(pago);
        }catch(Exception e){
        }
            
    }
    
    public void registrar(){
        Cliente cli = (Cliente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("cliente");
        cliente.setId_cliente(cli.getId_cliente());
        orden.setId_cliente(cliente);
        orden.setId_ubicacion(ubicacion);
        orden.setId_pago(pago);
        ordenEJB.create(orden);
    }
    */

}
