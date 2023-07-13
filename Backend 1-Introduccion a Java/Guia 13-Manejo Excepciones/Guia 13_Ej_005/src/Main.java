import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Integer numPC = (int) (Math.random()*(10-1+1))+1;
        Integer countIntentos = 0;

        try{
            while(true){
                System.out.println("\nIngrese un numero: ");
                Integer numUser = teclado.nextInt();
                if(numUser == numPC){
                    countIntentos ++;
                    System.out.println("\nEl numero a adivinar es: "+numPC);
                    break;
                }
                else if(numUser < numPC){
                    System.out.println("\nEl numero a adivinar es mayor");
                    countIntentos ++;
                }
                else{
                    System.out.println("\nEl numero a adivinar es menor");
                    countIntentos ++;
                }
            }
        }
        catch(InputMismatchException ex){
            System.err.println("El numero ingresado no es un numero "+ex.getMessage());
            countIntentos++;
        }

        System.out.println("\nNumeros de intentos : "+countIntentos);

    }
}