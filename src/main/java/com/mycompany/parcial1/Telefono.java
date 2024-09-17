
package com.mycompany.parcial1;


public class Telefono extends Producto{
     int memoriaAlmacenamiento;

    public Telefono(int memoriaAlmacenamiento, String nombre, String descripcion, double precio, int cantidad) {
        super(nombre, descripcion, precio, cantidad);
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
    }

    public Telefono() {
      
    }

    public int getMemoriaAlmacenamiento() {
        return memoriaAlmacenamiento;
    }

    public void setMemoriaAlmacenamiento(int memoriaAlmacenamiento) {
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
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
        return "Telefono{" + "memoriaAlmacenamiento=" + memoriaAlmacenamiento + ", nombre= " + super.nombre + ", descripcion= " + super.descripcion + ", precio= " + super.precio + ", cantidad= " + super.cantidad + '}';
    }

    
    
    
    
    
    
}
