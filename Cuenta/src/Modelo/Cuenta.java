package Modelo;

public class Cuenta {
    
    private int noCuenta;
    private String nombreCliente;
    double saldo;
    
    public Cuenta(){
        
        this.noCuenta = 0;
        this.nombreCliente = "";
        this.saldo = 0;
    }
    
    public void setnoCuenta(int cuenta){this.noCuenta = cuenta;}
    public void setNombreCliente(String cliente){this.nombreCliente = cliente;}
    public void setSaldo(double saldo){this.saldo = saldo;}
    
    public int getnoCuenta(){return this.noCuenta;}
    public String getNombreCliente(){return this.nombreCliente;}
    public double getSaldo(){return this.saldo;}
    
    public double consignar(double monto){
        
        double saldoTotal = this.saldo+monto;
        
        return saldoTotal;
    }
    public double retirar(double monto){
        
        double saldoTotal = this.saldo-monto;
        return saldoTotal;
    }  
}
