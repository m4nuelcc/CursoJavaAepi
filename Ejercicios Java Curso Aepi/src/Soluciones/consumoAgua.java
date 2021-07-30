package Soluciones;

import java.util.Scanner;

public class consumoAgua {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime el consumo de agua (m3): ");
        int consumo = sc.nextInt();

        sc.close();

        int PrecioTotal = 0;
        
        if (consumo > 0) {
            
            if (consumo > 1000) {
                PrecioTotal += (consumo - 1000) * 0.80;
                consumo = 1000;
            }
            if (consumo > 500 && consumo < 1001) {
                PrecioTotal += (consumo - 500) * 0.35;
                consumo = 500;
            }
            if (consumo > 100 && consumo < 501) {
                PrecioTotal += (consumo - 100) * 0.20;
                consumo = 100;
            }
            if (consumo < 101) {
                PrecioTotal += consumo * 0.15;
            }

            System.out.println("El coste de tu consumo es de " + PrecioTotal + "€");

        } else {
            System.out.print("No tienes que pagar nada");
        }

    }
}