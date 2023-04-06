import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /*1_Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
        El programa deberá después mostrar el resultado de la suma
         */

        /*
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese un número");
        Integer numero1 = teclado.nextInt();
        Scanner teclado2= new Scanner(System.in);
        System.out.println("Ingrese otro número");
        Integer numero2 = teclado2.nextInt();
        Integer suma = 0;
        suma= numero1 + numero2;
        System.out.println("La suma de los numeros es: " + suma);
        */

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*2_Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.*/

        /*Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre= teclado.nextLine();
        System.out.println("Hola " + nombre + "!");
        */

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*3_Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.*/

        /*
        System.out.println("Ingrese una frase");
        Scanner teclado= new Scanner(System.in);
        String frase= teclado.nextLine();
        String fraseMayuscula= frase.toUpperCase();
        System.out.println("" + fraseMayuscula);
        String fraseMinuscula= frase.toLowerCase();
        System.out.println(""+fraseMinuscula);
        */

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*4_Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
        La fórmula correspondiente es: F = 32 + (9 * C / 5).
         */

        /*
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese grados °C");
        Double gradosC = teclado.nextDouble();
        Double gradosF = 32 + (9 * gradosC / 5 );
        System.out.println( gradosC + "°C equivalen a " + gradosF + "°F");
        */

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*5_Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y
         la raíz cuadrada de ese número.
         */

        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        Integer numero= teclado.nextInt();
        Integer doble= numero * 2;
        Integer triple= numero * 3;
        Double raizCuadrada= Math.sqrt(numero);
        System.out.println("El doble de " + numero +" es: " + doble);
        System.out.println("El triple de " + numero +" es: " + triple);
        System.out.println("La raiz cuadrada de " + numero +" es: " + raizCuadrada);








    }
}