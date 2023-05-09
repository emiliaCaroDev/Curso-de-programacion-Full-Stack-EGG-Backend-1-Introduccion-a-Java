package servicio;

import entidad.Alumno;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {
    Scanner teclado = new Scanner(System.in);

    public List<Alumno> crearAlumno(){
        List<Alumno> listaAlumno = new ArrayList<>();
        Character respuesta = ' ';
        do{
            Alumno alumno = new Alumno();
            System.out.println("\nIngrese nombre del alumno: ");
            String nombre = teclado.nextLine();
            alumno.setNombre(nombre);

            for(int i=0;i<3;i++){
                System.out.println("\nIngrese una nota: ");
                Integer nota = Integer.parseInt(teclado.nextLine());
                alumno.getNotas().add(nota);
            }
            System.out.println("\n¿Desea agregar otro alumno? ");
            respuesta = teclado.nextLine().toLowerCase().charAt(0);
            listaAlumno.add(alumno);
        }while(respuesta!='n');
        return listaAlumno;
    }



    public Double notaFinal(List<Alumno> listaAlumnos ,String nombre){
        Integer suma = 0;
        if(listaAlumnos.contains(nombre)){
            Iterator<Alumno> iter = listaAlumnos.iterator();
            while(iter.hasNext()){
                Alumno a = iter.next();
                if(a.getNombre().equalsIgnoreCase(nombre)){
                    Iterator<Integer> iter2 = a.getNotas().iterator();
                    while (iter2.hasNext()){
                        Integer nota = iter2.next();
                        suma += nota;
                    }
                }
            }
        }
        else{
            System.out.println("\nNo se encuentra ningun alumno llamado "+ nombre);
        }

        return (double) suma/listaAlumnos.size();
    }

    public void mostrarDatosAlumnos(List<Alumno> listAlumno){
        Iterator<Alumno> iter = listAlumno.iterator();
        while(iter.hasNext()) {
            Alumno a = iter.next();
            System.out.println(a.toString());
        }
    }
}

