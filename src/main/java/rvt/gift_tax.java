package rvt ;

import java.util.Scanner;

public class gift_tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift? ");
        double value = scanner.nextDouble();

        double tax = CalculateGiftTax(value);

        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Gift tax: " + tax);
        }

        scanner.close();

    }

    public static double CalculateGiftTax(double value) {
        double tax = 0.0;

        if (value < 5000) {
            tax = 0.0;
        } else if (value <= 25000) {
            double lower_limit = 100;
            double rate = 0.08;
            double exceeding_amount = value - 5000;
            tax = lower_limit + (exceeding_amount * rate);
        }
            else if (value <= 55000) {
            double lower_limit = 1700;
            double rate = 0.10;
            double exceeding_amount = value - 25000;
            tax = lower_limit + (exceeding_amount * rate);
            }

            else if (value <= 200000) {
            double lower_limit = 4700;
            double rate = 0.12;
            double exceeding_amount = value - 55000;
            tax = lower_limit + (exceeding_amount * rate);
            }

            else if (value <= 1000000) {
            double lower_limit = 22100;
            double rate = 0.15;
            double exceeding_amount = value - 200000;
            tax = lower_limit + (exceeding_amount * rate);
            }

            else {
            double lower_limit = 142100;
            double rate = 0.17;
            double exceeding_amount = value - 1000000;
            tax = lower_limit + (exceeding_amount * rate);
            }

            return Math.round(tax * 10) / 10.0;
        
    }
}