package Tienda;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayLists
        ArrayList<Ropa> listaRopa = new ArrayList<Ropa>();
        ArrayList<Libro> listaLibro = new ArrayList<Libro>();
        ArrayList<Electronica> listaElectronica = new ArrayList<Electronica>();
        ArrayList<Float> costosDeEnvio = new ArrayList<>();

        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido a Supermercados El Poli \n");

        boolean seguir = true;

        while (seguir) {


            System.out.println("Elije la opción que desea agregar\n" +
                    "1. Ingresar Ropa\n" +
                    "2. Ingresar un libro\n" +
                    "3. Ingresar Electrónica\n" +
                    "4. Salir");

            int opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la Prenda: ");
                    String nombreRopa = leer.nextLine();

                    System.out.println("Ingrese el precio: ");
                    float precioRopa = Float.parseFloat(leer.nextLine());

                    System.out.println("Ingrese la Talla de la prenda.");
                    String tipoTalla = leer.nextLine();

                    Ropa prenda = new Ropa(nombreRopa, precioRopa, tipoTalla);
                    costosDeEnvio.add((float) prenda.calcularCosteEnvio());
                    listaRopa.add(prenda);

                    break;

                case 2:
                    System.out.println("Ingrese el nombre del Libro: ");
                    String nombreLibro = leer.nextLine();

                    System.out.println("Ingrese el precio: ");
                    float precioLibro = Float.parseFloat(leer.nextLine());

                    System.out.println("Ingrese el Autor del Libro: ");
                    String autorLibro = leer.nextLine();

                    System.out.println("Ingrese el año del Libro: ");
                    int annoLibro = Integer.parseInt(leer.nextLine());

                    Libro libro1 = new Libro(nombreLibro, precioLibro, autorLibro, annoLibro);
                    costosDeEnvio.add((float) libro1.calcularCosteEnvio());
                    listaLibro.add(libro1);


                    break;

                case 3:
                    System.out.println("Ingrese el nombre del electrónico.");
                    String nombreElectro = leer.nextLine();

                    System.out.println("Ingrese la marca del producto.");
                    String nombreMarca = leer.nextLine();

                    System.out.println("Ingrese el precio del electrónico.");
                    float precioElectro = Float.parseFloat(leer.nextLine());

                    Electronica electro = new Electronica(nombreElectro, precioElectro, nombreMarca);
                    costosDeEnvio.add((float) electro.calcularCosteEnvio());
                    listaElectronica.add(electro);
                    break;

                case 4:
                    System.out.println("Salir");
                    seguir = false;
                    break;

                default:
                    System.out.println("Error");
            }

            System.out.println("¿Desea agregar otro producto? (si/no)");
            String continuar = leer.nextLine();

            if (continuar.equalsIgnoreCase("no")) {
                seguir = false;
            }
        }

        mostrarFactura("Productos de Ropa", listaRopa);
        mostrarFactura("Productos de Libros", listaLibro);
        mostrarFactura("Productos de Electrónica", listaElectronica);

        System.out.println("Total de la compra: " +
                calcularTotalCompra(listaRopa, listaLibro, listaElectronica));

    }

    public static void mostrarFactura(String titulo, ArrayList<?> listaProductos) {
        System.out.println("\n" + titulo + ": \n");
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos de "+titulo +" registrados");
        } else {
            for (Object producto : listaProductos) {
                System.out.println(producto.toString());
            }
        }
    }
    public static float calcularTotalCompra(ArrayList<Ropa> listaRopa, ArrayList<Libro> listaLibro, ArrayList<Electronica> listaElectronica) {
        float totalCompra = 0.0f;


        for (Ropa prenda : listaRopa) {
            totalCompra += prenda.getPrecio() + prenda.calcularCosteEnvio();
        }
        for (Libro libro : listaLibro) {
            totalCompra += libro.getPrecio() + libro.calcularCosteEnvio();
        }
        for (Electronica electro : listaElectronica) {
            totalCompra += electro.getPrecio() + electro.calcularCosteEnvio();
        }

        return totalCompra;
    }

}
