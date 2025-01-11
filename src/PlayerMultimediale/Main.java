package PlayerMultimediale;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Cosa vuoi ascoltare?");
        String titolo = scanner.nextLine();
        System.out.println("Chi canta questa canzone?");
        String autore = scanner.nextLine();
        int durata = random.nextInt(5);

        Audio brano = new Audio(titolo, durata, autore);
        brano.play();

        System.out.println("Regola volume (0 a 10)");
        int vol = scanner.nextInt();
        brano.setVolume(vol);

}}