package Ejercicios_java_Aepi;
/*
 SumaDigitos
Dime un número: 345
El resultado es 12
Comentarios adicionales:
???Tenemos que sumar los números independientemente de cuantos sean y
mostrar el resultado.

 * @author MANU
 */
import java.util.Scanner;
public class E00_SumaDigitos {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("dime un numero:");
        
        String read = sc.nextLine();
        
        int suma=0;
        
        for (int i=0; i<read.length(); i++){
        
             char digito = read.charAt(i);
             int numero = Integer.parseInt(String.valueOf(digito));
            
             suma =suma + numero;
             
        }
        System.out.println("la suma de los digitos de " + read + " es "+ suma) ;

        
        
        
    
        
        
       
    }
    
}
