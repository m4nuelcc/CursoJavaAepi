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
public class E02_AdivinaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        
        
        //int NumeroAleatorio = 44;
        int NumeroAleatorio = (int)(Math.random()*10);
        
        System.out.println("Adivina el numero del 1 al 100: ");
        
        System.out.println("dime el numero: ");
        
        int  Numero = sc.nextInt();
        
        if (Numero == NumeroAleatorio){
            System.out.println("has Acertado");
        }else{
            System.out.println("has fallado, el numero era: "+ NumeroAleatorio);
        }
        
          
          
        
    }
    
    
}
