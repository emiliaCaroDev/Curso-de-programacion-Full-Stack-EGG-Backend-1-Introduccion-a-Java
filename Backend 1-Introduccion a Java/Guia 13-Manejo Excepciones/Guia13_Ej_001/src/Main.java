import entity.Persona;
import entity.Sexo;
import service.PersonaService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona p = new Persona("Mariel",17, Sexo.M,32.5,1.54);
        //System.out.println(p.toString());

        PersonaService personaService = new PersonaService();
        try{
            System.out.println("\n¿Es mayor de edad ? "+personaService.esMayorDeEdad());
        }
        catch(Exception ex){
            System.err.println("No son valores validos para la edad de una persona");
        }

    }
}