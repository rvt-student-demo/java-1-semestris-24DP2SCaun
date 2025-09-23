package rvt;

import java.util.Scanner;

public class veikals {

    public static void main(String[] args) {
        
        // Ievadam konstantes priekšmetu cenām
        final int SKRUVES_CENA = 5;
        final int UZGRIEZNA_CENA = 3;
        final int PAPLAKSNES_CENA = 1;

        // Izveidojam Scanner objektu ievadei
        Scanner scanner = new Scanner(System.in);

        // Lietotāja ievade
        System.out.print("Ievadiet skruvju skaitu: ");
        int skruves = scanner.nextInt();

        System.out.print("Ievadiet uzgrieznu skaitu: ");
        int uzgriezni = scanner.nextInt();

        System.out.print("Ievadiet paplaksn4u skaitu: ");
        int paplaksnes = scanner.nextInt();

        // Pārbaudām pasūtījumu
        boolean irKluda = false;
        
        if (uzgriezni < skruves) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
            irKluda = true;
        }

        if (paplaksnes < 2 * skruves) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
            irKluda = true;
        }

        if (!irKluda) {
            System.out.println("Pasutijums ir kartiba.");
        }

        // Aprēķinām un izdrukājam kopējo cenu
        int kopejaCena = (skruves * SKRUVES_CENA) + (uzgriezni * UZGRIEZNA_CENA) + (paplaksnes * PAPLAKSNES_CENA);
        System.out.println("Kopeja cena: " + kopejaCena);

        scanner.close();
    }
}