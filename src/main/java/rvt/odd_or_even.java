package rvt;

import java.util.Scanner;

public class odd_or_even {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println( number + " is even");
        } else {
            System.out.println( number + " is odd");
        }
        
        scanner.close();
    }
}