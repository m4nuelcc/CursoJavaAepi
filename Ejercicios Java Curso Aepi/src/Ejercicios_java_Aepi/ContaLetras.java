package Ejercicios_java_Aepi;

import java.util.HashMap;
import java.util.Scanner;

public class ContaLetras {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase");

		
		String Frase = sc.nextLine();
		
		
		String Frase2 = Frase.replaceAll("[-+.^:,!]", "");

		String[] FraseLimpia = Frase2.split(" ");

		PalabrasRepetidas(FraseLimpia);

		System.out.println(PalabrasRepetidas(FraseLimpia));

	}

	public static HashMap<String, Integer> PalabrasRepetidas(String[] texto) {

		HashMap<String, Integer> Diccionario = new HashMap<String, Integer>();

		for (String a : texto) {

			if (Diccionario.containsKey(a)) {

				int total = Diccionario.get(a) + 1;

				Diccionario.put(a, total);

			} else {

				Diccionario.put(a, 1);

			}

		}

		return Diccionario;
	}

}
