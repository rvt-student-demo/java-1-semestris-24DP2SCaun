package rvt;

import java.util.Scanner;

public class sum_of_a_range_of_sequantial_integers {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Low");
        int low = scanner.nextInt();

        System.out.println("high");
        int high = scanner.nextInt();

        
        int summa = 0;
        
        for (int i = low; i <= high; i++) {
            summa += i;
        }

        System.out.println( summa );
        
        scanner.close();
    }
}