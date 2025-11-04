package rvt;

import java.util.Scanner;

public class statistics {
    public static void main(String[] args) {
        
        Statistics allNumbers = new Statistics(); 
        Statistics evenNumbers = new Statistics(); 
        Statistics oddNumbers = new Statistics();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitļus: ");
        
        while (true) {
            try {
                int number = Integer.valueOf(scanner.nextLine());
                
                if (number == -1) {
                    break;
            }
            
            allNumbers.addNumber(number); 
            
            if (number % 2 == 0) { 
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number); 
            }
        } 
        } 
        
        System.out.println("Summa: " + allNumbers.sum());
        System.out.println("Pāra skaitļu summa: " + evenNumbers.sum()); 
        System.out.println("Nepāra skaitļu summa: " + oddNumbers.sum());

    }
    Statistics iepirkumi = new Statistics();
        iepirkumi.addNumber(5);    
        iepirkumi.addNumber(12);   
        iepirkumi.addNumber(35);  
        iepirkumi.addNumber(2);    
        iepirkumi.addNumber(18);   
        
        System.out.println("iepirkumu statistika "); 
        System.out.println("Iepirkumu skaits: " + iepirkumi.getCount()); 
        System.out.println("Kopējā izdevumu summa: " + iepirkumi.sum() + " EUR"); 
        System.out.println("Vidējā izdevumu summa: " + iepirkumi.average() + " EUR"); 

        
        Statistics atzimes = new Statistics(); 
        atzimes.addNumber(7);
        atzimes.addNumber(9);
        atzimes.addNumber(8);
        atzimes.addNumber(6);
        atzimes.addNumber(10);
        
        System.out.println("atzīmju statistika ");
        System.out.println("Atzīmju skaits: " + atzimes.getCount());
        System.out.println("Kopējā atzīmju summa: " + atzimes.sum());
        System.out.println("Vidējā atzīme: " + atzimes.average());
    }


class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }


    public void addNumber(int number) {
        this.count++; 
        this.sum += number;
    }

   
    public int getCount() {
        return this.count; 
    }
}

public int sum() {
        return this.sum;
    }

    
    public double average() {
        if (this.count == 0) {
            return 0.0;
        }
        
        return (double) this.sum / this.count;
    }


