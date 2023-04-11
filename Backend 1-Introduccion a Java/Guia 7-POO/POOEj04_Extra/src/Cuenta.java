public class Cuenta {

    private Double saldo;
    private String titular;


    public Cuenta(){}

    public Cuenta(Double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String toString(){
        return "\nCuenta \nTitular: "+this.getTitular()+"\nSaldo: $ "+this.getSaldo();
    }

    public void retirarDinero(Double monto){
        if(this.saldo>0){
            if(this.saldo>monto){
                this.saldo = saldo - monto;
            }
        }
        else{
            System.out.println("No se puede realizar la transaccion de retiro");
        }
    }
}
