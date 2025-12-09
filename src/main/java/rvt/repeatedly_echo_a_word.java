package rvt;

import java.util.Scanner;

public class repeatedly_echo_a_word {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scanner.nextLine();

        int lenght = word.length();

        
        for (int i = 0; i < lenght; i++) {
            System.out.println( word );
        }

        
        scanner.close();
    }
}