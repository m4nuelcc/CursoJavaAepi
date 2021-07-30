package Ejercicios_java_Aepi;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANU
 */
public interface E30_MisFunciones {
    
     public static String PintaTabla() {
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

    //Calcula la letra del DNI.
    public static String LetrasDni(int Numero) {

        String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String letra;
        int resultado = Numero % 23;
        letra = Letras.substring(resultado, resultado + 1);
        return Numero + letra;
    }

    //**************************************************************************
    // ValidaNumeros Funcion que valida si la entrada es un numero 
    public static boolean ValidacionNumeros(String Entrada) {

        boolean control = false;
        int contador = 0;
        String Numeros = "0123456789";

        for (int i = 0; i < Numeros.length(); i++) {

            for (int x = 0; x < Entrada.length(); x++) {

                if (Numeros.charAt(i) == Entrada.charAt(x)) {
                    contador++;
                }
            }
            if (contador == Entrada.length()) {
                control = true;
            }

        }

        return control;
    }

    //****************************************************************************
    public static String VerificaDni(String Numero1, String Numero2) { //comparamos el dni metido por el usuario con el generado en la funcion LetrasDni

        String Resultado;
        if (Numero1.equals(Numero2)) {

            Resultado = "El DNI " + Numero1 + " es CORRECTO";
        } else {
            int Numero3 = Integer.parseInt(Numero1.substring(0, Numero1.length() - 1));
            Resultado = "ERROR " + "El DNI correcto a Este Numero es: " + LetrasDni(Numero3); //generamos la letra del Dni erroneo
        }

        return Resultado;
    }

//******************************************************************************
// cls Mete lineas en blanco para simular limpiar consola    
    public static String cls(int Lineas) {

        for (int i = 1; i < Lineas; i++) {
            return " ";
        }
        return "";
    }

    
}
