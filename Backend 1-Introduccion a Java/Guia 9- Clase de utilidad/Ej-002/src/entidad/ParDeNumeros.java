package entidad;

public class ParDeNumeros {
    private Double num1;
    private Double num2;

    public ParDeNumeros(){
        this.num1= Math.floor(Math.random()*((10 - 1)+1)+1);
        this.num2= Math.floor(Math.random()*((10 - 1)+1)+1);
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
