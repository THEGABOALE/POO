package Models;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Animal {
    protected String name;
    protected int age;
    private String sonidoArchivo;

    public Animal(String name, int age, String sonidoArchivo) {
        this.name = name;
        this.age = age;
        this.sonidoArchivo = sonidoArchivo;
    }

    public void sonido(String mensaje) {
        System.out.println(mensaje);

        try {
            URL soundURL = getClass().getClassLoader().getResource(sonidoArchivo);
            if (soundURL == null) {
                System.out.println("No se encontró el archivo: " + sonidoArchivo);
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            // Esperar a que termine el sonido
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
