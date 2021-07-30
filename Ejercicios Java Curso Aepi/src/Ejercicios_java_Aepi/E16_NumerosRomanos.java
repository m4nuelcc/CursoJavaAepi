package Ejercicios_java_Aepi;

import java.util.Scanner;

/*
Dime un número romano: XX

El número es 20

**Requisitos obligatorios:**
* Debe poder sumar y restar, es decir (IV) -> 4 o (VI) -> 6. El resto de reglas podemos omitirlas.

**Requisitos opcionales:**
* Realizar la conversión de números arábigos a romanos.
* Aplicar el resto de reglas de los números romanos
/**
 *
 * @author MANU
 */
public class E16_NumerosRomanos {

     public static void main(String[] args) {
         
         char caracter;
         char caracterAnterior=0;
         int suma=0;
         int I=0;
         int V=0;
         int X=0;
         int L=0;
         int C=0;
         int D=0;
         int M=0;
         
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Dime un número romano:");
         
         String NumeroRomano = sc.nextLine().trim().toUpperCase();
         //String palabra = "sql";
         //String texto = "lenguaje sql";
         
                  
         for (int i=0; i< NumeroRomano.length(); i++){
                   
             caracter = NumeroRomano.charAt(i);
             
          
            
             //System.out.println(caracter + " " +  caracterAnterior);
             switch (caracter)
             {
                 case 'I':
                     suma = suma+1;
                     I=I+1;
                     break;
                 case 'V':
                      suma = suma+5;
                      V=V+1;
                      break;
                 case 'X':
                      X=X+1;
                      suma = suma+10;
                      break;
                case 'L':
                     suma = suma+5;
                     L=L+1;
                     break;
                case 'C':
                     suma = suma+100;
                     C=C+1;
                     break;
                case 'D':
                     suma = suma+500;
                     D=D+1;
                     break;
                case 'M':
                     suma = suma+1000;
                     M=M+1;
                     break;
                default:
                    
                     break;     
                    
             }
             
         }
         
         if (I>3 || V>3 || X>3 || L>1 || C>3 || D>1|| M>3){
             
             System.out.println("no es un numero romano");
         }else{
                     System.out.println(suma);

         }
    }
    
}


/*
String Romanos =" I V X L C D M  I V X L C D M  ";
         char Romanos2;
         boolean resultado;
for(int v=0; v<Romanos.length(); v++){
             
             Romanos2 = NumeroRomano.charAt(v);
             String Romanos3 = Character.toString(Romanos2);
             resultado = Romanos.contains(Romanos3);

               if(resultado){
                  System.out.println("palabra encontrada");
               }else{
                   System.out.println("palabra no encontrada");
         }   
           
             
         }
*/
