import entidad.Cadena;
import servicio.CadenaServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CadenaServicio cadenaServicio = new CadenaServicio();
        Cadena cadena = cadenaServicio.crearCadena();
        Scanner teclado = new Scanner(System.in);



        System.out.println("\nCantidad de vocales en la frase: " + cadenaServicio.mostrarVocales(cadena));
        System.out.println("\nFrase invertida: " + cadenaServicio.invertirFrase(cadena));

        System.out.println("\nIngrese una frase");
        String frase = teclado.nextLine();

        System.out.println("\nIngrese una letra: ");
        String letra = teclado.nextLine();

        System.out.println("\nCantidad de veces que se repite la letra '"+ letra+"' es: "+cadenaServicio.vecesRepetido(letra,cadena));
        cadenaServicio.compararLongitud(frase,cadena);

        System.out.println("\nFrase resultante de unir : '"+cadena.getFrase()+"' con '"+ frase+"' es: "+cadenaServicio.unirFrases(frase,cadena));

        System.out.println("\nIngrese un letra para reemplazar en la frase '"+cadena.getFrase()+"'");
        String letraAReemplazar = teclado.nextLine();
        System.out.println("\nLa frase resultante al reemplazar todas las letras 'a' por la letra '"+ letraAReemplazar +"' es: " +cadenaServicio.reemplazar(letraAReemplazar,cadena));

        System.out.println("\nIngrese una letra para comprobar si la frase la contiene: ");
        String letraComprobar = teclado.nextLine();
        System.out.println("\nLa letra '"+letraComprobar+"' se encuentra en la frase : '"+cadena.getFrase()+"' es: "+cadenaServicio.contiene(letraComprobar,cadena));
    }
}