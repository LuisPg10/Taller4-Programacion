package Modelo;

public class TrianguloIsosceles {
    
    private double base,altura;
    
    public TrianguloIsosceles(){
        this.base = 0;
        this.altura = 0;
    }
    
    public void setBase(double base){this.base = base;}
    public void setAltura(double altura){this.altura = altura;}
    
    public double getBase(){return this.base;}
    public double getAltura(){return this.altura;}
    
    public double area(){
        
        double area = (this.base*this.altura)/2;
        return area;
    }
    public double longitudLados(){
        
        double adyacente,opuesto;
        
        adyacente = Math.pow(this.base/2,2);
        opuesto = Math.pow(this.altura,2);
        
        double lados = Math.sqrt(opuesto+adyacente);
        return lados;
    }
    public double perimetro(){
        
        double perimetro = longitudLados()*2 + this.base;
        return perimetro;
    }
    public double angulo(){
        
        double angulo = Math.asin(this.altura/longitudLados());
        return Math.toDegrees(angulo);
    }
    public double angulo2(){
        
        double angulo2 = 180 - angulo()*2;
        return angulo2;
    }
}