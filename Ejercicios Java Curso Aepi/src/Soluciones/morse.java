package Soluciones;

import java.util.Scanner;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class morse {
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {

        String[][] morse = { {"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."}, {"E", "."}, {"F", "..-."}, {"G", "--."}, {"H", "...."}, {"I", ".."}, {"J", ".---"}, {"K", "-.-"}, {"L", ".-.."}, {"M", "--"}, {"N", "-."}, {"O", "---"}, {"P", ".--."}, {"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"}, {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"}, {"Y", "-.--"}, {"Z", "--.."}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un texto: ");
        String texto = sc.nextLine().toUpperCase();
        sc.close();

        String textoMorse = "";

        for (char letra : texto.toCharArray()) {
            for (int i = 0; i < morse.length; i++) {
                if (letra == morse[i][0].charAt(0))
                    textoMorse += morse[i][1];
            }
        }

        System.out.print("Morse: " + textoMorse);

        System.out.println("Haciendo sonar el sonido...");

        for (char valorMorse : textoMorse.toCharArray()) {
            if (valorMorse == '.') {

                Clip SonidoPunto = AudioSystem.getClip();
                SonidoPunto.open(AudioSystem.getAudioInputStream(new File("punto.wav")));
                SonidoPunto.start();

                Thread.sleep(1000);

                SonidoPunto.close();

            } else {

                Clip SonidoRaya = AudioSystem.getClip();
                SonidoRaya.open(AudioSystem.getAudioInputStream(new File("raya.wav")));
                SonidoRaya.start();

                Thread.sleep(1000);

                SonidoRaya.close();

            }
        }

        System.out.println("Fin");        
    }
}