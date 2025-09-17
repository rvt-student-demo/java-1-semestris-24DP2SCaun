package rvt;

import java.util.Scanner;

public class sazarojums {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        int age = Integer.valueOf(scanner.nextLine());
        if (age >= 18) {
            System.out.println("Tu esi pilngadīgs");
        } else {
            System.out.println("Tu neesi pilngadigs");
        }
        scanner.close();
    }
}