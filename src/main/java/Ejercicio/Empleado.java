package Ejercicio;

import java.util.Date;

public abstract class Empleado {

    private int legajo;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String telefono;
    private String direccion;
    private String mail;

    public double calcularSueldoBruto() {
        return 0;
    }

    public double calcularDescuento() {
        return 0;
    }

    public double calcularSueldoNeto() {
        return 0;
    }
}
