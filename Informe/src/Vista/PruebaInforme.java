package Vista;
import Modelo.Informe;
public class PruebaInforme {
    public static void main(String[] args) {
        
        
        double ventas[] = {15984.12,5678.2,67895.34,15000,4567.3,123900,45213.3,
        567890,20459,678990,12476,456789.12};
        
        Informe informe = new Informe();
        System.out.println("Informe de ventas del año\n");
        
        informe.getVentas(ventas);
        
        informe.setPromVentas_A(ventas);
        informe.setMenorVenta(ventas);
        informe.setMayorVenta(ventas);
        
        System.out.printf("\nEl promedio de ventas en el año es de %.2f\n",informe.getPromVentas_A());
        System.out.printf("El número más bajo de ventas es de %.2f\n",informe.getMenorVenta());
        System.out.printf("El número más alto de ventas es de %.2f\n",informe.getMayorVenta());
        System.out.printf("El acumulado de las ventas este año fue de %.2f\n\n",informe.getVentasaño());   
    }
}
