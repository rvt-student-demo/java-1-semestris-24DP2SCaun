package rvt;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//string, double, int
        String nosaukums = scanner.nextLine();

        double cena = scanner.nextDouble();

        int skaits = scanner.nextInt();

        System.out.println("Produkts: " + nosaukums + "\n" + "cena" + cena + "\n" + "skaits: " + skaits);
        System.out.println("Totalprice: " + skaits * cena);
        scanner.close();


    }
    
}