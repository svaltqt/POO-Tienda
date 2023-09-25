package Tienda;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayLists
        ArrayList<Ropa> listaRopa = new ArrayList<Ropa>();
        ArrayList<Libro> listaLibro = new ArrayList<Libro>();
        ArrayList<Electronica> listaElectronica = new ArrayList<Electronica>();

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
                    listaElectronica.add(electro);
                    break;

                case 4:
                    System.out.println("Salir");
                    seguir = false; // Termina el bucle
                    break;

                default:
                    System.out.println("Error");
            }

            System.out.println("¿Desea agregar otro producto? (si/no)");
            String continuar = leer.nextLine();

            if (continuar.equalsIgnoreCase("no")) {
                seguir = false; // Termina el bucle
            }
        }

        System.out.println("\nLista de Productos de Ropa:\n");
        if (listaRopa.isEmpty()) {
            System.out.println("No hay Productos de Ropa registrados");
        } else {
            for (Ropa prenda : listaRopa) {
                System.out.println("Ropa:\n");
                prenda.calcularPrecio();
            }
        }

        System.out.println("\nLista de Libros:\n");
        if (listaLibro.isEmpty()) {
            System.out.println("No hay Libros registrados");
        } else {
            for (Libro libro1 : listaLibro) {
                System.out.println("Libros:\n");
                libro1.calcularPrecio();
            }
        }

        System.out.println("\nLista de Productos de Electrónica:\n");
        if (listaElectronica.isEmpty()) {
            System.out.println("No hay Productos de Electrónica registrados");
        } else {
            for (Electronica electro : listaElectronica) {
                System.out.println("Electrónicos:\n");
                electro.calcularPrecio();
            }
        }
    }
}
