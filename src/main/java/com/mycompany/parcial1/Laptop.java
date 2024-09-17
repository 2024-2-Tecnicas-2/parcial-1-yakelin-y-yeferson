/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

/**
 *
 * @author USUARIO
 */
public class Laptop extends Producto{
    
    String marca;
    String procesador;
    
    

    public Laptop(String nombre, String descripcion, double precio, int cantidad) {
        super(nombre, descripcion, precio, cantidad);
    }

    public Laptop() {
        
    }
    
   
    public Laptop(String marca, String procesador, String nombre, String descripcion, double precio, int cantidad) {
        super(nombre, descripcion, precio, cantidad);
        this.marca = marca;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Laptop{" + "marca=" + marca + ", procesador=" + procesador + ", nombre= " + super.nombre + ", descripcion= " + super.descripcion + ", precio= " + super.precio + ", cantidad= " + super.cantidad + '}';
    }
    
    
    
    

   
    
    

    
    
}
