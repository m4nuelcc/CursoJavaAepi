package Ejercicios_java_Aepi;

import java.util.ArrayList;

public class E29_Clinica {

    private ArrayList<E31_Paciente> pacientes = new ArrayList<E31_Paciente>();

    public String CrearNuevoPaciente(String nombre, String Dni, int edad, char sexo, double peso, double altura) {

        //pacientes.add(NuevoPaciente("manuel", "5098774C",44,'v',88,1,73));
        E31_Paciente NuevoPaciente = new E31_Paciente(nombre, Dni, edad, sexo, peso, altura);
        pacientes.add(NuevoPaciente);
        return "Paciente añadido correctamente";
    }

    public String BuscarPaciente(String nombre) {

        for (E31_Paciente paciente : pacientes) {
            if (paciente.nombre.equals(nombre)) {
                return paciente.nombre + " " + paciente.Dni;
            }
        }

        return "paciente no encontrado";
    }

    public String CalculoMasaCorporal(String nombre) {

        for (E31_Paciente paciente : pacientes) {
            if (paciente.nombre.equals(nombre)) {
                double Resultado = Math.round(paciente.peso / (paciente.altura * paciente.altura));
                return "�?ndice de masa corporal " + Resultado + " IMC (kg/m²)\n\n";

            }
        }
        return "paciente no encontrado";
    }

    public String ConsultaMayorEdad(String Nombre) {

        for (E31_Paciente paciente : pacientes) {

            if (paciente.nombre.equals(Nombre)) {
                if (paciente.edad >= 18) {
                    return "paciente: " + paciente.nombre + " es mayor de edad;";
                } else {
                    return "paciente: " + paciente.nombre + " es menor de edad;";

                }
            }

        }

        return " el paciente: " + Nombre + " No Encontrado";
    }

    public String ConsultaTodosUsuarios() {

        String Listado = "";

        for (E31_Paciente paciente : pacientes) {

            Listado += paciente.peso + "            " + paciente.Dni + "            " + paciente.edad + "           "
                    + paciente.sexo + "          " + paciente.altura + "           " + paciente.nombre + "\n";

        }

        return "NOMBRE          DNI         EDAD            SEXO            ALTURA          PESO \n"
                + Listado;
    }

    public String PintaTabla() {
        String Listado = "";
        String imc[] = {"<18,5   ", "18,5-24,9", "25-16-9", "27-29,9", "30-34,9", "35-39,9", "40-49,9", ">50     "};
        String Clasificacion[] = {"peso insuficiente", "peso normal", "Sobrepeso grado I",
            "sobrepeso Grado II (presobesidad)", "Obesidad de tipo I",
            "Obesidad tipo II", "Obesidad tipo III (mórbida", "Obesidad de tipo IV (extrema)"};
        System.out.println("Composición corporal	�?ndice de masa corporal (IMC)\n");
        for (int i = 0; i < imc.length; i++) {

            Listado += "   " + imc[i] + "                   " + Clasificacion[i] + "\n";

        }
        return Listado;
    }

}