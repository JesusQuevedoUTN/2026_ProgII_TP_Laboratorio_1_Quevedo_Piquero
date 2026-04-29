package Ejercicio;


public class Vendedor extends Empleado {

        private String medioVenta;
        private double totalVentasMes; 
        private double sueldoBase = 30000.0;
        private double comision = 0.002;
    
    @Override
    public double calcularSueldoBruto() {
        return 0;
    }
}
