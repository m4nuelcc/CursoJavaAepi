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
public class E11_Triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Dime Arista 1");
         int A = sc.nextInt();
        System.out.println("Dime Arista 2");
         int B = sc.nextInt();
        System.out.println("Dime Arista 3");
         int C = sc.nextInt();
         
         
          if (A==0 || B==0 || C==0){
             
            System.out.println("No es un Trinagulo");
            
         }else if (A == B || A == C || B == C ){
             
             System.out.println("Triángulo isósceles ");
             
         }else if (A==B && A==C &&  B==C){
             
             System.out.println("El triangulo es Equilàtero");
         }else if (A!=B && A!=C &&  B!=C){
             
             System.out.println("El triangulo es Escaleno");
         }
         
    }
    
}
