import entidad.Libro;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas,
        y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para
        cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título,
        el autor del libro y el número de páginas.

        */
        Libro libro1 = new Libro();
        System.out.println("\nIngrese el ISBN");
        String ISBN = teclado.nextLine();
        System.out.println("\nIngrese el titulo del libro");
        String titulo = teclado.nextLine();
        System.out.println("\nIngrese el autor del libro");
        String autor = teclado.nextLine();
        System.out.println("\nIngrese el numero de paginas del libro");
        Integer numPaginas = teclado.nextInt();
        libro1 = cargarLibro(ISBN,titulo,autor,numPaginas);
        mostrarLibro(libro1);
    }
    public static Libro cargarLibro(String ISBN, String titulo,String autor, Integer numPaginas){
        Libro newLibro = new Libro(ISBN,titulo,autor,numPaginas);
        return newLibro;
    }

    public static void mostrarLibro(Libro libro){
        System.out.println(""+libro.toString());
    }
}