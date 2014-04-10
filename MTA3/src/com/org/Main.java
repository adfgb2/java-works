/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jbugarin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProformaDetalle det = new ProformaDetalle();
        det.setCantidad(1);
        det.setCodigo(304000855);
        det.setDescripcion("ISO/IEC 12207");
        det.setPrecioUnitario(680.06);
        
        //Calculando el total del arancel
        det.calculoTotal();

        //Calculando el IGV
        det.calculoIgv();

        System.out.println("IGV : " + det.getIgv());
        System.out.println("TOTAL : " + det.getTotal());

        //**** OTRO DETALLE
        ProformaDetalle det2 = new ProformaDetalle();
        det2.setCantidad(1);
        det2.setCodigo(304000789);
        det2.setDescripcion("NTP ISO 14040:1998");
        det2.setPrecioUnitario(28.63);

        //Calculando el total del arancel
        det2.calculoTotal();

        //Calculando el IGV
        det2.calculoIgv();

        System.out.println("IGV : " + det2.getIgv());
        System.out.println("TOTAL : " + det2.getTotal());

        //Agregando detalle a Proforma Cabecera
        ProformaCabecera cab = new ProformaCabecera();

        //creacion de lista para almacenar a los detalles
        List lista = new ArrayList();
        lista.add(det);
        lista.add(det2);
        cab.setNroProforma(3245);
        cab.setTipoCliente("RUC");
        cab.setFechaEmision(new Date());
        cab.setNumDNIRUC("20525151817");
        cab.setNombreRazonSocial("ILUMINATIC SAC");
        cab.setTipoDocumento("FACTURA");
        cab.setTipoProforma("NORMA TECNICA");
        
        //agregando los detalles de proformas
        cab.setListaProformaDetalles(lista);

        //calculando total de Proforma
        cab.calcularTotalProforma();

        //calculando detraccion
        cab.calcularDetraccion();

        System.out.println("TOTAL PROFORMA : " + cab.getTotalProforma());
        System.out.println("TOTAL DETRACCION : " + cab.getDetraccion());
    }

}
