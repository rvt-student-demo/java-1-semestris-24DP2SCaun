package rvt;

import java.util.Scanner;

public class else_if {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        int number = 3;

        if (number == 1) {
            System.out.println("The number is one");
        } else if (number == 2) {
            System.out.println("The given number is two");
        } else if (number == 3) {
            System.out.println("The number must be three!");
        } else {
            System.out.println("Something else!");
        }
        
        scanner.close();
    }
}