package Ejercicio;

import java.util.Date;

public abstract class Empleado {

    private static int nroDeLegajo = 1;
    
    private int legajo;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String telefono;
    private String direccion;
    private String mail;

    public Empleado(String nombre, String apellido, Date fechaDeNacimiento,
                    String telefono, String direccion, String mail) {
        this.legajo = nroDeLegajo;
        nroDeLegajo++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mail = mail;
    }

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
