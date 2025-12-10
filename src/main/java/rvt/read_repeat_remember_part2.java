package rvt;

import java.util.Scanner;


public class read_repeat_remember_part2 {
public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Write numbers: ");
        while(true) {
            int number = scanner.nextInt();
            if(number == -1) {
            System.out.println("Thx, Bye!");
            break;
            }
            sum += number;

            }

            System.out.println(sum);

            scanner.close();
        }

    
}
