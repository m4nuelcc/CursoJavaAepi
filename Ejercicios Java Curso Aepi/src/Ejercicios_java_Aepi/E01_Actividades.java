package Ejercicios_java_Aepi;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mycompany.Saludo;

import java.util.Scanner;

/**
 *
 * @author MANU
 */
public class E01_Actividades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime una temperatura:");
        
        short Temperatura = sc.nextShort();
        
        if (Temperatura <= 5 || Temperatura >= 45){
        
            System.out.println("es mejor quedase en casa a esperar mejor tiempo");
        }else if (Temperatura > 30) {
            
            System.out.print("Es un dìa estupendo para hacer Natación");
            
        }else if (Temperatura > 20 && Temperatura <=30){
            
            System.out.println("Hace un dìa estupendo para jugar a Tenis");
            
        }else if (Temperatura > 10 && Temperatura <= 20){
        
            System.out.print("Es un dìa estupendo para practicar Golf");
            
        }else if (Temperatura > 5 && Temperatura <=10){
        
            System.out.println("Hace una temperatura ideal para Esquiar");
        }
        
    }
    
}
