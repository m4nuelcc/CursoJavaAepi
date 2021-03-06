package Ejercicios_java_Aepi;

/*
# DNI

```
Dime un DNI: 54663735A
Es un DNI correcto
```
```
Dime un DNI: 12345678A
No es un DNI correcto
```

**Comentarios adicionales:**
* Tenemos la información del DNI en la web del Ministerio, http://www.interior.gob.es/web/servicios-al-ciudadano/dni/calculo-del-digito-de-control-del-nif-nie

**Requisitos opcionales:**
* Nos permita generar un DNI valido aleatorio.

/**
 *
 * @author MANU
 */
import java.util.Scanner;

public class E26_DNI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String opcion =""; 
        boolean opcion = true;
        String dni = "";
        int DniSinLetra = 0;
        while (opcion) {
            
            cls(3);
            System.out.println("Dime tu DNI por Favor");
            

            dni = sc.nextLine().toUpperCase().trim();

            if (ValidacionNumeros(dni.substring(0, dni.length() - 1))) {
                DniSinLetra = Integer.parseInt(dni.substring(0, dni.length() - 1));
                System.out.println(VerificaDni(dni, LetrasDni(DniSinLetra)));
                System.out.println("**************************************************************");
            } else {
                opcion = true;
            }

        }

    }

    public static String LetrasDni(int Numero) {

        String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String letra;
        int resultado = Numero % 23;
        letra = Letras.substring(resultado, resultado + 1);
        return Numero + letra;
    }

    public static String VerificaDni(String Numero1, String Numero2) {

        String Resultado;
        if (Numero1.equals(Numero2)) {

            Resultado = "El DNI " + Numero1 + " es CORRECTO";
        } else {
            int Numero3 = Integer.parseInt(Numero1.substring(0, Numero1.length() - 1));
            Resultado = "ERROR " + "El DNI correcto a Este Numero es: " + LetrasDni(Numero3);
        }

        return Resultado;
    }

    // ValidaNumeros Funcion que valida si la entrada es un numero 
    public static boolean ValidacionNumeros(String Entrada) {

        boolean control = false;
        int contador = 0;
        String Numeros = "0123456789";

        for (int i = 0; i < Numeros.length(); i++) {

            for (int x = 0; x < Entrada.length(); x++) {

                if (Numeros.charAt(i) == Entrada.charAt(x)) {
                    contador++;
                }
            }
            if (contador == Entrada.length()) {
                control = true;
            }

        }

        return control;
    }

    public static String cls(int Lineas) {

        for (int i = 1; i < Lineas; i++) {
            System.out.println(" ");
        }
        return " ";
    }

}


