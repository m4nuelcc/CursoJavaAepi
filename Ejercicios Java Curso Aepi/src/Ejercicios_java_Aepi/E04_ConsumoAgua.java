package Ejercicios_java_Aepi;

import java.util.Scanner;

/**
 *
 * @author MANU
 */
public class E04_ConsumoAgua {

    public static void main(String[] args) {
        // TODO code application logic here
                
        
        double Consumo = 0;
        double PrecioTotal=0;
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por Favor Introduca el Consumo");
        
        
        Consumo = sc.nextDouble();

        
         if (Consumo >= 0 && Consumo <=100 ){
             
            
             PrecioTotal = Consumo * 0.15;
                       
         }
         
        if (Consumo >=100  && Consumo <= 500){
            
 
            Consumo=Consumo-100;
            PrecioTotal = (100*0.15)+ (Consumo*0.20);
                    
                      
        }
               
        if (Consumo >=500 && Consumo <=1000){
            
            Consumo=Consumo-500;
            
            PrecioTotal = (100*0.15)+(400*0.20)+(Consumo*0.35);
                         
        }
         if (Consumo > 1000){
         
             Consumo=Consumo-1000;
             
             PrecioTotal=(100*0.15)+(400*0.20)+(500*0.35)+(Consumo*0.80); 
         }
        
         System.out.print(" COSTE TOTAL: " + PrecioTotal);
      

    }
    
}
