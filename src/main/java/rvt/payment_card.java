package rvt;

public class payment_card {
    
    private double balance;

    private static final double Affordably = 2.60;
    private static final double Heartily = 4.60;
    private static final double max_balans = 150.0;

    public maksajumaKarte(double sakumBalanss) {
        this.balance = sakumBalanss;
    }

    public String toString() {
        
        return "Kartei ir " + this.balance + " eiro balanss";
    }
    public void eatAffordably() {
       if (this.balance >= Affordably) {
           this.balance -= Affordably;
       }
    }
    
    public void eatHeartily() {
        if (this.balance >= Heartily) {
            this.balance -= Heartily;
        }
    }

    public void addMoney(double amount) {

        if (amount < 0) {
            return; 
        }

        this.balance += amount;

        if (this.balance > max_balans) {
            this.balance = max_balans;
        }
    }

    public static class Galvena_programma {
        
        public static void main(String[] args) {

            PaymentCard paulsCard = new PaymentCard(20);
            PaymentCard mattsCard = new PaymentCard(30);
            
            paulsCard.eatHeartily();
            
            mattsCard.eatAffordably();
            
            System.out.println("Paul: " + paulsCard);
            System.out.println("Matt: " + mattsCard);
            
            paulsCard.addMoney(20);
            
            mattsCard.eatHeartily();
            
            System.out.println("Paul: " + paulsCard);
            System.out.println("Matt: " + mattsCard);
            
            paulsCard.eatAffordably();
            
            paulsCard.eatAffordably();
            
            mattsCard.addMoney(50);
            
            System.out.println("Paul: " + paulsCard);
            System.out.println("Matt: " + mattsCard);


        }
    }
}