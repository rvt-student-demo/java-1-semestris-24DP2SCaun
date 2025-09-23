package rvt;

import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        
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
}