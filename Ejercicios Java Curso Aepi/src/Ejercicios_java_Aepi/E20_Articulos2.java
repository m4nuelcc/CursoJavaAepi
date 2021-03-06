package Ejercicios_java_Aepi;
/*
# Articulos

```
Articulos
[0] Agregar articulo
[1] Consultar articulo
[2] Eliminar articulo
```

**Comentarios adicionales:**
* Cada articulo se compone de nombre y precio

**Requisitos opcionales:**
* El programa tiene que tener un bucle infinito, es decir, debo poder agregar una articulos y luego consultarla.
* Tengo que poder añadir tantos articulos como sean necesarios o gestionarlos.

---
 * @author MANU
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class E20_Articulos2 {

    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> Listado = new HashMap< String, Integer>();
        String Articulo;
        int Precio , Indice;
        String opcion="";
        String opcion2="";
        
        Listado.put("coche", 28000);
        Listado.put("autobus", 50000);
        Listado.put("patinete", 300);
        Listado.put("bici", 600);
        Listado.put("palmera de chocolate", 2);
        
        
       while (opcion != "3"){
            
            System.out.println("Articulos");
            System.out.println("[0] Agregar articulo\n" +
                               "[1] Consultar articulo\n" +
                               "[2] Eliminar articulo\n" +
                               "[3] Salir\n" +
                                "");
            
            opcion = sc.next();
            switch (opcion){
                
                case "0":
                   
                    System.out.println("Introduzca el ARTICULO");
                    Articulo = sc.next();
                    //Indice = Listado.size();
                    //System.out.println("este es el indice " + Indice);
                    System.out.println("Intdoduzca el precio del articulo");
                    Precio = sc.nextInt();
                    Listado.put(Articulo, Precio);
                    System.out.println("Su Articulo ha sido introducido CORRECTAMENTE");
                   
                    break;
                     
                case "1":
                    for (int i=0; i<200; i++){
                         System.out.println();       
                    }
                    while (opcion2 !="3"){
                    
                        System.out.println("[1] Mostar la lista de articulos");
                        System.out.println("[2] Encontrar un producto");
                        System.out.println("[3] Salir");
                        opcion2=sc.next();
                        System.out.println(opcion2);
                        
                        switch (opcion2){
                        
                            case "1":
                                 for (Map.Entry<String, Integer> Entrada: Listado.entrySet()){
                                 String  Clave = Entrada.getKey();
                                 String valor = Entrada.toString();
                                 System.out.println(valor);                      
                                 }
                                break;
                            case "2":
                                 System.out.println("Que articulo quieres buscar: ");
                                 String Busqueda = sc.next();
                                    for (Map.Entry<String, Integer> Entrada: Listado.entrySet()){  
                                       String  Clave = Entrada.getKey();
                                       String valor = Entrada.toString();
                      
                                         if (Clave.contentEquals(Busqueda)){
                                             System.out.println(valor);                      
                                         }
                                    }
                                break;
                            case "3":
                                opcion2="3";
                                break;
                        }
                    }                  
                    break;
                case "2":
                    
                    for (Map.Entry<String, Integer> Entrada: Listado.entrySet()){
                      String  Clave = Entrada.getKey();
                      String valor = Entrada.toString();
                      System.out.println(valor);                      
                    }
                    System.out.println("Teclee el articulo que quiere Borrar");
                    String borrar = sc.next();
                    String SN ="";
                    do{
                        System.out.println("seguro que quiere borrar? " + borrar  + "  S/N");
                        SN = sc.next().toUpperCase();
                        if (SN.equals("S")){
                           int borrado = Listado.get(borrar);
                           Listado.remove(borrar);
                           System.out.println(borrado + " BORRADO CORRECTAMENTE");
                           break;
                         } else if  (SN.equals("N"))
                           {
                             System.out.println("NO HA SIDO BORRADO");
                             break;
                          }                      
                     }                  
                   while (SN != "N" || SN != "S");  
                  break;  
                  
                case "3":
                  opcion="3";  
                  break;
                        
            }
        }
       for (int i=0; i<200; i++){
           System.out.println();       
        }
     System.out.println("ADIOS"); 
    }
}

