import entidad.Rectangulo;

public class Main {
    public static void main(String[] args) {

        /*
        Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
        base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
        con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
        superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos
        un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
        los métodos getters, setters y constructores correspondientes.
        Superficie = base * altura / Perímetro = (base + altura) * 2.
        */

        Rectangulo miRectangulo = new Rectangulo();
        miRectangulo=miRectangulo.crearRectangulo(3.0,4.0);
        System.out.println("\nLa superficie del rectangulo es: "+miRectangulo.calcularSuperficie());
        System.out.println("\nEl perimetro del rectangulo es: "+miRectangulo.calcularPerimetro());

    }
}