package PlayerMultimediale2;

import PlayerMultimediale.Video;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){

//creare un if per selezionare se audio, video o immagine

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Cosa vuoi fare?");
        System.out.println("Digita: audio, video, immagine");

        String input = scanner.nextLine();

 switch (input) {
     case "audio":
     System.out.println("Cosa vuoi ascoltare?");
     String titolo = scanner.nextLine();
     System.out.println("Chi canta questa canzone?");
     String autore = scanner.nextLine();
     int durata = random.nextInt(5);
     System.out.println("Regola volume (0 a 10)");
     int volume = scanner.nextInt();

     Audio2 brano = new Audio2(titolo, autore, durata, volume);
     brano.play();
     brano.abbassaVolume();
     brano.alzaVolume();
     break;

     case "video":
         System.out.println("Cosa vuoi guardare?");
         String t = scanner.nextLine();

         int d = random.nextInt(10);

         System.out.println("Regola volume (0 a 10)");
         int v = scanner.nextInt();

         System.out.println("Imposta luminosità");

         int lum = scanner.nextInt();
         Video2 video = new Video2(t,d,v,lum);
         video.play();
         video.regolaLum();

         break;

     case "immagine":
         System.out.println("Scegli immagine");
         String ti = scanner.nextLine();

         System.out.println("Imposta luminosità, valore da 1 a 10");
         int lu = scanner.nextInt();
         Immagine img = new Immagine(ti, lu);
         img.show();
         img.regolaLum();
         break;

     default:
         System.out.println("Scegli un'opzione valida");
 }
       /* System.out.println("Cosa vuoi guardare?");
        String t = scanner.nextLine();
        int d = random.nextInt(10);
        System.out.println("Regola volume (0 a 10)");
        int vol = scanner.nextInt();
*/
         // Video2 video = new Video2(t, d, vol);
         // video.play();

scanner.close();
    }



}
