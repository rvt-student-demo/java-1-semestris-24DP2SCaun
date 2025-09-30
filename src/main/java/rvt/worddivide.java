package rvt;

import java.util.Scanner;

public class worddivide {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scanner.nextLine();


        
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        
        scanner.close();
    }
}