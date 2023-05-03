package servicio;

import entidad.Curso;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CursoServicio {

    Scanner teclado = new Scanner(System.in);

    public Curso crearCurso(Curso curso){
        System.out.println("\nIngrese nombre del curso: ");
        String nombreCurso = teclado.nextLine();
        curso.setNombreCurso(nombreCurso);

        System.out.println("\nIngrese cantidad de horas por dia: ");
        Integer cantHorasPorDia = Integer.parseInt(teclado.nextLine());
        curso.setCantHorasPorDia(cantHorasPorDia);

        System.out.println("\nIgrese la cantidad de dias por semana: ");
        Integer cantDiasPorSemana = Integer.parseInt(teclado.nextLine());
        curso.setCantDiasPorSemana(cantDiasPorSemana);

        System.out.println("\nIngrese el turno: Mañana - Tarde ");
        String turno = teclado.nextLine();
        curso.setTurno(turno);

        System.out.println("\nIngrese precio por hora: ");
        Double precioPorHora = Double.parseDouble(teclado.nextLine());
        curso.setPrecioPorHora(precioPorHora);

        cargarAlumnos(curso);

        return curso;
    }

    public void cargarAlumnos(Curso curso){
        for(int i=0;i<5;i++){
            System.out.println("\nIngrese nombre del alumno: ");
            String nombre = teclado.nextLine();
            curso.getAlumnos().add(nombre);
        }
    }

    public String mostrarDatos(Curso curso){
        return "\n"+curso.toString();
    }

    public Double calcularGananciaSemanal(Curso curso){
        return curso.getCantHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().size()* curso.getCantDiasPorSemana();
    }
}
