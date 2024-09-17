/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 * 
 * 
 */

public class Pedido extends Producto{
    
    static ArrayList<Cliente> cliente = new ArrayList<>();
    
    public Pedido(String nombre, String descripcion, double precio, int cantidad) {
        super(nombre, descripcion, precio, cantidad);
    }

    public static ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public static void setCliente(ArrayList<Cliente> cliente) {
        Pedido.cliente = cliente;
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
    
    
    
    
    
    
    
    
}
