package Cycles;

public class TestVelo {
    public static void main(String[] args) {
        Velo v1 = new Velo(15, 5);
        Velo v2 = new Velo(15);
        Velo v3 = new Velo();
        Velo v4 = new Velo(15, 5);
        System.out.println("Puissance Velo : " + v1.getPuissance(90));
        System.out.println("Puissance Velo : " + v2.getPuissance(90));  
        System.out.println("Puissance Velo : " + v3.getPuissance(90));  
        System.out.println("Puissance Velo : " + v4.getPuissance(90));  
        
       VeloElec ve1 = new VeloElec(14, 5, 20);
        System.out.println(v1);
        System.out.println(ve1);
        
        System.out.println("Puissance VeloElec : " + ve1.getPuissance(90));
    }
}

