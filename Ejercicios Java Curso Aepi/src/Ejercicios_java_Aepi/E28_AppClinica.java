package Ejercicios_java_Aepi;


/*
Gestión de una clínica

Menu
[0] Agregar un paciente
[1] Buscar por paciente por nombre
[2] Consultar el IMC de una persona
[3] Consultar si es mayor de edad
[4] Mostrar todas los pacientes con todos sus datos.

Paciente
Nombre, edad, dni, sexo, peso y altura.

Métodos
CalcularIMC - peso / (altura ** 2)
EsMayorEdad

Comentarios adicionales:
???Para ver como se calcula el IMC https://es.wikipedia.org/wiki/
??ndice_de_masa_corporal MASA/ESTATURA*ESTATURA
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MANU
 */
//import Mis_pruebas.MisFunciones;
import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class E28_AppClinica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        E29_Clinica miClinica = new E29_Clinica();
      //  Pattern pat = Pattern.compile("[0-9]{7,8}[A-Z a-z]");

        while (true) {

            System.out.println();
            System.out.println("Gestión Clínica");
            System.out.println("[0] Agregar un paciente");
            System.out.println("[1] Buscar por paciente por nombre");
            System.out.println("[2] Consultar el IMC de una persona");
            System.out.println("[3] Consultar si es mayor de edad");
            System.out.println("[4] Mostrar todas los pacientes con todos sus datos");
            System.out.println("[5] Salir");

            System.out.println("Dime una opción: ");

            short opcion = Short.parseShort(sc.nextLine());

            String nombre, Dni = " ";
            int edad;
            char sexo;
            double peso, altura;
            boolean control = true;
            int DniSinLetra = 0;

            switch (opcion) {

                case 0:
                   
                    System.out.println("Introduzca Nombre del Paciente: ");
                    nombre = sc.nextLine();
                    System.out.println("Introduzca la Edad: ");
                    edad = Integer.parseInt(sc.nextLine());

                    while (control) {

                        System.out.println("Dime tu DNI por Favor");

                        Dni = sc.nextLine().toUpperCase().trim();

                        if (E30_MisFunciones.ValidacionNumeros(Dni.substring(0, Dni.length() - 1))) { //preguntar porque Clinica.ValidacionNumeros  funciona con Clinica y con miClinica
                            DniSinLetra = Integer.parseInt(Dni.substring(0, Dni.length() - 1));//
                            System.out.println(E30_MisFunciones.VerificaDni(Dni, E30_MisFunciones.LetrasDni(DniSinLetra)));
                            Dni = E30_MisFunciones.LetrasDni(DniSinLetra); 
                            control = false;
                        } else {
                            control = true;
                        }

                    }

                    System.out.println("Introduzca la Sexo: ");
                    sexo = sc.nextLine().charAt(0);
                    System.out.println("Introduzca el Peso: ");
                    peso = Double.parseDouble(sc.nextLine());
                    System.out.println("Introduzca Altura: ");
                    altura = Double.parseDouble(sc.nextLine());

                    System.out.println(miClinica.CrearNuevoPaciente(nombre, Dni, edad, sexo, peso, altura));

                    break;

                case 1:
                    E30_MisFunciones.cls(10);
                    System.out.println("Introduzca Nombre del paciente: ");
                    nombre = sc.nextLine();
                    System.out.println(miClinica.BuscarPaciente(nombre));
                    break;
                case 2:
                    System.out.println("     CALCULO DEL IMC: \n"
                            + " Introduzca Nombre del paciente");
                    nombre = sc.nextLine();
                    System.out.println(miClinica.PintaTabla());
                    E30_MisFunciones.cls(2);
                    System.out.println(miClinica.CalculoMasaCorporal(nombre));
                    
                    System.out.println("pulse una tecla para continuar");
                    String x = sc.nextLine();
                    break;
                case 3:
                    System.out.println("Dime un nombre: ");
                    nombre = sc.nextLine();
                    System.out.println(miClinica.ConsultaMayorEdad(nombre));
                    //   System.out.println(eliminar_articulo(nombre));
                    break;
                case 4:
                    System.out.println(miClinica.ConsultaTodosUsuarios());
                    break;
                    
                default:
                    System.out.println("Adios");
                    System.exit(0);
                    break;
            }

        }

    }

}
/*
while (control){
                        System.out.println("Introduzca el Dni: ");
                        Dni = sc.nextLine();
                        Matcher mat = pat.matcher(Dni); 
                            if ( mat.matches()){
                                System.out.println("Dni correcto");
                            }else{
                                System.out.println("Dni incorrecto");
                                control= true;
                            }
                    }
 */
