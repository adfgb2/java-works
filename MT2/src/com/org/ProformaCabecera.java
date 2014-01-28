/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Jbugarin
 */
public class ProformaCabecera {

    private int nroProforma;
    private Date fechaEmision;
    private String tipoCliente;
    private String numDNIRUC;
    private String nombreRazonSocial;
    private String tipoDocumento;
    private String tipoProforma;
    private List listaProformaDetalles;
    private double detraccion;
    private double totalProforma;

    /**
     * @return the nroProforma
     */
    public int getNroProforma() {
        return nroProforma;
    }

    /**
     * @param nroProforma the nroProforma to set
     */
    public void setNroProforma(int nroProforma) {
        this.nroProforma = nroProforma;
    }

    /**
     *
     * @return the fechaEmision
     *
     */
    public Date getFechaEmision() {

        return fechaEmision;

    }

    /**
     *
     * @param fechaEmision the fechaEmision to set
     *
     */
    public void setFechaEmision(Date fechaEmision) {

        this.fechaEmision = fechaEmision;

    }

    /**
     *
     * @return the tipoCliente
     *
     */
    public String getTipoCliente() {

        return tipoCliente;

    }

    /**
     *
     * @param tipoCliente the tipoCliente to set
     *
     */
    public void setTipoCliente(String tipoCliente) {

        this.tipoCliente = tipoCliente;

    }

    /**
     *
     * @return the numDNIRUC
     *
     */
    public String getNumDNIRUC() {

        return numDNIRUC;

    }

    /**
     *
     * @param numDNIRUC the numDNIRUC to set
     *
     */
    public void setNumDNIRUC(String numDNIRUC) {

        this.numDNIRUC = numDNIRUC;

    }

    /**
     *
     * @return the nombreRazonSocial
     *
     */
    public String getNombreRazonSocial() {

        return nombreRazonSocial;

    }

    /**
     *
     * @param nombreRazonSocial the nombreRazonSocial to set
     *
     */
    public void setNombreRazonSocial(String nombreRazonSocial) {

        this.nombreRazonSocial = nombreRazonSocial;

    }

    /**
     *
     * @return the tipoDocumento
     *
     */
    public String getTipoDocumento() {

        return tipoDocumento;

    }

    /**
     *
     * @param tipoDocumento the tipoDocumento to set
     *
     */
    public void setTipoDocumento(String tipoDocumento) {

        this.tipoDocumento = tipoDocumento;

    }

    /**
     *
     * @return the tipoProforma
     *
     */
    public String getTipoProforma() {

        return tipoProforma;

    }

    /**
     *
     * @param tipoProforma the tipoProforma to set
     *
     */
    public void setTipoProforma(String tipoProforma) {

        this.tipoProforma = tipoProforma;

    }

    /**
     *
     * @return the detraccion
     *
     */
    public double getDetraccion() {

        return detraccion;

    }

    /**
     *
     * @param detraccion the detraccion to set
     *
     */
    public void setDetraccion(double detraccion) {

        this.detraccion = detraccion;

    }

    /**
     *
     * @return the totalProforma
     *
     */
    public double getTotalProforma() {

        return totalProforma;

    }

    /**
     *
     * @param totalProforma the totalProforma to set
     *
     */
    public void setTotalProforma(double totalProforma) {

        this.totalProforma = totalProforma;

    }

    public void calcularDetraccion() {

        if (this.totalProforma > 700.00) {

            this.detraccion = totalProforma * 0.09;

        } else {

            this.detraccion = 0.0;

        }

    }

    public void calcularTotalProforma() {

        double totalProformaCabecera = 0.0;

        for (int i = 0; i < this.listaProformaDetalles.size(); i++) {

            ProformaDetalle obj = (ProformaDetalle) this.listaProformaDetalles.get(i);

            totalProformaCabecera = totalProformaCabecera + obj.getTotal();

        }

        this.totalProforma = totalProformaCabecera;

    }

    /**
     *
     * @return the listaProformaDetalles
     *
     */
    public List getListaProformaDetalles() {

        return listaProformaDetalles;

    }

    /**
     *
     * @param listaProformaDetalles the listaProformaDetalles to set
     *
     */
    public void setListaProformaDetalles(List listaProformaDetalles) {

        this.listaProformaDetalles = listaProformaDetalles;

    }

}