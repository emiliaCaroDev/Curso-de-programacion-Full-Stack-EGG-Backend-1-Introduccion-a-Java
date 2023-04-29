import entidad.Persona;
import servicio.PersonaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        PersonaService personaService = new PersonaService();
        Persona persona = personaService.crearPersona();
        System.out.println("\nLa edad de "+ persona.getNombre()+" es: "+personaService.calcularEdad(persona)+" años.");
        System.out.println("\nIngrese una edad: ");
        Integer edad = teclado.nextInt();
        System.out.println("\n "+persona.getNombre()+" tiene menos de "+ edad+" años? "+ personaService.menorQue(persona,edad));
        System.out.println("\n"+personaService.mostrarPersona(persona));
    }
}