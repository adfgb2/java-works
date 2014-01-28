/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org;

/**
 *
 * @author Jbugarin
 */
public class ProformaDetalle {

    private int codigo;

    private String descripcion;

    private int cantidad;

    private double precioUnitario;

    private double igv;

    private double total;

    /**
     *
     * @return the codigo
     *
     */
    public int getCodigo() {

        return codigo;

    }

    /**
     *
     * @param codigo the codigo to set
     *
     */
    public void setCodigo(int codigo) {

        this.codigo = codigo;

    }

    /**
     *
     * @return the descripcion
     *
     */
    public String getDescripcion() {

        return descripcion;

    }

    /**
     *
     * @param descripcion the descripcion to set
     *
     */
    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;

    }

    /**
     *
     * @return the cantidad
     *
     */
    public int getCantidad() {

        return cantidad;

    }

    /**
     *
     * @param cantidad the cantidad to set
     *
     */
    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;

    }

    /**
     *
     * @return the precioUnitario
     *
     */
    public double getPrecioUnitario() {

        return precioUnitario;

    }

    /**
     *
     * @param precioUnitario the precioUnitario to set
     *
     */
    public void setPrecioUnitario(double precioUnitario) {

        this.precioUnitario = precioUnitario;

    }

    /**
     *
     * @return the igv
     *
     */
    public double getIgv() {

        return igv;

    }

    /**
     *
     * @param igv the igv to set
     *
     */
    public void setIgv(double igv) {

        this.igv = igv;

    }

    /**
     *
     * @return the total
     *
     */
    public double getTotal() {

        return total;

    }

    /**
     *
     * @param total the total to set
     *
     */
    public void setTotal(double total) {

        this.total = total;

    }

    public void calculoIgv() {

        this.igv = getTotal() - this.precioUnitario;

    }

    public void calculoTotal() {

        this.total = this.precioUnitario * 1.18;

    }

}
