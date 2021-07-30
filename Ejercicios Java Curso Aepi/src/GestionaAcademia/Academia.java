package GestionaAcademia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Academia {

public String nombre;
    public ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    
    public void Guardar() {
        try {
            File fichero = new File("alumnos.csv");
            FileWriter writer = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(writer);
            
            String contenido = "";
            for (Alumno alumno : this.alumnos) {
                contenido += alumno.toCSV() + "\n";
            }
            
            bw.write(contenido);

            bw.close();
            writer.close();
        }
        catch (Exception error) {
            
        }
    }
    
    public void Cargar() {
        try {
        File fichero = new File("pacientes.csv");
        FileReader reader = new FileReader(fichero);
        BufferedReader br = new BufferedReader(reader);
        
        String linea = br.readLine();
        while (linea != null) {
            String[] datos = linea.split(";");
            
            this.alumnos.add(new Alumno(
                    datos[0],
                    (byte)Integer.parseInt(datos[1]),
                    datos[2],
                    datos[3],
                    datos[4],
                    datos[5]
            ));
        
            linea = br.readLine();
        }
        
        br.close();
        reader.close();
        }
        catch (Exception error) {
            
        }
    }
    
    public String crearAlumno(String nombre, byte edad, String clase, String dni, String email) {
        alumnos.add(new Alumno(nombre, edad, clase, dni, email));
        return "Se ha agregado correctamente";
    }
    
    public String BuscarAlumno(String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno.nombre.equalsIgnoreCase(nombre))
                return alumno.toString();
        }
        return "El alumno no existe";
    }
    
    public String ModificarAlumno(String nombre, byte nuevaEdad, String nuevaClase, String nuevoDni, String nuevoEmail) {
        for (int indice = 0; indice < this.alumnos.size(); indice++) {
            if (this.alumnos.get(indice).nombre.equalsIgnoreCase(nombre)) {
                this.alumnos.get(indice).cambiarEdad(nuevaEdad);
                this.alumnos.get(indice).clase = nuevaClase;
                this.alumnos.get(indice).dni = nuevoDni;
                this.alumnos.get(indice).email = nuevoEmail;
                return "Se ha modificado el alumno";
            }
                
        }
        return "El alumno no existe";
    }
    
    public String ModificarAlumno(String nombre, byte edad) {
        for (int indice = 0; indice < this.alumnos.size(); indice++) {
            if (this.alumnos.get(indice).nombre.equalsIgnoreCase(nombre)) {
                this.alumnos.get(indice).cambiarEdad(edad);
                return "Se ha modificado la edad del alumno";
            }
                
        }
        return "El alumno no existe";
    }
    
    public String ModificarAlumno(String nombre, String clase) {
        for (int indice = 0; indice < this.alumnos.size(); indice++) {
            if (this.alumnos.get(indice).nombre.equalsIgnoreCase(nombre)) {
                this.alumnos.get(indice).clase = clase;
                return "Se ha modificado la clase del alumno";
            }
                
        }
        return "El alumno no existe";
    }
    
    public String EliminarAlumno(String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno.nombre.equalsIgnoreCase(nombre)) {
                alumnos.remove(alumno);
                return "El alumo ha sido eliminado";
            }
        }
        return "El alumno no existe";
    }
    
    public String MostrarTodos() {
        String contenido = "";
        
        for (Alumno alumno : alumnos) {
            contenido += alumno + "\n";
        }
        
        return contenido;
    }

}
