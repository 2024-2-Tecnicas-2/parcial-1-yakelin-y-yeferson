package com.mycompany.parcial1;

public class Producto {
    String nombre;
    String descripcion;
    double precio;
    int cantidad;

    public Producto(String nombre, String descripcion, double precio, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
