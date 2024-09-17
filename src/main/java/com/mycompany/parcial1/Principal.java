package com.mycompany.parcial1;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
   
    static ArrayList<Producto> productos = new ArrayList<>();
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
                            String nombre = sc.nextLine();
                            newLaptop.setNombre(nombre);
                            System.out.print("Ingrese el nombre del procesador: ");
                            String procesador = sc.nextLine();
                            newLaptop.setProcesador(procesador);
                            newLaptop.setNombre(nombre);
                            System.out.print("Ingrese el precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            newLaptop.setPrecio(precio);
                            System.out.println("Ingrese la descripcion del producto: ");
                            String descripcion = sc.nextLine();
                            newLaptop.setDescripcion(descripcion);
                            System.out.print("Ingrese la marca: ");
                            String marca = sc.nextLine(); 
                            newLaptop.setMarca(marca);
                            System.out.println("Ingrese la cantidad: ");
                            int cantidad = Integer.parseInt(sc.nextLine());
                            newLaptop.setCantidad(cantidad);
                            
                            agregarDispositivo(newLaptop);
                            break;
                        }
                        case 2: {
                            Telefono telefonos = new Telefono();
                            System.out.print("Ingrese el nombre: ");
                            String marca = sc.nextLine();
                            telefonos.setNombre(marca);
                            System.out.print("Ingrese el almacenamineto: ");
                            int almacenamimento = Integer.parseInt(sc.nextLine());
                            telefonos.setMemoriaAlmacenamiento(almacenamimento);
                            System.out.print("Ingrese el precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            telefonos.setPrecio(precio);
                            System.out.println("Ingrese la descripcion del producto: ");
                            String descripcion = sc.nextLine();
                            telefonos.setDescripcion(descripcion);
                            System.out.println("Ingrese la cantidad: ");
                            int cantidad = Integer.parseInt(sc.nextLine());
                            telefonos.setCantidad(cantidad);
                            agregarDispositivo(telefonos);
                            break;
                        }
                        case 3: {
                            Accesorio newAccesorio = new Accesorio();
                            System.out.print("Ingrese el accesorio: ");
                            String nombre = sc.nextLine();
                            newAccesorio.setNombre(nombre);
                            System.out.print("Ingrese la descripcion del accesorio: ");
                            String descripcion = sc.nextLine();
                            newAccesorio.setDescripcion(descripcion);
                            System.out.print("Ingrese el precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            newAccesorio.setPrecio(precio);
                            System.out.print("Ingrese el Stock donde se ubicará: ");
                            int stock = Integer.parseInt(sc.nextLine());
                            newAccesorio.setCantidad(stock);
                            agregarDispositivo(newAccesorio);
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
                    System.out.println("Total de dinero de todos los dispositivos: " + calcularValorTotalInventario());
                    break;              
                default:
                    System.out.println("Ingrese una opción correcta");
                    break;
            }
        }
    }

    public static void agregarDispositivo(Producto producto) {
        productos.add(producto);
    }

    public static void venderDispositivo(int index, int cantidad) {
        if (index < 0 || index >= productos.size()) {
            System.out.println("Índice inválido");
            return;
        }

        Producto dispositivo = productos.get(index);

        // Verifica si el dispositivo tiene suficiente stock
        if (cantidad > dispositivo.getCantidad()) {
            System.out.println("No hay suficiente stock para completar la venta.");
            return;
        }

        // Reduce la cantidad de stock
        dispositivo.setCantidad(dispositivo.getCantidad()- cantidad);

        // Opcional: Si el stock llega a 0, puedes eliminar el dispositivo del inventario
        if (dispositivo.getCantidad()== 0) {
            productos.remove(index);
            System.out.println("El dispositivo " + dispositivo.getNombre() + " ha sido vendido y removido del inventario.");
        } else {
            System.out.println("Se han vendido " + cantidad + " unidades del dispositivo " + dispositivo.getNombre() + ".");
        }
    }

    public static void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de productos:");
            for (int i = 0; i < productos.size(); i++) {
                Producto producto = productos.get(i);
                System.out.println((i + 1) + ". " + producto.toString());
            }
        }
    }



    public static double calcularValorTotalInventario() {
        double suma = 0;
        for (Producto dispositivo : productos) {
            suma += dispositivo.getPrecio();
        }
        return suma;
    }
}
