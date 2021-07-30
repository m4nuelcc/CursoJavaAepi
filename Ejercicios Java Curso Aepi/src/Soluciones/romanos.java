package Soluciones;

import java.util.Scanner;

public class romanos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        String numeroRomano = sc.nextLine();
        sc.close();

        short numeroDecimal = 0;

        short numeroActual = 0;
        short numeroAnterior = 0;

        for (int posicionActual = 0; posicionActual < numeroRomano.length(); posicionActual++) {

            switch (numeroRomano.charAt(posicionActual)) {
                case 'I':
                    numeroActual = 1;
                break;
                case 'V':
                    numeroActual = 5;
                break;
                case 'X':
                    numeroActual = 10;
                break;
                case 'L':
                    numeroActual = 50;
                break;
                case 'C':
                    numeroActual = 100;
                break;
                case 'D':
                    numeroActual = 500;
                break;
                case 'M':
                    numeroActual = 1000;
                break;
            }

            numeroDecimal += numeroActual;

            byte posicionInicio = (byte)(posicionActual - 3);
            if (posicionInicio < 0)
                posicionInicio = 0;

            for (int posicionAnterior = posicionInicio; posicionAnterior < posicionActual; posicionAnterior++) {
                
                switch (numeroRomano.charAt(posicionAnterior)) {
                    case 'I':
                        numeroAnterior = 1;
                    break;
                    case 'V':
                        numeroAnterior = 5;
                    break;
                    case 'X':
                        numeroAnterior = 10;
                    break;
                    case 'L':
                        numeroAnterior = 50;
                    break;
                    case 'C':
                        numeroAnterior = 100;
                    break;
                    case 'D':
                        numeroAnterior = 500;
                    break;
                    case 'M':
                        numeroAnterior = 1000;
                    break;
                }

                if (numeroAnterior < numeroActual)
                    numeroDecimal -= numeroAnterior * 2;

            }

        }

        System.out.println("El número es " + numeroDecimal);

    }
}