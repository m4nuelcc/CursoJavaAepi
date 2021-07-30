package GestionaClinicaa;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Clinica {

    ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

    public void guardarCSV() {
        try {
            File fichero = new File("pacientes.csv");
            FileWriter escritor = new FileWriter(fichero);
            BufferedWriter buffer = new BufferedWriter(escritor);

            String contenido = "";

            for (Paciente paciente : this.pacientes) {
                contenido += paciente.toCSV() + "\n";
            }

            buffer.write(contenido);

            buffer.close();
            escritor.close();
        } catch (IOException error) {
            System.out.println("Hay un error");
        }
    }

    public void cargarCSV() throws FileNotFoundException, IOException {
        File fichero = new File("pacientes.csv");

        if (fichero.exists()) {
            FileReader lector = new FileReader(fichero);
            BufferedReader buffer = new BufferedReader(lector);

            String linea = buffer.readLine();
            while (linea != null) {
                String[] datos = linea.split(";");

                this.agregarPacientes(
                        datos[0],
                        Short.parseShort(datos[1]),
                        datos[2],
                        datos[3].charAt(0),
                        Float.parseFloat(datos[4]),
                        Float.parseFloat(datos[5])
                );

                linea = buffer.readLine();
            }

            buffer.close();
            lector.close();
        }
    }

    public void guardarJSON() {
        try {
            File fichero = new File("pacientes.json");
            FileWriter escritor = new FileWriter(fichero);
            BufferedWriter buffer = new BufferedWriter(escritor);

            buffer.write(new Gson().toJson(this.pacientes));

            buffer.close();
            escritor.close();
        } catch (IOException error) {
            System.out.println("Hay un error");
        }
    }

    public void cargarJSON() {
        try {
            File fichero = new File("pacientes.json");
            String texto = new String(Files.readAllBytes(Paths.get(fichero.getAbsolutePath())));
            
            Paciente[] pacientes = new Gson().fromJson(texto, Paciente[].class);
            for (Paciente paciente : pacientes) {
                this.pacientes.add(paciente);
            }
            
        } catch (Exception error) {

        }
    }

    public String agregarPacientes(String nombre, short edad, String dni, char sexo, float peso, float altura) {
        this.pacientes.add(new Paciente(nombre, edad, dni, sexo, peso, altura));
        return "Se ha agregado correctamente";
    }

    public String buscarPaciente(String nombre) {
        for (Paciente paciente : this.pacientes) {
            if (paciente.nombre.equals(nombre)) {
                return paciente.toString();
            }
        }
        return "No encuentro al paciente.";
    }

    public String consultarIMC(String nombre) {
        for (Paciente paciente : this.pacientes) {
            if (paciente.nombre.equals(nombre)) {
                return "IMC: " + paciente.obtenerIMC();
            }
        }
        return "No encuentro al paciente.";
    }

    public String consultarMayorEdad(String nombre) {
        for (Paciente paciente : this.pacientes) {
            if (paciente.nombre.equals(nombre)) {
                return "Mayor edad: " + paciente.obtenerMayorEdad();
            }
        }
        return "No encuentro al paciente.";
    }

    public String mostrarPacientes() {
        String contenido = "";

        for (Paciente paciente : this.pacientes) {
            contenido += paciente + "\n";
        }

        return contenido;
    }

}
