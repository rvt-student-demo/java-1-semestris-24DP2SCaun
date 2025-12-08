package rvt;

public class atributu_masinas2 {
    
    int attalums = 250;
    String krasa = "zila"; // atributi
    String modelis = "BMW";
    int degviela = 10;
    int degvielas_patere = 5;
    
    
    public void brauc(int attalums){
        degviela = attalums - (attalums * degvielas_patere / 55);
        System.out.println("Masina nobrauca " + attalums + "km un piepildija " + degviela + " litrus degvielas" );
    }
    
    public void piepildas(){  
        degviela = degviela + 55; //metodes
        System.out.println("Masina piepilda " + degviela + " litrus egvielas");
    }
    
    public void parada_info(){
        System.out.println("Masina norauca : " + attalums + "km. Masinas krasa ir; " + krasa + ". Masinas modelis ir: " + modelis);
    }
    
    
    public static void main(String[] args) {
      Masinas2 Opel = new Masinas2(); //1. objekts
      Masinas2 BMW = new Masinas2(); //2. objekts
      Masinas2 Audi = new Masinas2(); //3. objekts
      
      Opel.brauc(250);
      Audi.piepildas();
      BMW.parada_info();
    }
}
