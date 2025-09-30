package rvt;

import java.util.Scanner;

public class numbers {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting number");
        int start = scanner.nextInt();

        System.out.println("Enter the ending number");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i ++) {
            System.out.println(i + "");
        }
        
        scanner.close();
    }
}