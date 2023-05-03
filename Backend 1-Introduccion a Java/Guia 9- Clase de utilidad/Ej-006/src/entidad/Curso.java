package entidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Curso {
   private String nombreCurso;
   private Integer cantHorasPorDia;
   private Integer cantDiasPorSemana;
   private String turno;
   private Double precioPorHora;
   private List<String> alumnos;

   public Curso(){
       this.alumnos = new ArrayList<>();
   }

    public Curso(String nombreCurso, Integer cantHorasPorDia, Integer cantDiasPorSemana, String turno, Double precioPorHora, List<String> alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantHorasPorDia = cantHorasPorDia;
        this.cantDiasPorSemana = cantDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getCantHorasPorDia() {
        return cantHorasPorDia;
    }

    public void setCantHorasPorDia(Integer cantHorasPorDia) {
        this.cantHorasPorDia = cantHorasPorDia;
    }

    public Integer getCantDiasPorSemana() {
        return cantDiasPorSemana;
    }

    public void setCantDiasPorSemana(Integer cantDiasPorSemana) {
        this.cantDiasPorSemana = cantDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(Double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public List<String> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<String> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", cantHorasPorDia=" + cantHorasPorDia +
                ", cantDiasPorSemana=" + cantDiasPorSemana +
                ", turno='" + turno + '\'' +
                ", precioPorHora=" + precioPorHora +
                ", Alumnos=" + alumnos +
                '}';
    }
}
