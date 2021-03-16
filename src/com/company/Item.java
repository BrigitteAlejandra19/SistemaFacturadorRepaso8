package com.company;

public class Item {

    private Integer nroItem;
    private Integer cantidad;
    private Detalle detalle;
    private Double precioUnitario;
    private Double subTotal;


    public Item(Integer nroItem, Integer cantidad, Detalle detalle, Double precioUnitario) {
        this.nroItem = nroItem;
        this.cantidad = cantidad;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;

    }
    public Double getSubTotal() {
        return subTotal;
    }

    public Integer getNroItem() {
        return nroItem;
    }

    public void setNroItem(Integer nroItem) {
        this.nroItem = nroItem;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double calcularSuTotal(){
        return cantidad*precioUnitario;
    }


    public String verItemsAgregados(){
    return "   Numero de Item: "+ nroItem + " - Detalle: " + detalle + " - Cantidad " + cantidad  + " - Precio Unitario: " + precioUnitario + " - Sub Total: "+calcularSuTotal();
    }


}
