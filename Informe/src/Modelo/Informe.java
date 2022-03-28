package Modelo;
import java.util.Random;

public class Informe {
    
    Random aleatorio = new Random();
    private double PromVentas_A,menorVenta,mayorVenta,ventasAño;
    
    public Informe(){
        this.PromVentas_A = 0;
        this.menorVenta = 0;
        this.mayorVenta = 0;
        this.ventasAño = 0;
    }
    public void setPromVentas_A(double ventas[]){
        
        double suma = 0;
        for(int i=0;i<12;i++){
            suma += ventas[i];
        }
        this.ventasAño = suma;
        this.PromVentas_A = suma/12;
    }
    public void setMenorVenta(double ventas[]){
        
        double ventaBaja = ventas[1];
        for(int i=0;i<12;i++){
            if(ventas[i]<ventaBaja){
                ventaBaja = ventas[i];
            }
        }
        this.menorVenta = ventaBaja;
    }
    public void setMayorVenta(double ventas[]){
        
        double ventaAlta = ventas[1];
        for(int i=0;i<12;i++){
            if(ventas[i]>ventaAlta){
                ventaAlta = ventas[i];
            }
        }
        this.mayorVenta = ventaAlta;
    }
    
    public double getPromVentas_A(){return this.PromVentas_A;}
    public double getMenorVenta(){return this.menorVenta;}
    public double getMayorVenta(){return this.mayorVenta;}
    public double getVentasaño(){return this.ventasAño;}
    
    public void getVentas(double ventas[]){
        for(double i:ventas){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
