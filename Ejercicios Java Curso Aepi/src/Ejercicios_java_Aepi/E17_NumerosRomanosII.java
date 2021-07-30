package Ejercicios_java_Aepi;
/*
NumerosRomanos
Dime un n√∫mero romano: XX
El n√∫mero es 20
Requisitos obligatorios:
‚?ëDebe poder sumar y restar, es decir (IV) -> 4 o (VI) -> 6. El resto de reglas
podemos omitirlas.
Requisitos opcionales:
‚?ëRealizar la conversi√≥n de n√∫meros ar√°bigos a romanos.
‚?ëAplicar el resto de reglas de los n√∫meros romanos
 * @author MANU
 */

import java.util.Scanner;

public class E17_NumerosRomanosII {

      public static void main(String[] args) {
      
          Scanner sc =new Scanner(System.in);
          
          System.out.println("Dime n√∫mero romano:");
          
          String NRomano = sc.nextLine().trim().toUpperCase();
          NRomano = " "+ NRomano.concat(" ");
          
          int Total=0;
          
          for (int i=1; i<NRomano.length(); i++){
          
              //caracter1 = NRomano.charAt(i);
              //caracter2 = NRomano.charAt(i-1);
              String caracter1 =Character.toString(NRomano.charAt(i));
              String caracter2 =Character.toString(NRomano.charAt(i-1));
              //String caracter3 =Character.toString(NRomano.charAt(i+1));
              //String caracter4 =Character.toString(NRomano.charAt(i+1));
              
          
             // System.out.println("caracter1: " + caracter1 + " caracter2: " + caracter2 + " caracter2: " + caracter3);
              //if ((caracter1 == "I" && caracter2 == "I"  && caracter3 == "I" && caracter4 == "I")) {
              //  System.out.print("error");
              //} 
              if (caracter1.equals("M")) {
                  
                  Total = Total + 1000;
                
                  if (caracter2.equals("C")){
                  Total = Total - 200;
              
                  }
              } 
       
              if (caracter1.equals("D")) {
                  
                  Total = Total + 500;
                  
                  if (caracter2.equals("C")){
                   Total = Total - 200;
                  }
              } 
              
              if (caracter1.equals("C")) {
                  
                  Total = Total + 100;
                  
                  if (caracter2.equals("X")){
                  Total = Total - 20;
                  }
              } 
             
              if (caracter1.equals("L")) {
                  
                  Total = Total + 50;
                  
                  if (caracter2.equals("X")){
                  Total = Total - 20;
                  }
              } 
             
              if (caracter1.equals("X")) {
                  
                  Total = Total + 10;
                  
                  if (caracter2.equals("I")){
                  Total = Total - 2;
                  }
              } 
              
              if (caracter1.equals("V")) {
                  
                  Total = Total + 5;
                  
                  if (caracter2.equals("I")){
                  Total = Total - 2;
                 }
              } 
             
              if (caracter1.equals("I")) {
                  
                  Total = Total + 1;
                  
                  } 
              
          }
          System.out.println("el numero en decimal es " + Total);
    }
    
}
