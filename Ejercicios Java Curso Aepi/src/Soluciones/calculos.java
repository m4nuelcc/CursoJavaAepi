package Soluciones;


import java.util.*;

public class calculos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime un número: ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(media(numeros));
        System.out.println(suma_total(numeros));
        System.out.println(mayor(numeros));
        System.out.println(menor(numeros));
    }

    private static String media(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return "La media es " + (suma / numeros.length);
    }

    private static String suma_total(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return "La suma es " + suma;
    }

    private static String mayor(int[] numeros) {
        int numero_mayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numero_mayor)
                numero_mayor = numeros[i];
        }

        return "El numero mayor es " + numero_mayor;
    }

    private static String menor(int[] numeros) {
        int numero_menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < numero_menor)
                numero_menor = numeros[i];
        }

        return "El numero menor es " + numero_menor;
    }
}