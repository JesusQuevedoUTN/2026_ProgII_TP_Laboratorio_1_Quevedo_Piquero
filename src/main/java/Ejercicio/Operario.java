package Ejercicio;

import java.util.Date;

public class Operario extends Empleado {

    private String area;
    private String puesto;
    private int horasTrabajadas;
    private double valorPorHora = 120.0;

    public Operario(String area, String puesto, int horasTrabajadas, 
                    String nombre, String apellido, Date fechaDeNacimiento, 
                    String telefono, String direccion, String mail) {
        
        super(nombre, apellido, fechaDeNacimiento, telefono, direccion, mail);
        this.area = area;
        this.puesto = puesto;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldoBruto() {
        return 0;
    }
}
