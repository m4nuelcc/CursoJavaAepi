package Ejercicios_java_Aepi;


/*
 # CodigoMorse

```
Dime un texto: sos

...---...
```

**Comentarios adicionales:**
* El código morse tiene su tabla de conversión, https://es.wikipedia.org/wiki/C%C3%B3digo_morse

**Requisitos opcionales:**
* Que reproduzca el código morse con sonido
* Realizar el ejercicio al revés, de código morse a texto.

 * @author MANU
 */

import java.awt.Toolkit;
import java.util.Scanner;

public class E21_CodigoMorse {

    public static void main(String[] args) {
        
              
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", 
                          "....", "..", ".---", "-.-", ".-..", "--", "-.",
                          "--.--", "---", ".--.", "--.-", ".-.", "...", "-", 
                          "..-", "...-", ".--", "-..-", "-.--", "--..","|"};      
        
	String[] palabras= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                            "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", 
                            "T", "U", "V", "W", "X", "Y", "Z"," "};
	
       
        
        
        System.out.println("Dime un texto");
        Scanner sc = new Scanner(System.in);
        String TextoUsuario = sc.nextLine().toUpperCase();
        
        String traduccion = "";
        String letra = "";
		
			
		for(int i=1; i<=TextoUsuario.length(); i++){
					
		 letra = TextoUsuario.substring(i-1, i);
                 System.out.println(letra);
			
	          for(int j=0; j<palabras.length; j++){
				
		     if(letra.equals(palabras[j])){
                            traduccion = traduccion + morse[j];
                            Toolkit.getDefaultToolkit().beep();
                      }
	          }
                }
                
              System.out.print(traduccion);  
	}
      
    }
