package Ejercicios_java_Aepi;
/**
# Factorial
Dime un número: 5
El factorial es 120
```
**Comentarios adicionales:**
* El factorial se define como el producto de todos los números enteros positivos desde 1 hasta él mismo.
* El factorial de 5 es 5 x 4 x 3 x 2 x 1 = 120

 *
 * @author MANU
 */
import java.util.Scanner;

public class E13_Factorial {

    public static void main(String[] args) {
       
       double  resultado=1;
       double numero=0;
        
        Scanner sc = new Scanner(System.in);
        
        while(numero <=0 || numero > 100){
            
             System.out.println("Dime un número del 1 al 100: ");
              
             numero =sc.nextByte();
        }
        
        System.out.println("EL FACTORIAL DE: " + numero);
        
        for (int i=1; i<=numero; i++){
           resultado *= i;
          
           System.out.print( i+ " ");
       
          
        }
         
         System.out.println("=" + resultado);
    }
    
}
