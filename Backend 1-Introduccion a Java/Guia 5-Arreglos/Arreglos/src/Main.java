import java.util.Scanner;

public class Main {
    static Integer[][] matriz = new Integer[4][4];
    static Scanner  teclado = new Scanner(System.in);

    public static void main(String[] args) {

        /*=====================================================================================================================*/

        //Ejercicio 1

        /*Realizar un algoritmo que llene un vector con los primeros 100 primeros numeros enteros y los muestre por
        pantalla en orden descendente
        */
        /*
        llenarYMostrarArreglo();



    }

    public static void llenarYMostrarArreglo(){
        Integer arrayNumeros[]= new Integer[10];
        for(int i=0;i<10;i++){
            arrayNumeros[i]=i+1;
        }
        //mostrar arreglo
        for (int i=arrayNumeros.length-1;i>=0;i--){
            System.out.println("arrayNumeros["+ i +"] = " +arrayNumeros[i]);
        }
    }*/

        /*=====================================================================================================================*/

    /*2)_ Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar
    en el vector. El programa mostrará donde se encuentra el numero y si se encuentra repetido*/

        /*=====================================================================================================================*/

        /* 3)_ Recorrer un vector de N enteros contabilizando cuantos numeros son de 1 digito, cuantos de 2 digitos,
        etc(hasta 5 digitos)
        */

        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese longitud del vector");
        Integer n= teclado.nextInt();
        Integer arreglo[] = new Integer[n];
        llenarArreglo(n,arreglo);
        mostrarArreglo(arreglo);
        System.out.println("En el arreglo hay "+contadorDigitos(1,arreglo)+" numeros de 1 digito" );
        System.out.println("En el arreglo hay "+contadorDigitos(2,arreglo)+" numeros de 2 digito" );
        System.out.println("En el arreglo hay "+contadorDigitos(3,arreglo)+" numeros de 3 digito" );
        System.out.println("En el arreglo hay "+contadorDigitos(4,arreglo)+" numeros de 4 digito" );
        System.out.println("En el arreglo hay "+contadorDigitos(5,arreglo)+" numeros de 5 digito" );

    }

    public static void llenarArreglo(Integer longitudVector,Integer[] arreglo){
        for(int i=0;i<longitudVector;i++){
            Scanner tecladoInt = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            Integer numero = tecladoInt.nextInt();
            arreglo[i] = numero;
        }
    }

    public static void mostrarArreglo(Integer[] arreglo){
        for (int i=0;i<arreglo.length;i++){
            System.out.println("arreglo["+i+"] = "+arreglo[i]);
        }
    }

    public static Integer contadorDigitos(Integer digito,Integer[] arreglo){
        Integer contador = 0;
        //recorrer el arreglo
        for(int i=0;i<arreglo.length;i++){
            if(String.valueOf(arreglo[i]).length()==digito){
                contador++;
            }
        }
        return contador;
    }
*/

