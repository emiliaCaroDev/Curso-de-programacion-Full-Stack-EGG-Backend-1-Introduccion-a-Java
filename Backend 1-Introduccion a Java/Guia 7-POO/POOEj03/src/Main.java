import entidad.Operacion;

public class Main {
    public static void main(String[] args) {



        /*
        Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2.
        A continuación, se deben crear los siguientes métodos:

        Método constructor con todos los atributos pasados por parámetro.
        Método constructor sin los atributos pasados por parámetro.
        Métodos get y set.
        Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los
        atributos del objeto.
        Método sumar(): calcular la suma de los números y devolver el resultado al main.
        Método restar(): calcular la resta de los números y devolver el resultado al main
        Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera
        a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no,
        se hace la multiplicación y se devuelve el resultado al main
        Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
        una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa
        al usuario. Si no, se hace la división y se devuelve el resultado al main.

        */

        Operacion miOperacion= new Operacion();
        miOperacion.crearOperacion(0,5);
        System.out.println("\nLa suma de los numeros es: "+miOperacion.sumar());
        System.out.println("\nLa resta de los numeros es:"+miOperacion.restar());
        System.out.println("\nLa multiplicacion de los numeros es:"+miOperacion.multiplicar());
        System.out.println("\nLa division de los numeros es:"+miOperacion.dividir());
    }
}