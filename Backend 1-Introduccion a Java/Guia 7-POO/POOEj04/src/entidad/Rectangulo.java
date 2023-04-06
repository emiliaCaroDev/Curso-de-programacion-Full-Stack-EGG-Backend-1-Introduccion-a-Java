package entidad;

public class Rectangulo {
    private Double base;
    private Double altura;

    public Rectangulo(){}

    public Rectangulo(Double base,Double altura){
        this.base=base;
        this.altura=altura;
    }

    //getters y setters
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }


    public Rectangulo crearRectangulo(Double base,Double altura){
        Rectangulo  newRectangulo= new Rectangulo(base,altura);
        return  newRectangulo;
    }

    public Double calcularSuperficie(){
        return this.getBase() * this.getAltura();
    }

    public Double calcularPerimetro(){
        return (getBase() + getAltura())*2;
    }

    //FALTA
    /*public void dibujarRectangulo(){
        System.out.println();
    }*/

}

