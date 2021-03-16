package com.company;

import java.util.LinkedList;
import java.util.List;

public class Factura {

    List<Item> items = new LinkedList<>();

    String nroFactura; //RANDOM
    String razonSocial;
    String razonSocialCliente;


    Double iva;
    Double descuento;


       public Factura(String razonSocial, String razonSocialCliente) {
        this.nroFactura = Matricula.obtenerMatriculaVieja();
        this.razonSocial = razonSocial;
        this.razonSocialCliente = razonSocialCliente;
    }


    public void mostrarDatosFactura(){
        System.out.println( "Numero de Factura: "+ nroFactura + "  \nRazon Social: " + razonSocial + " \nRazon Social Cliente " + razonSocialCliente );
    }


    public void agregarItem(Item item){ items.add(item); }

    public void agregarMuchosItems(){
        agregarItem((new Item (1,10,Detalle.MANCUERNA,100.00)));
        agregarItem((new Item (2,10,Detalle.CUERDA,200.00)));
        agregarItem((new Item (3,10,Detalle.MANTA,300.00)));
        agregarItem((new Item (4,10,Detalle.LIGAS,400.00))); }


     public Double calcularMontoSinDescuento(){
         Double subTotalFactura = 0.00;
         for (Item item: items){
             subTotalFactura += item.calcularSuTotal();
         }
          return subTotalFactura;
    }

    public Double calcularMontoFinal(){
        Double montoTotal = calcularMontoSinDescuento();
         montoTotal = montoTotal - getDescuento() + getIva();

        return montoTotal;
    }



    public void mostrarFactura(){
        mostrarDatosFactura();
        System.out.println("");
        for (int i=0; i<items.size();i++) {
            System.out.println(items.get(i).verItemsAgregados()); }
            Double SubTotalFactura = calcularMontoSinDescuento();
            System.out.println("");
            System.out.println("                                                                        Sutotal Factura: " +SubTotalFactura);
            Double descuentoFactura = getDescuento();
            System.out.println("                                                                              Descuento: " +descuentoFactura);
            Double ivaFactura = getIva();
            System.out.println("                                                                                  I.V.A: " +ivaFactura);
            Double totalFactura = calcularMontoFinal();
            System.out.println("                                                                          Total Factura: " +totalFactura);

    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRazonSocialCliente() {
        return razonSocialCliente;
    }

    public void setRazonSocialCliente(String razonSocialCliente) {
        this.razonSocialCliente = razonSocialCliente;
    }

    public Double getIva() {
        Double subTotal = calcularMontoSinDescuento();
        subTotal -= descuento;
        iva = subTotal*0.21;
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getDescuento() {
        Double subTotal = calcularMontoSinDescuento();
        subTotal = subTotal * 0.05;
        descuento = subTotal;
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "items=" + items +
                ", nroFactura='" + nroFactura + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", razonSocialCliente='" + razonSocialCliente + '\'' +
                ", iva=" + iva +
                ", descuento=" + descuento +
                '}';
    }
}
