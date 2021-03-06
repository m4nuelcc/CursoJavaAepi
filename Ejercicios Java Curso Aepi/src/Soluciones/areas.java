package Soluciones;


import java.util.*;

public class areas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double base, altura, lado, radio;

        while (true) {

            System.out.println("Calculo de areas");
            System.out.println("[0] Ã�rea del circulo");
            System.out.println("[1] Ã�rea del cuadrado");
            System.out.println("[2] Ã�rea del rectÃ¡ngulo");
            System.out.println("[3] Ã�rea del triangulo");

            System.out.println("Dime una opcion: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "0":
                    System.out.println("Dime un radio (cm): ");
                    radio = Double.parseDouble(sc.nextLine());
                    
                    System.out.println("El area es " + obtenerAreaCirculo(radio) + " cm2");
                    break;
                case "1":
                    System.out.println("Dime un lado (cm): ");
                    lado = Double.parseDouble(sc.nextLine());
                    
                    System.out.println("El area es " + obtenerAreaCuadrado(lado) + " cm2");
                    break;
                case "2":
                    System.out.println("Dime una base (cm): ");
                    base = Double.parseDouble(sc.nextLine());
                    System.out.println("Dime una altura (cm): ");
                    altura = Double.parseDouble(sc.nextLine());
                    
                    System.out.println("El area es " + obtenerAreaRectangulo(base, altura) + " cm2");
                    break;
                case "3":
                    System.out.println("Dime una base (cm): ");
                    base = Double.parseDouble(sc.nextLine());
                    System.out.println("Dime una altura (cm): ");
                    altura = Double.parseDouble(sc.nextLine());
                    
                    System.out.println("El area es " + obtenerAreaTriangulo(base, altura) + " cm2");
                    break;
                default:
                    System.exit(0); 
            }

        }
    }

    public static double obtenerAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    public static double obtenerAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    public static double obtenerAreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }
    public static double obtenerAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}