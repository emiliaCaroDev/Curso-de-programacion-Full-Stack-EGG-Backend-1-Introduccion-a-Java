import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        1. Crear un programa que dado un número determine si es par o impar.
        */

        /*
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Ingrese un número");
        Integer num = teclado.nextInt();
        if(num % 2 ==0){
            System.out.println("El número " +num+ " es par");
        }
        else{
            System.out.println("El número " +num+ " es impar");
        }
       */

/*[=====================================================================================================================]*/


        /*
        2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
        programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
        Incorrecto. Nota: investigar la función equals() en Java.
        */

        /*
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = teclado.nextLine();
        if(frase.equals("eureka")){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }

         */

/*[=====================================================================================================================]*/

        /*
        3. Realizar un programa que solo permita introducir solo frases o palabras
        de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
        deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
        caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
        función Lenght() en Java.
        */

        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String frase = teclado.nextLine();
        if(frase.length()==8){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }

        */

/*[=====================================================================================================================]*/


        /*
        4. Escriba un programa que pida una frase o palabra y valide si la primera
         letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
        imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
        contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
        Substring y equals() de Java.
        */

        /*
        Scanner teclado=  new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String frase = teclado.nextLine();

        if(frase.startsWith("A")){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }

         */


/*[=====================================================================================================================]*/

        /*================Bucles y sentencias de salto break y continue============================]*/

        /*5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
        continuación solicite números al usuario hasta que la suma de los
        números introducidos supere el límite inicial.
        */

        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un valor limite");
        Integer valorLimite = teclado.nextInt();
        Integer suma = 0;
        if(valorLimite>0){
            while(suma < valorLimite ){
                System.out.println("Ingrese un número");
                Integer num = teclado.nextInt();
                suma+=num;
            }
        }
        else{
            System.out.println("Valor limite inválido ");
        }
        System.out.println("El valor inicial es: " +valorLimite+"\nLa suma de los numeros es: " +suma);
         */


/*[=====================================================================================================================]*/

        //FALTA!!

        /*
        6_Realizar un programa que pida dos números enteros positivos por
        teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
        una opción y el programa deberá mostrar el resultado por pantalla y
        luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
        vez de salir del programa directamente, se debe mostrar el siguiente
        mensaje de confirmación: ¿Está seguro que desea salir del programa
                (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
        contrario se vuelve a mostrar el menú.

            MENU
            1.Sumar
            2.Restar
            3.Multiplicar
            4.Dividir
            5.Salir
            Elija opcion:

        */

        /*
        Scanner teclado = new Scanner(System.in);
        String respuesta="";
        Double operacion = 0.d;
        while(respuesta.equals("N"){
            System.out.println("Ingrese un número");
            Double num1 = teclado.nextDouble();
            System.out.println("Ingrese otro número");
            Double num2 = teclado.nextDouble();
            System.out.println("MENU \n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\nElija opcion:");
            Integer opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    operacion = num1 + num2;
                    System.out.println("El resultado de la operacion es: " + operacion);
                    break;
                case 2:
                    operacion = num1 - num2;
                    System.out.println("El resultado de la operacion es: " + operacion);
                    break;
                case 3:
                    operacion = num1 * num2;
                    System.out.println("El resultado de la operacion es: " + operacion);
                    break;
                case 4:
                    operacion = num1 / num2;
                    System.out.println("El resultado de la operacion es: " + operacion);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    System.out.println("Ingrese respuesta");
                    respuesta = teclado.nextLine();
                    if(respuesta=="S"){
                        break;
                    }
                    else{
                        respuesta="N";
                    }


            }
        }
        */


/*[=====================================================================================================================]*/

        /*7. Realizar un programa que simule el funcionamiento de un dispositivo
        RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
        cadenas deben llegar con un formato fijo: tienen que ser de un máximo
        de 5 caracteres de largo, el primer carácter tiene que ser X y el último
        tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas,
        la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
        FDE), y toda secuencia distinta de FDE, que no respete el formato se
        considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de
        lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
        deberá investigar cómo se utilizan las siguientes funciones de Java
        Substring(), Length(), equals().
        */

        /*
        Scanner teclado = new Scanner(System.in);
        String cadMayus="";
        Integer contCorrectas = 0, contIncorrectas = 0;
        do{
            System.out.println("Ingrese cadena");
            String cadena = teclado.nextLine();
            cadMayus = cadena.toUpperCase();
            if(cadMayus.length()<=5 && cadMayus.startsWith("X") && cadMayus.endsWith("O")){
                contCorrectas++;
            }
            else{
                contIncorrectas++;
            }
        }while(!cadMayus.equals("&&&&&"));
        System.out.println("\nCantidad de lecturas correctas: " +contCorrectas+ "\nCantidad de lecturas incorrectas: " +contIncorrectas);


*/

/*[=====================================================================================================================]*/

        //FALTA

        /*8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
        lo siguiente:

        * * * *
        *     *
        *     *
        * * * *

       */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        Integer n = teclado.nextInt();
        for(int i=0; i<n;i++){
            if(i==0 || i==n){
                System.out.println(" * ".repeat(n));
            }
            else{
                System.out.println(" * ");
            }

        }
*/

 /*[=====================================================================================================================]*/

        //EXTRA

        /*18. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
        del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
        por una E. Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
                .
.
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String.
        */

        /*
        for(int i=0;i<10;i++){
            System.out.println(""+i+);
        }

/*[=====================================================================================================================]*/

        /* 1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos,
        el sistema debe calcular su equivalente: 1 día, 2 horas.
        */

        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los minutos ");
        Integer minutos = teclado.nextInt();

/*[=====================================================================================================================]*/
         









    }


}