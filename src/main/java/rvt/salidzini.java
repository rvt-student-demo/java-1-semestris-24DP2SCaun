package rvt;

import java.util.Scanner;

public class salidzini {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password?");
        String parole = scanner.nextLine();
        
        if (parole.equals("Caput Drakonis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

        scanner.close();
    }
}