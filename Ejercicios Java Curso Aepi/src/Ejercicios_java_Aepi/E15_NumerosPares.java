package Ejercicios_java_Aepi;
/*
Díme un numero:-104
Díme un número: 300
hay 203 numero pares

COMENTARIOS ADICIONALES
    Tened en cuenta que hay varias formas de resolver la parte opcional.
REQUISITOS OPCIONALES
Realizarlo con un solo for
Que calcule los numeros tantos si son -104 a 300 como 300 a -104

 * @author MANU
 */
import java.util.Scanner;

public class E15_NumerosPares {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int cont=0;
        System.out.println("Dime Número1:");        
        numero1=Integer.parseInt(sc.nextLine());
        System.out.println("Dime Numero2:");
        numero2=Integer.parseInt(sc.nextLine());
              
        if (numero1<numero2){
            
            int numeroTmp = numero1;
            numero1=numero2;
            numero2=numeroTmp;
            System.out.println(numero1 + " " + numero2);
        }
        
        for (int i=numero2; i<=numero1; i++){
            
            if(i%2==0){
            cont++;
            }
        
        } 
         //System.out.println(numero1 + " " + numero2+ " " +total);
         
         System.out.println("hay " + cont + " numeros pares");
        
    }
    
}
