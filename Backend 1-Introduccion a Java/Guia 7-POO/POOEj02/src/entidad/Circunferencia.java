package entidad;

public class Circunferencia {
    private Double radio;

    //constructor por defecto
    public Circunferencia(){}

    //constructor con parametros
    public Circunferencia(Double radio){
        this.radio=radio;
    }

    //getters y setters
    public void setRadio(Double radio){
        this.radio=radio;
    }

    public Double getRadio(){
        return radio;
    }


    public void crearCircunferencia(Double radio){
        this.radio=radio;
    }

    public Double calcularArea(){
        return Math.PI * radio *radio;
    }

    public Double calcularPerimetro(){
        return 2*Math.PI * radio;
    }
}
