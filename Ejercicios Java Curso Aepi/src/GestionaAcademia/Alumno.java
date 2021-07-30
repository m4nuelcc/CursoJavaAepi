package GestionaAcademia;

import java.util.Random;

public class Alumno {

public String nombre;
    public String clase;
    public String contrasena;
    public String dni;
    public String email;
    
    private byte edad;
    private boolean mayorEdad;    
    
    public Alumno(String nombre, byte edad, String clase, String dni, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.clase = clase;
        this.dni = dni;
        this.email = email;
        this.mayorEdad = this.esMayorEdad();
        this.contrasena = this.generarContrasena();
    }
    
    public Alumno(String nombre, byte edad, String clase, String dni, String email, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.clase = clase;
        this.mayorEdad = this.esMayorEdad();
        this.contrasena = contrasena;
    }
    
    public byte obtenerEdad() {
        return this.edad;
    }
    
    public void cambiarEdad(byte edad) {
        this.edad = edad;
        
        this.mayorEdad = this.esMayorEdad();
    }
    
    public String toString() {
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + ", Clase: " + this.clase
                + ", Contrasena: " + this.contrasena + ", DNI: " + this.dni + ", Email: " + this.email;
    }
    
    public String toCSV() {
        return this.nombre + ";" + this.edad + ";" + this.clase + ";" + this.contrasena + ";" + this.dni + ";" + this.email + ";";
    }
    
    private boolean esMayorEdad() {
        return this.edad > 17;
    }
    
    private String generarContrasena() {
        String contrasena = "";
        
        String numeros = "1234567890";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caracteres = "!·$%&/()=?¿^*¨_:;";
        
        String[] valores = {letrasMinusculas, numeros, letrasMayusculas, caracteres};
        
        Random rnd = new Random();
        
        for (byte numero = 0; numero < 15; numero++) {
            int tipoValor = rnd.nextInt(4);
            int posicion = rnd.nextInt(valores[tipoValor].length());
            
            contrasena += valores[tipoValor].charAt(posicion);
        }
        
        return contrasena;
    }

}
