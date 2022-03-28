
package Vista;
import Modelo.Coche;

public class PruebaCoche {
    public static void main(String[] args) {
                
        System.out.println("Coche 1\n");
        Coche coche1 = new Coche("Azul","Toyota","2022","VAL-203",1000,4);
        coche1.Estado();
        
        System.out.println("Coche 2\n");
        Coche coche2 = new Coche("Rojo","BMW","2005","AW-09Q",700,4);
        coche2.Estado(); 
        
        System.out.println("Coche 3\n");
        Coche coche3 = new Coche("Negro","Mazda","2020","AQZ-45ED",500,2);
        coche3.Estado(); 
    }
}
