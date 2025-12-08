package rvt;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class chapter44 {

    public static void ex1(Scanner scanner) {
        ArrayList<String> names = new ArrayList<>();

        while (true) {

            String name = scanner.nextLine();

            System.out.println("Enter your name: ");

            String fullName = scanner.nextLine().trim();

            int spaceIndex = fullName.indexOf(" ");

            if (spaceIndex > 0) {
                String firstName = fullName.substring(0, spaceIndex);
                String lastName = fullName.substring(spaceIndex + 1);

                String result = firstName + " " + lastName.toUpperCase();
                System.out.println(result);
            } else {
                System.out.println(fullName);
        
    }
}

public static void ex2(Scanner scanner) {
    
    System.out.println("Enter a string: ");
    String input = scanner.nextLine();

    System.out.println();

    for (int i = 0; i < input.length(); i++) {
        System.out.println(input.charAt(i));
        }

       
    }

   public static void ex3(Scanner scanner) {
       
    List<String> femaleNames = List.of("Amy", "Buffy", "Cathy");
    List<String> maleNames = List.of("Elroy", "Fred", "Graham");

    while (true) {

        System.out.print("Enter a name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            break;
        }

        int spaceIndex = name.indexOf(" ");
        String firstname;
        if (spaceIndex == -1) {
            firstname = name;
        } else {
            firstname = name;

            String title = "";
            if (femaleNames.contains(firstname)) {
                title = "Ms. ";
            } else if (maleNames.contains(firstname)) {
                title = "Mr. ";
            }

            System.out.println(title + name);
        }
    }
    
    public static void ex4(Scanner scanner) {
        System.out.println("Enter cook time: ");
        String digits = scanner.nextLine().trim();
        String output;

        if (digits.length() <= 2) {
            output = "0:" + digits;
        } String minutes = digits.substring(0, digits.length() - 2);
        String seconds = digits.substring(digits.length() - 2);{
            output = minutes + ":" + seconds;

        }

        System.out.println("Cook time is: " + output);
    }

    public static void ex5(Scanner scanner) {
        
        Boolena inBlockComment = false;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.isEmpty() && !inBlockComment) {
                break;
            }

            String trimmedLine = line.trim();

            if (inBlockComment) {
                System.out.println(line);
                if (trimmedLine.endsWith("*/")) {
                    inBlockComment = false;
                } else if (trimmedLine.startsWith("//")){
                        System.out.println(line);
                    } else if (trimmedLine.startsWith("/*")) {
                            inBlockComment = true;
                            System.out.println(line);
                        } else {
                            inBlockComment = false;
          
        }
}

    }
    }
}

    public static void ex6(Scanner scanner) {
        
        while (true) {

            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            boolean isenough = password.length() >= 7;
            boolean upperCase = !password.equals(password.toLowerCase());
            boolean lowerCase = !password.equals(password.toUpperCase());
            boolean digits = false;

            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    digits = true;
                    break;
                    
                }
            }

            if (isenough && upperCase && lowerCase && digits) {
                System.out.println("Acceptable password!");
                break;
            } else {
                System.out.println("Password is not acceptable!");
            }
        }
        
    }

    public static void ex7(Scanner scanner) {
        
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        int space = 0;

        while (word.length() > 0) {
            System.out.print(" ".repeat(space));

            System.out.println(word);

            if (word.length() > 1) {
                word = word.substring(1);
            } else {
                word = " ";
            }
            
            if (word.length() > 0) {
                word = word.substring(0, word.length() - 1);
            }

            space++;
        }
        
    }

    public static void main(Scanner scanner) {

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choise) {
                case 1:
                    ex1(scanner);
                    break;
                case 2:
                    ex2(scanner);
                    break;
                case 3:
                    ex3(scanner);
                    break;
                case 4:
                    ex4(scanner);
                    break;
                case 5:
                    ex5(scanner);
                    break;
                case 6:
                    ex6(scanner);
                    break;
                case 7:
                    ex7(scanner);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
} else {
            System.out.println("Please enter a valid integer choice.");
        }

        scanner.close();
    }

}

}