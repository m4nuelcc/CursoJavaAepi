package GestionaAcademia;

import java.util.Scanner;

public class GestionAcademia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Academia miAcademia = new Academia();
        miAcademia.Cargar();
        
        while (true) {        
            System.out.println("Gestion de alumnos");
            System.out.println("[0] Agregar");
            System.out.println("[1] Buscar");
            System.out.println("[2] Modificar");
            System.out.println("[3] Eliminar");
            System.out.println("[4] Mostrar todos");
            System.out.println("[5] Salir");

            System.out.println("Dime una opcion: ");
            char opcion = sc.nextLine().charAt(0);

            String nombre, clase, dni, email;
            byte edad;

            switch (opcion) {
                case '0':
                    System.out.println("Dime un nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Dime un edad: ");
                    edad = Byte.parseByte(sc.nextLine());
                    System.out.println("Dime un clase: ");
                    clase = sc.nextLine();
                    System.out.println("Dime un dni: ");
                    dni = sc.nextLine();
                    System.out.println("Dime un email: ");
                    email = sc.nextLine();

                    System.out.println(miAcademia.crearAlumno(nombre, edad, clase, dni, email));
                    
                    miAcademia.Guardar();
                    break;
                case '1':
                    System.out.println("Dime un nombre: ");
                    nombre = sc.nextLine();

                    System.out.println(miAcademia.BuscarAlumno(nombre));
                    break;
                case '2':
                    System.out.println("Dime un nombre: ");
                    nombre = sc.nextLine();
                    
                    System.out.println("Dime una nueva edad: ");
                    edad = Byte.parseByte(sc.nextLine());
                    System.out.println("Dime una nueva clase: ");
                    clase = sc.nextLine();
                    System.out.println("Dime un nuevo dni: ");
                    dni = sc.nextLine();
                    System.out.println("Dime un nuevo email: ");
                    email = sc.nextLine();
                    
                    miAcademia.ModificarAlumno(nombre, edad, clase, dni, email);
                    
                    miAcademia.Guardar();
                    break;
                case '3':
                    System.out.println("Dime un nombre: ");
                    nombre = sc.nextLine();

                    System.out.println(miAcademia.EliminarAlumno(nombre));
                    
                    miAcademia.Guardar();
                    break;
                case '4':                
                    System.out.println(miAcademia.MostrarTodos());
                    break;
                case '5':
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }

}
