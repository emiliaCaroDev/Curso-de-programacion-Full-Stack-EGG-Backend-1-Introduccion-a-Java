import entidad.Alumno;
import servicio.AlumnoServicio;

import java.util.*;

/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
*/
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>();

        AlumnoServicio alumnoServicio = new AlumnoServicio();
        listaAlumnos = alumnoServicio.crearAlumno();


        System.out.println("\nIngrese un nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("\nLa nota final del alumno "+ nombre + " es: "+alumnoServicio.notaFinal(listaAlumnos,nombre));

        alumnoServicio.mostrarDatosAlumnos(listaAlumnos);

    }
}