package rvt;

import java.util.Scanner;

public class cikls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//string, double, int
        

        while (true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
                if (input.equals("no")) {
            break;
        }

        scanner.close();

    }
    
}

}