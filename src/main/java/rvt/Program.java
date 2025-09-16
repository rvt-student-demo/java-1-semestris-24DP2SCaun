package rvt;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        //2
        System.out.println("Write a message: ");

        //3
        String message = scanner.nextLine();

        // 4
        System.out.println(message);

        scanner.close();
    }
}