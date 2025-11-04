package rvt;


public class print_numbers {
    public static void main(String[] args) {
        FromNumberToOne(5);
    
    }
    
    public static void FromNumberToOne(int number) {

        for(int i=number; i>0; i--)
        System.out.print(i + "");

        System.out.println();
    }

}