        /*=====================================================================================================================*/
        /*4)_ Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
        La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

        Matriz A                                       Matriz B

        ------------                                  -------------
        | 1 | 0 | 4 |                                 | 1 | 0 | 6 |
        ------------                                  -------------
        | 0 | 5 | 0 |                                 | 0 | 5 | 0 |
        -------------                                 -------------
        | 6 | 0 |-9 |                                 | 4 | 0 |-9 |
        -------------                                 -------------

      */
    /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese orden de la matriz");
        Integer orden = teclado.nextInt();
        Integer[][] matrizA = new Integer[orden][orden];
        matrizA = llenarMatriz2(orden);
        //matrizA = llenarMatriz(orden,10,1);
        mostrarMatriz(matrizA);
        System.out.println("\nMatriz Transpuesta ");
        mostrarMatriz(matrizTranspuesta(matrizA));
    }
    public static Integer[][] llenarMatriz(Integer orden,Integer max, Integer min){
        Integer[][] matriz= new Integer[orden][orden];
        Integer rango = max - min +1;
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                Integer aleatorio = (int)(Math.random()*rango + min);
                matriz[i][j]=aleatorio;
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(Integer[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("matriz["+i+"]["+j+"] = "+matriz[i][j]);
            }
        }
    }

    public static Integer[][] matrizTranspuesta(Integer[][] matriz){
        Integer[][] matrizTranspuesta = new Integer[matriz.length][matriz.length];
        for(int j=0;j< matriz.length;j++){
            for(int i=0;i<matriz.length;i++){
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
        return matrizTranspuesta;
    }

    public static Integer[][] llenarMatriz2(Integer orden){
        Scanner teclado = new Scanner(System.in);
        Integer[][] matriz= new Integer[orden][orden];
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                System.out.println("Ingrese un numero");
                Integer numero = teclado.nextInt();
                matriz[i][j] = numero;
            }
        }
        return matriz;
    }

     */

        /*====================================================================================================================*/
    /*
    5_Realice un programa que compruebe si una matriz dada es antisimétrica.
    Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
    pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota
    por AT y se obtiene cambiando sus filas por columnas (o viceversa).

        Matriz A                                      Matriz transpuesta

        --------------                                  ---------------
        |  0 | -2 | 4 |                                 | 0  | 2 | -4 |
        --------------                                  ---------------
        |  2 |  0 | 2 |                                 | -2 | 0 | -2 |
        --------------                                  ---------------
        | -4 | -2 | 0 |                                 |  4 | 2  | 0 |
        --------------                                  ---------------

    */

        /*
        Scanner teclado = new Scanner(System.in);
        Integer max=0, min=0;
        System.out.println("Ingrese orden de la matriz");
        Integer orden = teclado.nextInt();
        Integer[][] matriz = new Integer[orden][orden];
        matriz = llenarMatriz2(orden);
        //matriz = llenarMatriz(10,1,orden);
        Integer[][] matrizAntisimetrica = new Integer[orden][orden];
        Integer[][] matrizTranspuesta = new Integer[orden][orden];
        mostrarMatriz(matriz);
        System.out.println("\nMatriz Transpuesta");
        matrizTranspuesta = matrizTranspuesta(matriz);
        mostrarMatriz(matrizTranspuesta);
        System.out.println("\nMatriz Antisimétrica");
        matrizAntisimetrica = matrizAntisimetrica(matrizTranspuesta);
        mostrarMatriz(matrizAntisimetrica);
        System.out.println("¿es antisimetrica? \n " + esAntisimetrica(matriz,matrizTranspuesta));


    }
    public static Integer[][] llenarMatriz(Integer max,Integer min,Integer orden){
        Integer[][] matriz = new Integer[orden][orden];
        Integer rango = max - min +1;
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                Integer aleatorio = (int) (Math.random()*rango) + min;
                matriz[i][j] = aleatorio;
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(Integer[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                System.out.println("matriz["+i+"]["+j+"]="+matriz[i][j]);
            }
        }
    }

    public static Integer[][] matrizTranspuesta(Integer[][] matriz){
        Integer[][] matrizTranspuesta = new Integer[matriz.length][matriz.length];
        for(int j=0;j< matriz.length;j++){
            for(int i=0;i<matriz.length;i++){
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
        return matrizTranspuesta;
    }

    public static Integer[][] matrizAntisimetrica(Integer[][] matriz) {
        Integer[][] matrizAT = new Integer[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizAT[i][j] = matriz[i][j] * (-1);
            }
        }
        return matrizAT;
    }

    public static Boolean esAntisimetrica(Integer[][] matriz,Integer[][] matrizT) {
        Boolean resultado= true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matrizT[i][j] == matriz[i][j] * (-1)){
                    resultado= true;
                }
                else{
                    resultado = false;
                }

            }
        }
        return resultado;
    }


    public static Integer[][] llenarMatriz2(Integer orden){
        Scanner teclado = new Scanner(System.in);
        Integer[][] matriz= new Integer[orden][orden];
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                System.out.println("Ingrese un numero");
                Integer numero = teclado.nextInt();
                matriz[i][j] = numero;
            }
        }
        return matriz;
    }*/

        /*=====================================================================================================================*/

        /*6)_Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
        sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y
        determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos,
        es decir, están entre el 1 y el 9.


        ------------
        | 2 | 7 | 6 | = 15
        ------------
        | 9 | 5 | 1 |
        ------------
        | 4 | 3 | 8 |
        ------------ =15
        =15

        */

        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nIngrese orden de la matriz");
        Integer orden = teclado.nextInt();
        Integer[][] matriz = new Integer[orden][orden];
        if(esDeOrden3(orden)){
            matriz = llenarMatriz(orden);
            mostrarMatriz(matriz);
        }




    }

    public static Boolean esDeOrden3(Integer orden){
        Boolean resultado = false;
        if(orden==3){
            resultado = true;
        }
        else{
            resultado= false;
        }
        return resultado;
    }

    public static Integer[][] llenarMatriz(Integer orden){
        Integer[][] matriz = new Integer[orden][orden];
        Scanner teclado = new Scanner(System.in);
            for(int i=0;i<orden;i++){
                for(int j=0;j<orden;j++){
                    System.out.println("Ingrese un numero");
                    Integer elemento = teclado.nextInt();
                    if(elemento>=1 && elemento<=9){
                    matriz[i][j]= elemento;
                    }
                }
            }
        return matriz;
    }

    public static void mostrarMatriz(Integer[][] matriz){
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j< matriz.length;j++){
                System.out.println("matriz["+i+"]["+j+"]=" + matriz[i][j]);
            }
        }
    }

    public static Boolean esCuadradoMagico(Integer[][] matriz){
        Boolean resultado = false;
        Integer suma = 0;
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j< matriz.length;j++){
                suma=
            }
        }
        return resultado;
    }

    public static Integer getSumaFilas(Integer[][] matriz){
        Integer suma = 0;
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                suma += matriz[i][j];
            }
            return suma;
        }
    }*/

        /*====================================================================================================================*/

        /*
        1)_ Realizar un algoritmo que calcule
        la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
        */

        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el orden del array");
        Integer orden = teclado.nextInt();
        Integer suma = 0;
        Integer[] array = new Integer[orden];

        for(int i=0;i<orden;i++){
            System.out.println("Ingrese un numero");
            Integer numero = teclado.nextInt();
            suma+=numero;
        }
        System.out.println(" \nLa suma de todos los elementos es: "+suma);

       */
        /*====================================================================================================================*/

        /* 2)_Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse
        en cuanto se detecte alguna diferencia entre los elementos).
         */

        /*
        System.out.println("Ingrese el orden del vector");
        Integer orden = teclado.nextInt();
        Integer[] arrayA = new Integer[orden];
        Integer[] arrayB = new Integer[orden];
        System.out.println("Array A");
        llenarArray(orden,arrayA);
        System.out.println("Array B");
        llenarArray(orden,arrayB);
        System.out.println("\nArray A");
        mostrarArray(arrayA);
        System.out.println("\nArray B");
        mostrarArray(arrayB);
        System.out.println("\n¿Son iguales los arrays? "+sonIgualesArrays(arrayA,arrayB));

    }

    public static void llenarArray(Integer orden,Integer[] array){
        for(int i=0;i<orden;i++){
            System.out.println("\nIngrese un numero");
            Integer numero = teclado.nextInt();
            array[i] = numero;
        }
    }

    public static void mostrarArray(Integer[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("array["+i+"]=" +array[i]);
        }
    }

    public static Boolean sonIgualesArrays(Integer[] arrayA,Integer[] arrayB ){
        Boolean resultado = false;
        for(int i=0;i<arrayA.length;i++){
            if(arrayA[i]==arrayB[i]){
                resultado = true;
            }
            else{
                resultado = false;
                break;
            }
        }
        return resultado;
    }
    */

        /*====================================================================================================================*/

        /*
        3)_ Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después
        haremos otra función o procedimiento que imprima el vector.
        */

        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del areglo ");
        Integer tamanio = teclado.nextInt();
        Integer[] arrayA = new Integer[tamanio];
        llenarArray(arrayA,1,10);
        mostrarArray(arrayA);

    }

    public static void llenarArray(Integer[] array, Integer min,Integer max){
        Integer rango = max - min + 1;
        for(int i=0;i<array.length;i++){
            Integer aleatorio = (int) (Math.random() * rango +1);
            array[i] = aleatorio;
        }
    }

    public static void mostrarArray(Integer[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("array["+i+"] = " +array[i]);
        }
    }
    */
        /*====================================================================================================================*/

        /*
        5)_Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.*/

        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero de filas");
        Integer filas = teclado.nextInt();
        System.out.println("Ingrese numero de columnas");
        Integer columnas = teclado.nextInt();
        Integer[][] matriz = new Integer[filas][columnas];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("\nLa suma de los elementos es: " +sumarElementos(matriz));

    }

    public static void llenarMatriz(Integer[][] matriz){
        Scanner teclado = new Scanner(System.in);
        for(int i=0;i< matriz.length; i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("Ingrese un numero");
                Integer numero = teclado.nextInt();
                matriz[i][j] = numero;
            }
        }
    }

    public static void mostrarMatriz(Integer[][] matriz){
        Scanner teclado = new Scanner(System.in);
        for(int i=0;i< matriz.length; i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("matriz["+i+"]["+j+"] = "+matriz[i][j]);

            }
        }
    }


    public static Integer sumarElementos(Integer[][] matriz){
        Integer suma = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                suma += matriz[i][j];
            }
        }
        return suma;
    }

