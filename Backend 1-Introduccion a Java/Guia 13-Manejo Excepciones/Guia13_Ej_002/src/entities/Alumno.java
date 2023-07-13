package entities;

import java.util.*;

public class Alumno {
    private String nombre;
    private Integer[] notas;

    public Alumno() {
    }

    public Alumno(String nombre) {
            this.nombre = nombre;
            this.notas = new Integer[3];
        }

        //getters y setters

        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public void addNota(){
            Scanner teclado = new Scanner(System.in);

            for(int i=0;i<notas.length+1;i++){
                if(i==notas.length){
                    throw new ArrayIndexOutOfBoundsException("fuera de rango del array");
                }
                else{
                    System.out.println("Ingrese una nota");
                    Integer nota = Integer.parseInt(teclado.nextLine());
                    notas[i]=nota;
                }


            }
        }

        public String toString () {
        return "\nAlumno = { Nombre = " + nombre + "}";
    }
}
