package servicio;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FechaServicio {

    public LocalDate getFechaNacimiento(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nIngrese dia de nacimiento: ");
        Integer dia = teclado.nextInt();
        System.out.println("\nIngrese el mes de nacimiento: ");
        Integer mes = teclado.nextInt();
        System.out.println("\nIngrese el año de nacimiento: ");
        Integer anio = teclado.nextInt();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        return fechaNacimiento;
    }

    public LocalDate fechaActual(){
        LocalDate fechaActual = LocalDate.now();
        return fechaActual;
    }

    public Integer diferencia(LocalDate fechaNac, LocalDate fechaActual){
        Period p = Period.between(fechaNac,fechaActual);
        return p.getYears();
    }
}
