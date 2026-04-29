package Ejercicio;

import java.util.Date;


public class Vendedor extends Empleado {

        private String medioVenta;
        private double totalVentasMes; 
        private double sueldoBase = 30000.0;
        private double comision = 0.002;

    public Vendedor(String medioVenta, double totalVentasMes, String nombre, 
                    String apellido, Date fechaDeNacimiento, String telefono, 
                    String direccion, String mail) {
        super(nombre, apellido, fechaDeNacimiento, telefono, direccion, mail);
        this.medioVenta = medioVenta;
        this.totalVentasMes = totalVentasMes;
    }
    
        
        
    @Override
    public double calcularSueldoBruto() {
        return 0;
    }
}
