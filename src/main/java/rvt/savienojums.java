package rvt;

import java.util.Scanner;

public class savienojums {

    public static void main(String[] args) {
        ex2(); ex3(); ex4();
    }

    public static void ex2() {
        //1
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        if (number > 0) {
            System.out.println("pozitivs skaitlis");
        } else {
            System.out.println("negativs skaitlis");
        }
        scanner.close();
    }

    public static void ex3() {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        String vards1 = scanner.nextLine();
        System.out.println("Enter the second word");
        String vards2 = scanner.nextLine();
        
        if (vards1.equals (vards2)) {
            System.out.println("Same!");
        } else {
            System.out.println("Different");
        }
        scanner.close();
    }

    public static void ex4() {
        //1
        Scanner scanner = new Scanner(System.in);
        int number = 3;

        if (number == 1) {
            System.out.println("The number is one");
        } else if (number == 2) {
            System.out.println("The given number is two");
        } else if (number == 3) {
            System.out.println("The number must be three!");
        } else {
            System.out.println("Something else!");
        }
        scanner.close();
    }
}