package Soluciones;

import java.util.Scanner;
import java.util.Random;

public class operaciones {
    public static void main(String[] args) {
        
        Random rnd = new Random();

        int numero1 = rnd.nextInt(10) + 1;
        int numero2 = rnd.nextInt(10) + 1;
        int operacion = rnd.nextInt(4);

        int resultado = 0;
        String operador = "";

        switch (operacion) {
            case 0:
                operador = "+";
                resultado = numero1 + numero2;
                break;
            case 1:
                operador = "-";
                resultado = numero1 - numero2;
                break;
            case 2:
                operador = "*";
                resultado = numero1 * numero2;
                break;
            case 3:
                operador = "/";
                resultado = Math.round(numero1 / numero2);
                break;
        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("La operación es " + numero1 + " " + operador + " " + numero2 + " = ?");
        System.out.println("Recuerda: Que en caso de división es un redondeo sin decimales.");
        System.out.print("Dime el resultado de la operación: ");
        float ResultadoUsuario = sc.nextFloat();

        sc.close();

        if (ResultadoUsuario == resultado) {
            System.out.println("Has acertado");
        } else {
            System.out.println("Has fallado. El resultado era " + resultado);
        }
    }
}