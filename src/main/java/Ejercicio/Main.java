package Ejercicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Main escrito por Gemini
 */
public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // --- CARGA DE DATOS (10 Operarios, 2 Marketing, 3 Vendedores) ---
        // Operarios: (area, puesto, horas, nombre, apellido, fecha, tel, dir, mail)
        empleados.add(new Operario("Producción", "Soldador", 160, "Juan", "Gomez", new Date(), "4411", "Calle 1", "juan@meg.com"));
        empleados.add(new Operario("Producción", "Pintor", 170, "Ana", "Rodriguez", new Date(), "4412", "Calle 2", "ana@meg.com"));
        empleados.add(new Operario("Depósito", "Sampa", 150, "Pedro", "Sosa", new Date(), "4413", "Calle 3", "pedro@meg.com"));
        empleados.add(new Operario("Producción", "Armado", 160, "Lucía", "Fernandez", new Date(), "4414", "Calle 4", "lucia@meg.com"));
        empleados.add(new Operario("Logística", "Chofer", 180, "Hugo", "Martinez", new Date(), "4415", "Calle 5", "hugo@meg.com"));
        empleados.add(new Operario("Producción", "Control", 160, "Clara", "Lopez", new Date(), "4416", "Calle 6", "clara@meg.com"));
        empleados.add(new Operario("Mantenimiento", "Técnico", 155, "Marcos", "Diaz", new Date(), "4417", "Calle 7", "marcos@meg.com"));
        empleados.add(new Operario("Producción", "Líder", 160, "Sofia", "Perez", new Date(), "4418", "Calle 8", "sofia@meg.com"));
        empleados.add(new Operario("Depósito", "Carga", 145, "Jorge", "Ruiz", new Date(), "4419", "Calle 9", "jorge@meg.com"));
        empleados.add(new Operario("Producción", "Ensamble", 160, "Elena", "García", new Date(), "4420", "Calle 10", "elena@meg.com"));

        // Marketing: (turno, nombre, apellido, fecha, tel, dir, mail)
        empleados.add(new Marketing(Turnos.TURNO_MANANA, "Jesús", "Quevedo", new Date(), "5511", "Av. 123", "jesus@meg.com"));
        empleados.add(new Marketing(Turnos.TURNO_TARDE, "Julian", "Piquero", new Date(), "5522", "Calle 456", "julian@meg.com"));

        // Vendedores: (medio, totalVentas, nombre, apellido, fecha, tel, dir, mail)
        empleados.add(new Vendedor("Presencial", 2500000, "Federico", "Torres", new Date(), "7711", "Centro", "fede@meg.com"));
        empleados.add(new Vendedor("Web", 4800000, "Sofia", "Blanco", new Date(), "7722", "Online", "sofia@meg.com"));
        empleados.add(new Vendedor("Telefónico", 1200000, "Roberto", "Vaca", new Date(), "7733", "Call Center", "roberto@meg.com"));

        // --- SALIDA POR CONSOLA ---
        System.out.println("=================================================================================");
        System.out.println("SISTEMA DE LIQUIDACIÓN MEG INSUMOS S.A.");
        System.out.println("=================================================================================");
        System.out.printf("%-10s | %-18s | %-12s | %-12s | %-12s%n", "LEGAJO", "NOMBRE", "BRUTO", "DESCUENTO", "NETO");
        System.out.println("---------------------------------------------------------------------------------");

        
        // esta parte fuimos nosotros porque la hizo horrible 
        
        for (Empleado e : empleados) {
            double bruto = e.calcularSueldoBruto();
            double descuento = e.calcularDescuento();
            double neto = e.calcularSueldoNeto();

            e.mostrarEmpleado();
            System.out.println("Sueldo Bruto:" + e.calcularSueldoBruto());
            System.out.println("Total de aportes:" + e.calcularDescuento());
            System.out.println("Sueldo Neto:" + e.calcularSueldoNeto());
        }
    }
}
