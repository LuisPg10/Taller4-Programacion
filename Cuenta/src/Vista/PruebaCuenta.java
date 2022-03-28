package Vista;

import java.util.Scanner;
import Modelo.Cuenta;

public class PruebaCuenta {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        Cuenta count = new Cuenta();
        
        double monto;
        int num_cuenta;
        String nombre;
        
        System.out.print("Digite el numero de la cuenta: ");
        num_cuenta = sc.nextInt();
        
        System.out.print("Digite el nombre del usuario de la cuenta: ");
        nombre = sc.next();
        
        count.setSaldo(Math.random()*15000001);
        System.out.printf("\nSu saldo total en cuenta es %.2f\n",count.getSaldo());
        
        count.setnoCuenta(num_cuenta);
        count.setNombreCliente(nombre);
        
        char decision;
        System.out.print("\n¿Desea retitar o consignar [C/r] ");
        decision = Character.toUpperCase(sc.next().charAt(0));
        
        if(decision == 'C'){
            System.out.print("¿Cuanto dinero desea consignar? ");
            monto = sc.nextDouble();
            
            System.out.printf("\nEl total de dinero en cuenta es de %.2f\n",
                    count.consignar(monto));  
        }
        else{
            System.out.print("¿Cuanto dinero desea retirar? ");
            monto = sc.nextDouble();
            
            System.out.printf("\nEl total de dinero en cuenta es de %.2f\n",
                    count.retirar(monto));
        }
    }
}