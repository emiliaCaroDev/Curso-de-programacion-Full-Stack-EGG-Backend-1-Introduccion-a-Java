package entidad;

public class Operacion {

    private Integer numero1;
    private Integer numero2;

    public Operacion(){}



    //getters y setters
    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(Integer num1,Integer num2){
        this.numero1=num1;
        this.numero2=num2;
    }

    //sumar()
    public Integer sumar(){
        return this.numero1+this.numero2;
    }

    //restar()
    public Integer restar(){
        return this.numero1-this.numero2;
    }

    //multiplicar()
    public Integer multiplicar(){
        Integer result= 0;
        if(this.numero1==0 || this.numero2==0){
            result=0;
            System.out.println("\nERROR! Multiplicacion por cero");
        }
        else{
            result = this.numero1*this.numero2;
        }
        return result;
    }

    //division
    public Double dividir(){
        Double result=0.0;
        if(this.numero1==0 || this.numero2==0){
            result=0.0;
            System.out.println("\nERROR! Division por cero");
        }
        else{
            result = (double) this.numero1/this.numero2;
        }
        return result;
    }

}
