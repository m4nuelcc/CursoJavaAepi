package Ejercicios_java_Aepi;

/*
# CalculoAreas

```
Calculo de √°reas
[0] √?rea del circulo
[1] √?rea del cuadrado
[2] √?rea del rect√°ngulo
[3] √?rea del triangulo

Dime una opci√≥n: 2
Dime la base: 20
Dime la altura: 40

El √°rea es de 800
```

**Requisitos obligatorios:**
* Debemos poder preguntar varias areas, por lo que necesitamos un bucle infinito.

----
/**
 *
 * @author MANU
 */
import java.util.Scanner;

public class E25_CalculoAreas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String Opcion = "6";
            System.out.println("Calculo de √°reas\n"
                    + "[0] √?rea del circulo\n"
                    + "[1] √?rea del cuadrado\n"
                    + "[2] √?rea del rect√°ngulo\n"
                    + "[3] √?rea del triangulo\n"
                    + "[4] SALIR ");

            Opcion = sc.nextLine();
            cls(20);
            switch (Opcion) {

                case "0":
                    System.out.println("Por favor introduzca el Radio:");
                    int Area = Integer.parseInt(sc.nextLine());
                    System.out.println("el el area del circulo es: " + AreaCirculo(Area));
                    break;

                case "1":

                    System.out.println("Por favor introduzca el Lado1:");
                    int Lado1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Por favor introduzca el Lado2:");
                    int Lado2 = Integer.parseInt(sc.nextLine());
                    if (Lado1 == Lado2) {
                        System.out.println("el el area del Cuadrado es: " + CalculoArea(Lado1, Lado2));
                        cls(2);
                    } else {
                        System.out.println("No es un CUADRADO");
                        cls(2);
                    }

                    break;

                case "2":

                    System.out.println("Por favor introduzca el Lado1:");
                    Lado1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Por favor introduzca el Lado2:");
                    Lado2 = Integer.parseInt(sc.nextLine());
                    if (Lado1 != Lado2) {
                        System.out.println("el el area del Rectangulo es: " + CalculoArea(Lado1, Lado2));
                    } else {
                        System.out.println("No es un RECTANGULO");
                    }

                    break;

                case "3":
                    System.out.println("Por favor introduzca Base:");
                    Lado1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Por favor introduzca Altua:");
                    Lado2 = Integer.parseInt(sc.nextLine());

                    System.out.println("el el area del Rectangulo es: " + CalculoArea(Lado1, Lado2) / 2);
                    break;

                case "4":
                    System.out.println("salir");
                    cls(10);
                    System.out.println("ADIOS");
                    System.exit(0);
                    break;
            }
        }
    }

    public static double AreaCirculo(int radio) {

        return (radio * radio) * Math.PI;
    }

    public static int CalculoArea(int Lado1, int Lado2) {

        return Lado1 * Lado2;
    }

    public static String cls(int Lineas) {

        for (int i = 1; i < Lineas; i++) {
            System.out.println(" ");
        }
        return " ";
    }

  
}


