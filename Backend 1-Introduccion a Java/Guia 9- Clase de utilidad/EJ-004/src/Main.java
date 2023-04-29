import servicio.FechaServicio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FechaServicio fechaServicio = new FechaServicio();
        LocalDate fechaNac = fechaServicio.getFechaNacimiento();
        System.out.println("\nFecha nacimiento: "+fechaNac.toString());
        LocalDate fechaActual = fechaServicio.fechaActual();
        System.out.println("\nFecha actual: "+fechaActual);
        System.out.println("\nDiferencia de años entre la fecha Actual y la fecha de nacimiento del usuario es: "+fechaServicio.diferencia(fechaNac,fechaActual) +" años.");
    }
}