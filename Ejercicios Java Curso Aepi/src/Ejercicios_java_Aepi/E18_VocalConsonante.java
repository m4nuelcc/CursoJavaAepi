package Ejercicios_java_Aepi;
/*
# VocalConsonante

```
Dime una letra: n

Es consonante
```
```
Dime una letra: e

Es vocal
```

**Requisitos opcionales:**
* Validar que la entrada, nos tienen que dar una letra.
* Cubrir todos los casos, mayúsculas, acentos. Todo lo que se nos ocurra.
*/
import java.util.Scanner;

/**
 *
 * @author MANU
 */

public class E18_VocalConsonante {

      public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una letra: ");
        
        String Letra = sc.nextLine().toLowerCase();
        char PrimeraLetra = Letra.charAt(0);
             
        String consonantes = "bcdfghjklmnñpqrstvwxyz";
        String vocales="aeiouáéíóú";
        String signos="|·$%&/()=?¿|@#~€¬[]{},.-/*-+";
        String numeros="0123456789";
        String Valor="";
        
        for(int cons=0; cons<consonantes.length(); cons++){
        
            if (consonantes.charAt(cons) == PrimeraLetra){
             
                Valor="Es una consonante";
                
            }       
        }
        
            for (int vocal=0; vocal<vocales.length(); vocal++){
        
            if (vocales.charAt(vocal)== PrimeraLetra){
                
                Valor="Es una Vocal";
        
            }    
        }    
                 
             for (int num=0; num<numeros.length(); num++){
        
            if (numeros.charAt(num)== PrimeraLetra){
                
                Valor="Es un Número";
        
            }  
            
             for (int sig=0; sig<signos.length(); sig++){
        
            if (signos.charAt(sig)== PrimeraLetra){
                
                Valor="Es un signo";
        
            }    
        }    
            
        }    
         System.out.println(Valor);
       
    }
       
}

/*
 if ((PrimeraLetra == 'A' || PrimeraLetra == '??') 
              || (PrimeraLetra == 'E' || PrimeraLetra == 'É') 
                ||(PrimeraLetra == 'I' || PrimeraLetra == '??') 
                   || (PrimeraLetra == 'O' || PrimeraLetra == 'Ó')
                        ||(PrimeraLetra == 'U' || PrimeraLetra == 'Ú')){
            
            System.out.println(" La letra introducida es una VOCAL");
        }else if ((PrimeraLetra == '1' || PrimeraLetra == '2'
              || PrimeraLetra == '3' || PrimeraLetra == '4' 
                ||PrimeraLetra == '5' || PrimeraLetra == '6' 
                   || PrimeraLetra == '7' || PrimeraLetra == '8'
                        ||PrimeraLetra == '9' || PrimeraLetra == '0')){
            
            System.out.println("La letra introducida es un número");
        } else {
        
            System.out.println("Es una consonante");
        }
*/