/*=====================================================================================================================*/

        /*6)_Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las
        va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
        Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
        Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
        Finalmente imprima por pantalla la sopa de letras creada.
         */

        //FALTA

        Scanner teclado = new Scanner(System.in);
        System.out.println("\nIngrese una palabra");
        String[][] matriz = new String[6][6];
        String palabra = teclado.nextLine();
        llenarMatriz(matriz,palabra);
        mostrarMatriz(matriz);
    }

    public static void llenarMatriz(String[][] matriz,String palabra){
        for(int i=0;i<6;i++){
            for(int j=0;j<6;i++){
                matriz[i][j] = palabra.substring(i,i+1);
            }
        }
    }

    public static void mostrarMatriz(String[][] matriz){
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j< matriz.length;j++){
                System.out.println("" + matriz[i][j]);
            }
        }
    }

        /*Scanner teclado = new Scanner(System.in);
        Integer[][] matriz = new Integer[6][6];
        for(int i=0;i<5;i++){
            System.out.println("Ingrese una palabra");
            String palabra = teclado.nextLine();
            if(palabra.length()>3 && palabra.length()<5){
                llenarMatriz(matriz,palabra);
            }
        }


    }
    */



        /*=====================================================================================================================*/

        /*7)_Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci.
        Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
        1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
        La sucesión del número 2 se calcula sumando (1+1)
        Análogamente, la sucesión del número 3 es (1+2),
                Y la del 5 es (2+3),
                Y así sucesivamente…
        La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
        Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
        Fibonaccin = 1 para todo n<=1
        Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor
         de “n” y que calcule la serie hasta llegar a ese valor.
        Para conocer más acerca de la serie de Fibonacci consultar el siguiente
        link: https://quantdare.com/numeros-de-fibonacci/
        */

        /*
        System.out.println("Fibonacci de 9 es: "+calcularFibonacci(9));
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        Integer tamanio = teclado.nextInt();
        Integer[] array = new Integer[tamanio];


    }

    public static void llenarArray(Integer[] array){
        for(int i=0;i<){

        }
    }
    public static Integer calcularFibonacci(Integer numero){
        Integer fibo=0;
        for(int i=0;i<numero;i++){
            if(numero==0){
                fibo= 0;
            }
            else if(numero==1){
                fibo=1;
            }
            else{
                fibo= calcularFibonacci(numero-1) + calcularFibonacci(numero -2);
            }
        }
        return fibo;
    }*/

}