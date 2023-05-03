import entidad.Curso;
import servicio.CursoServicio;

public class Main {
    public static void main(String[] args) {

        CursoServicio cursoServicio =  new CursoServicio();
        Curso curso = new Curso();
        curso = cursoServicio.crearCurso(curso);
        System.out.println(cursoServicio.mostrarDatos(curso));
        System.out.println("\nCalcular Ganancias: $ "+cursoServicio.calcularGananciaSemanal(curso));

    }
}