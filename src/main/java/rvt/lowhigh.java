package rvt;

import java.util.Scanner;

public class lowhigh {

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