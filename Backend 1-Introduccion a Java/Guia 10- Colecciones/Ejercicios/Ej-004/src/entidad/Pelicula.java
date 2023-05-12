package entidad;

import java.sql.Time;
import java.time.LocalTime;

public class Pelicula implements Comparable<Pelicula> {

    private String titulo;
    private String director;
    private LocalTime duracion;

    public Pelicula(){}

    public Pelicula(String titulo, String director, LocalTime duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Titulo = '" + titulo + '\'' +
                ", Director = '" + director + '\'' +
                ", Duracion = " + duracion +
                '}';
    }


    @Override
    public int compareTo(Pelicula pelicula) {

        return pelicula.getDuracion().compareTo(this.getDuracion());
    }

}
