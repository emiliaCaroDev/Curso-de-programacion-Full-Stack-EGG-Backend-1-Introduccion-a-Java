public class Main {
    public static void main(String[] args) {
        /*
        2. Definir una clase llamada Puntos que contendrá las coordenadas de dos
        puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
        Generar un objeto puntos usando un método crearPuntos() que le pide al
        usuario los dos números y los ingresa en los atributos del objeto.
        Después, a través de otro método calcular y devolver la distancia que
        existe entre los dos puntos que existen en la clase Puntos. Para conocer
        como calcular la distancia entre dos puntos consulte el siguiente link:
        */

        //(-3,0)  (-4,6) Rta: sqrt(37) =

       Puntos puntos = new Puntos();
       puntos.crearPuntos();
       System.out.println("\nLa distancia de los puntos "+puntos.toString() +"\nes: "+puntos.calcularDistancia());


    }
}