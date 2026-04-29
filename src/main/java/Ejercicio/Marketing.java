package Ejercicio;

import java.util.Date;

public class Marketing extends Empleado {

    private Turnos horario;
    private double sueldoFijo = 50000.0;

    public Marketing(Turnos horario, String nombre, String apellido, 
                    Date fechaDeNacimiento, String telefono, 
                    String direccion, String mail) {
        super(nombre, apellido, fechaDeNacimiento, telefono, direccion, mail);
        this.horario = horario;
    }
    
    
    
    @Override
    public double calcularSueldoBruto() {
        return 0;
    }
}
