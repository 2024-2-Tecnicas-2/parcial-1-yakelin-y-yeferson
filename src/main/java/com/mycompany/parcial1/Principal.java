package com.mycompany.parcial1;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
   
    static ArrayList<Producto> inveproductos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        while (true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1. Agregar dispositivos");
            System.out.println("2. Vender dispositivos");
            System.out.println("3. Mostrar dispositivos");
            System.out.println("5. Calcular valor total de inventario");
            System.out.print("Ingrese una opción: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    System.out.println("1. Laptop");
                    System.out.println("2. accesorio");
                    System.out.println("3. teleffono");
                    System.out.print("Ingrese una opción: ");
                    opc = Integer.parseInt(sc.nextLine());
                    switch (opc) {
                        case 1: {
                            Laptop newLaptop = new Laptop();
                            System.out.print("Ingrese el nombre: ");
                            String marca = sc.nextLine();
                            newLaptop.setNombre(marca);
                            System.out.print("Ingrese el nombre del procesador: ");
                            String procesador = sc.nextLine();
                            newLaptop.setProcesador(procesador);
                            System.out.print("Ingrese el nombre: ");
                            String nombre = sc.nextLine();
                            newLaptop.setNombre(nombre);
                            System.out.print("Ingrese el precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            newLaptop.setPrecio(precio);
                            System.out.print("Ingrese el Stock donde se ubicará: ");
                            int stock = Integer.parseInt(sc.nextLine());
                            newLaptop.setStock(stock);
                            agregarDispositivo(newLaptop);
                            break;
                        }
                        case 2: {
                            Smartphone newSmart = new Smartphone();
                            System.out.print("Ingrese la marca del Smartphone: ");
                            String marca = sc.nextLine();
                            newSmart.setMarca(marca);
                            System.out.print("Ingrese el sistema operativo: ");
                            String sistemaOperativo = sc.nextLine();
                            newSmart.setSistemaOperativo(sistemaOperativo);
                            System.out.print("Ingrese el nombre: ");
                            String nombre = sc.nextLine();
                            newSmart.setNombre(nombre);
                            System.out.print("Ingrese el precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            newSmart.setPrecio(precio);
                            System.out.print("Ingrese el Stock donde se ubicará: ");
                            int stock = Integer.parseInt(sc.nextLine());
                            newSmart.setStock(stock);
                            agregarDispositivo(newSmart);
                            break;
                        }
                        case 3: {
                            Tablet newTablet = new Tablet();
                            System.out.print("Ingrese la marca de la Tablet: ");
                            String marca = sc.nextLine();
                            newTablet.setMarca(marca);
                            System.out.print("Ingrese el tamaño de la pantalla: ");
                            double tamanoPantalla = Double.parseDouble(sc.nextLine());
                            newTablet.setTamanoPantalla(tamanoPantalla);
                            System.out.print("Ingrese el nombre: ");
                            String nombre = sc.nextLine();
                            newTablet.setNombre(nombre);
                            System.out.print("Ingrese el precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            newTablet.setPrecio(precio);
                            System.out.print("Ingrese el Stock donde se ubicará: ");
                            int stock = Integer.parseInt(sc.nextLine());
                            newTablet.setStock(stock);
                            agregarDispositivo(newTablet);
                            break;
                        }
                        default:
                            System.out.println("Ingrese una opción correcta");
                            break;
                    }
                    break;
                case 2:
                    mostrarInventario();
                    System.out.print("El dispositivo que van a comprar (índice): ");
                    int index = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = Integer.parseInt(sc.nextLine());
                    venderDispositivo(index, cantidad);
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 4:
                    System.out.print("Ingrese la marca a la que desea aplicar el descuento: ");
                    String marca = sc.nextLine();
                    System.out.print("Ingrese el porcentaje de descuento: ");
                    double porcentaje = Double.parseDouble(sc.nextLine());
                    aplicarDescuentoMarca(marca, porcentaje);
                    System.out.println("Inventario actualizado con los descuentos aplicados:");
                    mostrarInventario();
                    break;
                case 5:
                    System.out.println("Total de dinero de todos los dispositivos: " + calcularValorTotalInventario());
                    break;
                case 6:
                    DispositivoElectronico masCaro = buscarDispositivoMasCaro();
                    if (masCaro != null) {
                        System.out.println("El dispositivo más caro es: " + masCaro.toString());
                    } else {
                        System.out.println("El inventario está vacío.");
                    }
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");
                    break;
            }
        }
    }

    public static void agregarDispositivo(DispositivoElectronico dispositivo) {
        inventario.add(dispositivo);
    }

    public static void venderDispositivo(int index, int cantidad) {
        if (index < 0 || index >= inventario.size()) {
            System.out.println("Índice inválido");
            return;
        }

        DispositivoElectronico dispositivo = inventario.get(index);

        // Verifica si el dispositivo tiene suficiente stock
        if (cantidad > dispositivo.getStock()) {
            System.out.println("No hay suficiente stock para completar la venta.");
            return;
        }

        // Reduce la cantidad de stock
        dispositivo.setStock(dispositivo.getStock() - cantidad);

        // Opcional: Si el stock llega a 0, puedes eliminar el dispositivo del inventario
        if (dispositivo.getStock() == 0) {
            inventario.remove(index);
            System.out.println("El dispositivo " + dispositivo.getNombre() + " ha sido vendido y removido del inventario.");
        } else {
            System.out.println("Se han vendido " + cantidad + " unidades del dispositivo " + dispositivo.getNombre() + ".");
        }
    }

    public static void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de dispositivos:");
            for (int i = 0; i < inventario.size(); i++) {
                DispositivoElectronico dispositivo = inventario.get(i);
                System.out.println((i + 1) + ". " + dispositivo.toString());
            }
        }
    }

    public static void aplicarDescuentoMarca(String marca, double porcentaje) {
        boolean descuentoAplicado = false;
        for (DispositivoElectronico dispositivo : inventario) {
            if (dispositivo.getMarca().equalsIgnoreCase(marca)) {
                double precioOriginal = dispositivo.getPrecio();
                dispositivo.setPrecio(precioOriginal - (precioOriginal * porcentaje / 100));
                System.out.println("Se aplicó un descuento del " + porcentaje + "% a " + dispositivo.getNombre());
                descuentoAplicado = true;
            }
        }
        if (!descuentoAplicado) {
            System.out.println("No se encontraron dispositivos de la marca " + marca);
        }
    }

    public static DispositivoElectronico buscarDispositivoMasCaro() {
        if (inventario.isEmpty()) {
            return null;
        }

        DispositivoElectronico dispositivoMasCaro = inventario.get(0);
        for (DispositivoElectronico dispositivo : inventario) {
            if (dispositivo.getPrecio() > dispositivoMasCaro.getPrecio()) {
                dispositivoMasCaro = dispositivo;
            }
        }

        return dispositivoMasCaro;
    }

    public static double calcularValorTotalInventario() {
        double suma = 0;
        for (DispositivoElectronico dispositivo : inventario) {
            suma += dispositivo.getPrecio();
        }
        return suma;
    }
}
