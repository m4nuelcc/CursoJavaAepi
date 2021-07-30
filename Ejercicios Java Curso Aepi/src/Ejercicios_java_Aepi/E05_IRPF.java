/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_java_Aepi;

import java.util.Scanner;

/**
 *
 * @author MANU
 */
public class E05_IRPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Dime tu Salario:");
        
        double Impuestos = 0;
        
     
                
        int  Salario = sc.nextInt();
        
        if (Salario < 12450){
            
            Impuestos = Salario * 0.19;
            System.out.println("caso1");
            
            
        }
        if (Salario>12450 && Salario <= 20200 ){
            
            Impuestos = (12450 * 0.19) + ((Salario - 12450) * 0.24);
            System.out.println("caso2");
            
        }
        
        if (Salario >20200 && Salario < 35200 ){
            
            Impuestos = (12450*0.19) + ((20200-12450) * 0.24)
                    +((Salario-20200)* 0.30);
           System.out.println("caso3");
        }
        
        if (Salario>35200 && Salario < 60000){
 
            Impuestos = (12450*0.19) + ((20200-12450) * 0.24)
                        +((35200-20200)*0.30) + ((Salario-35200)* 0.37);  
            System.out.println("caso4");
        }
        
        if (Salario > 60000){
            
            System.out.println("caso5");
            Impuestos = (12450*0.19) + ((20200-12450) * 0.24)
                        +((35200-20200)*0.30) + ((60000-35200)*0.37)
                        + (Salario - 60000) * 0.45;  
                   }
        
            System.out.println("Con un  salario de: " + Salario);
            System.out.println("Tributas anualmente: " + Impuestos);
            
            

    }
            
          
                         
        
    }
    

