package rvt;

import java.util.Scanner;


public class read_repeat_remember_part4 {
public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Write numbers: ");
        while(true) {
            int number = scanner.nextInt();
            if(number == -1) {
            System.out.println("Thx, Bye!");
            break;
            }
            sum += number;

            count++;

            }

            System.out.println(sum);
            System.out.println(count);
            
            if(count >0) {
                double average = (double) sum/ count;
                System.out.println(average);
            }
            scanner.close();
        }

    
}
