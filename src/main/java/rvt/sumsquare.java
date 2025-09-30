package rvt;

import java.util.Scanner;

public class sumsquare {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int number = scanner.nextInt();

        
        int summa = 0;
        
        for (int i = 1; i <= number; i++) {
            summa += i * i;
        }

        System.out.println( summa );
        
        scanner.close();
    }
}