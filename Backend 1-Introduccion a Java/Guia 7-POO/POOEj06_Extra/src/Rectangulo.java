public class Rectangulo {

    private Integer lado1;
    private Integer lado2;


    public Rectangulo(){}

    public Rectangulo(Integer lado1,Integer lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }

    public Integer getLado1() {
        return lado1;
    }

    public void setLado1(Integer lado1) {
        this.lado1 = lado1;
    }

    public Integer getLado2() {
        return lado2;
    }

    public void setLado2(Integer lado2) {
        this.lado2 = lado2;
    }

    public String toString(){
        return "\nRectangulo: \nLado 1: "+this.getLado1()+"\nLado 2: "+this.getLado2();
    }

    public Double calcularArea(){
        return (double) getLado1() * getLado2();
    }
}
