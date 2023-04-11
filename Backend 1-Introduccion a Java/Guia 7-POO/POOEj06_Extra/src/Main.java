public class Main {
    public static void main(String[] args) {
        /*
        6_Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
        método "calcular_area" que calcule y devuelva el área del rectángulo.
        Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
        de 4 y 6 y imprime el área del rectángulo.
        */

        Rectangulo rectangulo1 = new Rectangulo(4,6);
        System.out.println(rectangulo1.toString());
        System.out.println("\nEl area del rectangulo es: "+rectangulo1.calcularArea());
    }
}