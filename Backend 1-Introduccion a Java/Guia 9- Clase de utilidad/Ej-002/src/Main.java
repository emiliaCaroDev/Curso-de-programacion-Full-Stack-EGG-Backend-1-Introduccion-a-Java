import entidad.ParDeNumeros;
import servicio.ParDeNumerosServicio;

public class Main {
    public static void main(String[] args) {

        ParDeNumerosServicio parDeNumerosServicio = new ParDeNumerosServicio();
        ParDeNumeros parDeNumeros = parDeNumerosServicio.crearParDeNumeros();
        System.out.println(parDeNumerosServicio.mostrarValores(parDeNumeros));
        System.out.println("\nEl mayor es: "+parDeNumerosServicio.devolverMayor(parDeNumeros));
        System.out.println("\nLa potencia es: "+parDeNumerosServicio.calcularPotencia(parDeNumeros));
        System.out.println("\nLa raiz cuadrada del menor número es: "+parDeNumerosServicio.calcularRaiz(parDeNumeros));

    }
}