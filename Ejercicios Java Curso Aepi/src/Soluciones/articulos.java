package Soluciones;

import java.util.HashMap;
import java.util.Scanner;

public class articulos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Float> articulos = new HashMap<String, Float>();

        char opcion;
        String nombre;
        Float precio;

        while (true) {
            System.out.println("Articulos");
            System.out.println("[0] Agregar");
            System.out.println("[1] Consultar");
            System.out.println("[2] Eliminar");
            System.out.println("[3] Salir");

            System.out.print("Dime una opcion: ");
            opcion = sc.nextLine().charAt(0);

            switch (opcion) {
                case '0':
                    System.out.print("Dime un nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Dime un precio: ");
                    precio = Float.parseFloat(sc.nextLine());

                    if (!articulos.containsKey(nombre)) {
                        articulos.put(nombre, precio);
                        System.out.println("El articulo se ha agregado correctamente.");
                    } else {
                        System.out.println("El articulo ya existe.");
                    }
                    break;
                case '1':
                    System.out.print("Dime un nombre: ");
                    nombre = sc.nextLine();

                    if (articulos.containsKey(nombre))
                        System.out.println("El artículo " + nombre + " existe.");
                    else
                        System.out.println("El artículo no existe.");
                    break;
                case '2':
                    System.out.print("Dime un nombre: ");
                    nombre = sc.nextLine();
                    
                    if (articulos.containsKey(nombre)) {
                        articulos.remove(nombre);
                        System.out.println("El artículo se ha eliminado correctamente.");
                    } else {
                        System.out.println("El artículo no existe.");
                    }
                    break;
                case '3':
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println("Pulse enter para continuar");
            sc.nextLine();
        }
    }
}