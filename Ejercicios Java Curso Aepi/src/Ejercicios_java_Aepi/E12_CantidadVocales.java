package Ejercicios_java_Aepi;



/*
 CantidadVocales
Dime un texto: Esto es un ejercicio
a = 0
e = 4
i = 2
o = 2
u = 0
Requisitos obligatorios:
�?�Debemos de detectar las vocales independientemente de que sean
mayusculas, minusculas, tengan acentos, etc*
 *
 * @author MANU
 */
import java.util.Scanner;
public class E12_CantidadVocales {
   
    public static void main(String[] args) {
      
        Scanner sc =new Scanner(System.in);
        System.out.println("Dime un texto:");
        String read = sc.nextLine().toUpperCase();
        int a=0, e=0,i=0,o=0,u=0;
        
        for (int x=0; x<read.length(); x++){
        
            char caracter = read.charAt(x);
              
            switch (caracter){
            
                case 'A':
                    a=a+1;
                    System.out.println("llega");
                    break;
                case 'E':
                    e=e+1;
                    break;
                case 'I':
                    i=i+1;
                    break;
                case 'O':
                    o=o+1;
                    break;
                case 'U':
                    u=u+1;
                    break;    
                 
            }
        }
       System.out.println("a = "+ a);
       System.out.println("e = "+ e);
       System.out.println("i = "+ i);
       System.out.println("o = "+ o);
       System.out.println("u = "+ u);
      
    }
    
}
