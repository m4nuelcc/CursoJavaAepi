package GestionaClinicaa;

public class Paciente {

    String nombre;
    short edad;
    String dni;
    char sexo;
    float peso;
    float altura;
    
    public Paciente(String nombre, short edad, String dni, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        return this.nombre + ", " + this.edad + ", " + this.dni + ", " + this.sexo + ", " + this.peso + ", " + this.altura;
    }
    
    public String toCSV() {
        return this.nombre + ";" + this.edad + ";" + this.dni + ";" + this.sexo + ";" + this.peso + "; " + this.altura;
    }
    
    public boolean obtenerMayorEdad() {
        return this.edad > 17;
    }
    
    public float obtenerIMC() {
        return (float)(this.peso / Math.pow(this.altura / 100 , 2));
    }

}
