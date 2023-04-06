import entidad.Circunferencia;

public class Main {
    public static void main(String[] args) {

        /*
        Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
        A continuación, se deben crear los siguientes métodos:

        Método constructor que inicialice el radio pasado como parámetro.
        Métodos get y set para el atributo radio de la clase Circunferencia.
        Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
        Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
        */

        Circunferencia miCircunferencia = new Circunferencia();
        miCircunferencia.crearCircunferencia(5.0);
        System.out.println("\nEl area de la circunferencia es: "+miCircunferencia.calcularArea());
        System.out.println("\nEl perimetro de la circunferencia es: "+miCircunferencia.calcularPerimetro());
    }
}