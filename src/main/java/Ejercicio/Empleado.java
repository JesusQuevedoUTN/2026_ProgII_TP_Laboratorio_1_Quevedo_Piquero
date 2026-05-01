package Ejercicio;

import java.util.Date;

public abstract class Empleado {

    private static int nroDeLegajo = 1;

    protected final double JUBILACION = 0.11;
    protected final double PAMI = 0.03;
    protected final double OBRA_SOCIAL = 0.03;
    protected final double CUOTA_SINDICAL = 0.02;

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

    abstract double calcularSueldoBruto();

    public double calcularDescuento() {
        return calcularSueldoBruto() * (JUBILACION + PAMI + OBRA_SOCIAL + CUOTA_SINDICAL);
    }

    public double calcularSueldoNeto() {
        return calcularSueldoBruto() - calcularDescuento();
    }

    public void mostrarEmpleado() {
        System.out.println("Empleado= " + legajo);
        System.out.println("Nombre= " + nombre + " " + apellido);
        System.out.println("Fecha de nacimiento= " + fechaDeNacimiento);
        System.out.println("Telefono= " + telefono);
        System.out.println("Direccion= " + direccion);
        System.out.println("Mail= " + mail);
    }

}
