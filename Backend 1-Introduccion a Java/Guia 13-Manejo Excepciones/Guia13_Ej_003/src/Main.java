import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Ingrese un numero");
        String num1 = teclado.nextLine();
        Integer numero1 = Integer.parseInt(num1);

        System.out.println("Ingrese un numero");
        String num2 = teclado.nextLine();
        Integer numero2 = Integer.parseInt(num2);

        DivisionNumero divisionNumero = new DivisionNumero(numero1,numero2);

        System.out.println(divisionNumero.calcularDivision());
        }
        catch(NumberFormatException ex){
            System.err.println(ex.getMessage());
        }
        catch(InputMismatchException ex){
            System.err.println(ex.getMessage());
        }
        catch(ArithmeticException ex){
            System.err.println(ex.getMessage());
        }

    }
}