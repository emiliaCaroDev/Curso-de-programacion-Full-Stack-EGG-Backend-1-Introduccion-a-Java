import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        /*[====================================================================================================================]*/


        //MANOS A LA OBRA

        /*Ejercicio 11

        Escribir un programa que procese una secuencia de caracteres ingresada por teclado
        y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
        cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
        (incluyendo a las vocales acentuadas) se mantienen sin cambios.

        ---------------------
        | a | e | i | o | u |
        ---------------------
        | @ | # | $ | % | * |
        ---------------------
        Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente.
        Utilice la estructura “según” para la transformación.
        Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
        La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

*/
/*
        Scanner teclado = new Scanner(System.in);
        char character = ' ';
        do{
            System.out.println("Ingrese algo!");
            character = teclado.next().charAt(0);
        }while(Character.compare(character,'.')==0);

        System.out.println(" " +character);
        */






        /*[====================================================================================================================]*/

        /*
        Ejercicio 12
        Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
        usuario, validando que el primer número múltiplo del segundo e imprima si el
        primer número es múltiplo del segundo, sino informe que no lo son.
        */

        /*[====================================================================================================================]*/


        /*
        1)_Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
         La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en
          el main.
        */

        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        Integer num1 = teclado.nextInt();
        System.out.println("Ingrese otro numero");
        Integer num2 = teclado.nextInt();
        System.out.println("Ingrese una opcion");
        System.out.println("1. Suma \n2. Resta \n3. Multiplicacion \n4. Division");
        Integer opcion = teclado.nextInt();
        switch (opcion){
            case 1 :
                System.out.println("" + num1 + " + " + num2 + " = " + sumar(num1,num2));
                break;
            case 2:
                System.out.println("" + num1 + " - " + num2 + " = "+ restar(num1,num2));
                break;
            case 3:
                System.out.println("" + num1 + " * " + num2 + " = " + multiplicar(num1,num2));
                break;
            case 4:
                System.out.println("" + num1 + " / " + num2 + " = " + dividir(num1,num2));
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public static int restar(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static int dividir(int num1, int num2){
        return num1 / num2;
    }
   */

        /*[====================================================================================================================]*/


    /*2)_Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas
    por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al
    usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
     */

        /*[====================================================================================================================]*/

       /*3) Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a
       otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y
       la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
       (void).
        El cambio de divisas es:
                * 0.86 libras es un 1 €
                * 1.28611 $ es un 1 €
                * 129.852 yenes es un 1 €
        */

        /*
        Scanner tecladoString = new Scanner(System.in);
        Scanner tecladoDouble = new Scanner(System.in);
        System.out.println("Ingrese cantidad de euros");
        Double cantEuros = tecladoDouble.nextDouble();
        System.out.println("Ingrese el tipo de cambio");
        String tipoMoneda = tecladoString.nextLine();
        convertirEuros(cantEuros,tipoMoneda);

    }

    public static void convertirEuros(Double cantEuros, String tipoMoneda) {

        Double resultado = 0.d;
        switch(tipoMoneda){
            case "libras":
                resultado = cantEuros * 0.86;
                System.out.println(""+ cantEuros + " € son " + resultado + " £.");
                break;
            case "dolares":
                resultado = cantEuros * 1.28611;
                System.out.println(""+ cantEuros +" € son " + resultado + " $.");
                break;
            case "yenes":
                resultado = cantEuros * 129.852;
                System.out.println(""+ cantEuros +" € son " + resultado + " ¥.");
                break;
        }
    }
    */
        /*4)_ Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro
        para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
        Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
        ya que 25 es divisible entre 5, sin embargo, 17 si es primo

        El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son:
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
        */

        Scanner tecladoInteger = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        Integer numero = tecladoInteger.nextInt();
        System.out.println("¿El número " + numero +" es primo? " +esPrimo(numero));



    }

    public static Boolean esPrimo(Integer numero){
        Boolean resultado = false;
        for(int i=2;i<=30;i++){
            if(i % 1 == 0 && i % i == 0 || i % 2 == 0){
                resultado = true;
            }
            else{

                resultado = false;
            }
        }
        return resultado;
    }


}