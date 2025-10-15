package rvt;

import java.util.Scanner;

public class delikatese_array {


public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Ievadi preci: ");
String prece = scanner.nextLine();

System.out.print("Ievadi cenu: ");
double cena = scanner.nextDouble();

System.out.print("Ekspress piegade (0=ne, 1=ja): ");
int express = scanner.nextInt();

double piegade = 0;

if (cena < 10) {
piegade = 2;
}

if (express == 1) {
piegade += 3;
}

double kopa = cena + piegade;

System.out.println("\nRekins:");
System.out.println(prece + " " + cena);
System.out.println("piegade " + piegade);
System.out.println("kopa " + kopa);
scanner.close();
}

}