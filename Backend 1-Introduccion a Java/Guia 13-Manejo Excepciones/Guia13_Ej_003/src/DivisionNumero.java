public class DivisionNumero {

    private Integer num1;
    private Integer num2;

    public DivisionNumero(){}

    public DivisionNumero(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //getters y setters

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Double calcularDivision(){
        return (double) num1/num2;
    }

    public String toString(){
        return "\nDivision Numero { Numero 1 = "+num1+", Numero 2 = "+num2+" }";
    }

}
