package rvt;

public class atributi_masinas {
    
    int atrums = 200;
    String krasa = "melna"; // atributi
    String modelis = "Mercedes";
    
    
    public void masinaIesledz(){
        System.out.println("Masinu var ieslegt. Tas modelis ir: "+ modelis + " Krasa ir: " + krasa + " Atrums ir: " + atrums);
    }
     
    public void masinaBrauc(){
        System.out.println("Masina brauc pa celu");     //metodes
    }
    
    
    public static void main(String[] args) {
      masinas Mersedes = new masinas(); //1. objekts
      masinas BMW = new masinas(); //2. objekts
      
      Mersedes.masinaIesledz();
      BMW.masinaBrauc();
    }
}

