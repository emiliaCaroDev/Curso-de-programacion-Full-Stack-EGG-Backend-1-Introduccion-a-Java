public class Main {
    public static void main(String[] args) {

        /*
        4_ Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
        Luego, crea un método "retirar_dinero" que permita retirar una cantidad
        de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
        negativo después de realizar una transacción de retiro.
        */

        //Cuenta miCuenta = new Cuenta(10000.0,"Maria Eugenia");
        Cuenta miCuenta2 = new Cuenta(0.0,"Eduardo");
        System.out.println(miCuenta2.toString());
        miCuenta2.retirarDinero(100.0);
        System.out.println("\nCuenta despues de la transicion"+miCuenta2.toString());

    }
}