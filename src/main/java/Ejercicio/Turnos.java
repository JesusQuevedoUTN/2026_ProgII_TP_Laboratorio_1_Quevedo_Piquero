package Ejercicio;

public enum Turnos {
    TURNO_MANANA(7, 15), TURNO_TARDE(13, 21);

    private int horarioEntrada;
    private int horarioSalida;

    private Turnos(int horarioEntrada, int horarioSalida) {
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
    }

}
