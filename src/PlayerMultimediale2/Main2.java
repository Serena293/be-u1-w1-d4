package PlayerMultimediale2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] elementi = new String[5];
        int index = 0;

        while (index < elementi.length) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("Digita: audio, video, immagine");

            String input = scanner.nextLine();

            switch (input) {
                case "audio":
                    System.out.println("Cosa vuoi ascoltare?");
                    String titoloAudio = scanner.nextLine();
                    elementi[index] = "Audio: " + titoloAudio;

                    System.out.println("Chi canta questa canzone?");
                    String autore = scanner.nextLine();
                    int durata = random.nextInt(5);
                    System.out.println("Regola volume (0 a 10)");
                    int volume = scanner.nextInt();
                    scanner.nextLine();

                    Audio2 brano = new Audio2(titoloAudio, autore, durata, volume);
                    brano.play();
                    brano.abbassaVolume();
                    brano.alzaVolume();
                    break;

                case "video":
                    System.out.println("Cosa vuoi guardare?");
                    String titoloVideo = scanner.nextLine();
                    elementi[index] = "Video: " + titoloVideo;

                    int durataVideo = random.nextInt(10);
                    System.out.println("Regola volume (0 a 10)");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Imposta luminosità");
                    int luminosita = scanner.nextInt();
                    scanner.nextLine();

                    Video2 video = new Video2(titoloVideo, durataVideo, volumeVideo, luminosita);
                    video.play();
                    video.regolaLum();
                    break;

                case "immagine":
                    System.out.println("Scegli immagine");
                    String titoloImmagine = scanner.nextLine();
                    elementi[index] = "Immagine: " + titoloImmagine;

                    System.out.println("Imposta luminosità, valore da 1 a 10");
                    int luminositaImg = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline

                    Immagine img = new Immagine(titoloImmagine, luminositaImg);
                    img.show();
                    img.regolaLum();
                    break;

                default:
                    System.out.println("Scegli un'opzione valida");
                    index--;
                    break;
            }

            index++;
        }

        System.out.println("Contenuto dell'array: " + Arrays.toString(elementi));
        scanner.close();
    }
}
