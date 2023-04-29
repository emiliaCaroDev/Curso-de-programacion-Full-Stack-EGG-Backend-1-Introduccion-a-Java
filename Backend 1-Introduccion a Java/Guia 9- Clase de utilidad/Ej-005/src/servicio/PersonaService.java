package servicio;

import entidad.Persona;

import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PersonaService {

    public Persona crearPersona(){
        Persona persona = new Persona();

        Scanner teclado = new Scanner(System.in);
        System.out.println("\nIngrese el nombre: ");
        persona.setNombre(teclado.nextLine());
        System.out.println("\nIngrese el dia de nacimiento: ");
        Integer dia = Integer.parseInt(teclado.nextLine());
        System.out.println("\nIngrese el mes de nacimiento: ");
        Integer mes = Integer.parseInt(teclado.nextLine());
        System.out.println("\nIngrese el año de nacimiento: ");
        Integer anio = Integer.parseInt(teclado.nextLine());
        LocalDate fechNac = LocalDate.of(anio,mes,dia);
        persona.setFechaNacimiento(fechNac);
        return persona;
    }

    public Integer calcularEdad(Persona persona){
        Period p = Period.between(persona.getFechaNacimiento(),LocalDate.now());
        return p.getYears();
    }

    public Boolean menorQue(Persona persona, Integer edad){
        Boolean result = false;
        if(calcularEdad(persona) < edad){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

    public String mostrarPersona(Persona persona){
        return persona.toString();
    }
}
