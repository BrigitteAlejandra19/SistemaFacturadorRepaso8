package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        Factura factura1 = new Factura("XXXX", "YYYY");
        factura1.agregarMuchosItems();
        factura1.mostrarFactura();

        Factura factura2 = new Factura("ABC", "DFG");
        factura2.agregarMuchosItems();
        factura2.mostrarFactura();


        List<Factura> facturas = new LinkedList<>();
        facturas.add(factura1);
        facturas.add(factura2);

        Double totalVendido = 0.0;
        for (Factura factura:facturas){
            Double montoDeFactura = factura.calcularMontoFinal();
            totalVendido += montoDeFactura;
        }


        System.out.println("Hay: "+facturas.size() +" facturas en la lista");
        for (int i=0; i<facturas.size(); i++){

            System.out.println("Factura N:" +facturas.get(i).getNroFactura() + " Total: "+facturas.get(i).calcularMontoFinal());
            System.out.println("Total vendido: "+totalVendido);
        }



    }




}
