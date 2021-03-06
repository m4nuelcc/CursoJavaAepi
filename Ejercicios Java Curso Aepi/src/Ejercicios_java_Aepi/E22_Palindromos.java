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
public class E22_Palindromos {

    public static void main(String[] args) {
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Dime un texto: ");
        
        String TextoUsuario = sc.nextLine().toUpperCase().trim().replace(" ", "");
       // TextoUsuario = TextoUsuario.replace(" ", "");
        System.out.println(TextoUsuario.length());
        
        String  Text1="";
        String  Text2="";
        String Vuelta = "";
        
        if (TextoUsuario.length()%2 == 0){
        
            int  Centro = (int) ((TextoUsuario.length()/2));
            Text1 = TextoUsuario.substring(0, Centro);
            Text2 = TextoUsuario.substring(Centro,TextoUsuario.length());
            
        }else {
           
             int  Centro = (int) ((TextoUsuario.length()/2)+1);
             Text1 = TextoUsuario.substring(0, Centro-1);
             Text2 = TextoUsuario.substring(Centro,TextoUsuario.length());
             
        }
            char[] Text =  Text2.toCharArray();
            
            for (int fin=Text.length-1; fin>=0; fin--) {
                          
               Vuelta = Vuelta+ Text[fin];
               }      
            
            System.out.println(Text1);
            System.out.println(Vuelta);
            
           if (Text1.contentEquals(Vuelta)) {
          
               System.out.println(TextoUsuario);
               System.out.println("es un palindromo");
               System.out.println(Text1);
               System.out.println(Vuelta);
            } else{
           
               System.out.println("no es un palindromo");

           }
        
       
    }
    
}


