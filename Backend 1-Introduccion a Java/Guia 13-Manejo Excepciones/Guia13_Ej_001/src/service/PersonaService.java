package service;

import entity.Persona;

public class PersonaService {
    private Persona persona;

    public PersonaService(Persona persona) {
        this.persona = persona;
    }

    public PersonaService(){
        persona = new Persona();
    }

    public Boolean esMayorDeEdad() throws Exception {
        if (persona.getEdad() == null) {
            throw new Exception("Los valores no son válidos");
        } else if (persona.getEdad() > 18) {
            return true;
        } else {
            return false;
        }
    }
}
