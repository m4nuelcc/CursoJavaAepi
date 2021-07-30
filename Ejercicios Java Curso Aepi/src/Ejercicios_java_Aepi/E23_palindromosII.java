package Ejercicios_java_Aepi;
/*
 # Palindromos

Dime un texto: oso

Es un palíndromo
```
```
Dime un texto: camión

No es un palíndromo
```

**Comentarios adicionales:**
* Un palindromo es una palabra o frase que se lee igual en un sentido que en otro.
* Podemos probar con "ana" u "oso", o frases más dificiles como "Roma ni se conoce sin oro, ni se conoce sin amor".

**Requisitos opcionales:**
* Normalizar la entrada del texto, para poder escribir frases con signos alfanúmericos, mayusculas, etc.
 * @author MANU
 */
import java.util.Scanner;
public class E23_palindromosII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto");
        String texto = sc.nextLine().trim().toUpperCase().replaceAll(" ", "").replace(".", "");

            char[] texto2 = texto.toCharArray();
                int vuelta = 0; 
                String reves = "";

                    for (int i = 0; i < texto2.length; i++){
                    vuelta = texto2.length -i;
                    reves = reves + texto2[vuelta-1];
                    }
                        if (texto.equals(reves)) {
                        System.out.println("La frase: " + reves + " es un palíndromo");
                        }
                        else{
                            System.out.println("La frase: " + texto + " no es un palíndromo");
                   }
    }

 }
    

