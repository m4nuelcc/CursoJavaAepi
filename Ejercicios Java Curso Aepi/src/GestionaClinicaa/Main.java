package GestionaClinicaa;

import com.google.gson.Gson;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
      
        String resultadoAPI = "[{'nombre':'hola'}]";
        
        Cat[] resultado = new Gson().fromJson(resultadoAPI, Cat[].class);
        
        //System.out.println(resultado[0].nombre);
    }

}
