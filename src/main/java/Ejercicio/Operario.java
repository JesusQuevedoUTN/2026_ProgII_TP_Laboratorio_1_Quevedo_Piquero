package Ejercicio;

public class Operario extends Empleado {

    private String area;
    private String puesto;
    private int horasTrabajadas;
    private double valorPorHora = 120.0;

    @Override
    public double calcularSueldoBruto() {
        return 0;
    }
}
