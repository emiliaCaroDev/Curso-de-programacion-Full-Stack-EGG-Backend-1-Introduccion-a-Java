package servicio;

import entidad.Pelicula;

import java.time.LocalTime;
import java.util.*;

public class PeliculaServicio {

    private List<Pelicula> peliculas;
    Scanner teclado = new Scanner(System.in);

    public PeliculaServicio() {
        this.peliculas = new ArrayList<>();
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }


    public Pelicula crearPelicula(Pelicula pelicula){

            System.out.println("\nIngrese titulo de la pelicula: ");
            String titulo = teclado.nextLine();
            pelicula.setTitulo(titulo);

            System.out.println("\nIngrese nombre del director: ");
            String nombreDirector = teclado.nextLine();
            pelicula.setDirector(nombreDirector);

            System.out.println("\nIngrese duracion de la pelicula (hh): ");
            Integer horas = Integer.parseInt(teclado.nextLine());


            System.out.println("\nIngrese duracion de la pelicula (mm) ");
            Integer minutos = Integer.parseInt(teclado.nextLine());

            System.out.println("\nIngrese duracion de la pelicula (ss)");
            Integer segundos = Integer.parseInt(teclado.nextLine());

            pelicula.setDuracion(LocalTime.of(horas,minutos,segundos));


        return pelicula;
    }

    public void agregarPeliculas(){
        Character resp= ' ';
        do{
            this.peliculas.add(crearPelicula(new Pelicula()));
            System.out.println("¿Desea crear otra pelicula?");
            resp = teclado.nextLine().charAt(0);
        }while(resp!='n');
    }

    public void mostrarTodasPeliculas(){
        for(Pelicula p : this.peliculas){
            System.out.println(p.toString());
        }
    }
    public List<Pelicula> mostrarPeliculasDuracionMayorUnaHora(){
        List<Pelicula> listaPeliculas = new ArrayList<>();
        for(Pelicula p: this.peliculas){
            if(p.getDuracion().getHour()>1){
                listaPeliculas.add(p);
            }
        }
        return listaPeliculas;
    }
    public void mostrarPeliculasOrdenadasDuracion(){

        this.peliculas.sort(null);

        for(Pelicula p: this.peliculas){
            System.out.println(p.toString());
        }
    }

    //FALTA
    public void mostrarPeliculasOrdenadasTitulo(){

    }



    @Override
    public String toString() {
        return "Cine{" +
                "peliculas =" + peliculas +
                '}';
    }
}
