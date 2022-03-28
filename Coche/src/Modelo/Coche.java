
package Modelo;

public class Coche {
    String color,marca,modelo,matricula;
    int num_caballos,num_puertas;
    
    public Coche(String _color, String _marca,
            String _modelo,String _matricula, int caballos, int puertas){
        
        this.color = _color;
        this.marca = _marca;
        this.modelo = _modelo;
        this.matricula = _matricula;
        this.num_caballos = caballos;
        this.num_puertas = puertas;
    }
    
    public void Estado(){
        
        System.out.printf("Marca: %s\n"
                         + "Modelo: %s\n"
                         + "Matricula: %s\n"
                         + "Color: %s\n"
                         + "Caballos de fuerza: %d\n"
                         + "Numero de puertas: %d\n\n",marca,modelo,
                         matricula,color,num_caballos,num_puertas);    
    }
}
