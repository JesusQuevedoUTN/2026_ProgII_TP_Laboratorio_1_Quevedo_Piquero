package Ejercicio;

import java.util.Date;

public abstract class Empleado {

    private static int nroDeLegajo = 1;
    
    protected final double jubilacion       = 0.11;
    protected final double pami             = 0.03;
    protected final double obraSocial       = 0.03;
    protected final double cuotaSindical    = 0.02;
    
    private int     legajo;
    private String  nombre;
    private String  apellido;
    private Date    fechaDeNacimiento;
    private String  telefono;
    private String  direccion;
    private String  mail;

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

    abstract double calcularSueldoBruto();

    public double calcularDescuento() {
        return 0;
    }

    public double calcularSueldoNeto() {
        return 0;
    }
}
