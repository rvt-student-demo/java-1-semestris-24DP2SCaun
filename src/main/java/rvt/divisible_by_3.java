package rvt;


public class divisible_by_3 {
    public class DivisibleByThree {

    public static void divisibleByThreeInRange(int beginning, int end){
        while(beginning <= end){
            if(beginning % 3 == 0){
                System.out.println(beginning);
            } else {
                beginning++;
                continue;
            }
            beginning += 3;
        }
    } 
}
}