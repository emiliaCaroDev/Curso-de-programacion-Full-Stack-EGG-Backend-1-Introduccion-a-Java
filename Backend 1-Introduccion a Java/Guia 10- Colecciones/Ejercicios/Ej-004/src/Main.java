import entidad.Pelicula;
import servicio.PeliculaServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PeliculaServicio peliculaServicio = new PeliculaServicio();
        peliculaServicio.agregarPeliculas();

        System.out.println("\nPeliculas");
        peliculaServicio.mostrarTodasPeliculas();

        System.out.println("\nPeliculas con duracion mayor a una hora");
        System.out.println("\n"+peliculaServicio.mostrarPeliculasDuracionMayorUnaHora());

        System.out.println("\nPeliculas Ordenadas por duracion (mayor - menor)");
        peliculaServicio.mostrarPeliculasOrdenadasDuracion();

        //System.out.println("\nPeliculas Ordenadas por titulo");
        //peliculaServicio.mostrarPeliculasOrdenadasTitulo();


    }
}