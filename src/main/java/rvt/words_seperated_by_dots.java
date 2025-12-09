package rvt;

import java.util.Scanner;

public class words_seperated_by_dots {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scanner.nextLine();

        System.out.println("Enter a second word: ");
        String word2 = scanner.nextLine();

        int lenght = 30;
        int dotsCount = lenght - (word.length() + word2.length());
        StringBuilder dots = new StringBuilder();

        
        for (int i = 0; i < dotsCount; i++) {
           dots.append (".");
        }

         System.out.println( word + dots + word2);
        
        scanner.close();
    }
}