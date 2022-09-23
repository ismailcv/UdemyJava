package OopStarting;

public class Test {
    public static void main(String[] args) {
         Car araba1 = new Car();
        
        araba1.renk = "Kırmızı";
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";
        
        System.out.println(araba1.motor);
    }   
}
