/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Calendar;


/**
 *
 * @author Johan Sánchez
 */
public class Factura implements  Serializable{
    private int idFactura,efectivoResibido, cambio;
    private Calendar fechaFactura;
    private double impuesto;
    private Cliente miCl;

    public Factura(int idFactura,int efectivoResibido, int cambio, Calendar fechaFactura, double impuesto, Cliente miCl) {
        this.idFactura = idFactura;
        this.efectivoResibido = efectivoResibido;
        this.cambio = cambio;
        this.fechaFactura = fechaFactura;
        this.impuesto = impuesto;
        this.miCl = miCl;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getEfectivoResibido() {
        return efectivoResibido;
    }

    public void setEfectivoResibido(int efectivoResibido) {
        this.efectivoResibido = efectivoResibido;
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public Calendar getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Calendar fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public Cliente getMiCl() {
        return miCl;
    }

    public void setMiCl(Cliente miCl) {
        this.miCl = miCl;
    }
    
    
    
}
