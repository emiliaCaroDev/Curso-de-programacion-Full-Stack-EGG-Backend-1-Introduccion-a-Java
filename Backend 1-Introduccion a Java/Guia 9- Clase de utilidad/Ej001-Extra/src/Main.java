import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        ListaDeMeses listaMeses = new ListaDeMeses();
        System.out.println("Cargando meses del año ");
        listaMeses.addMes();
        listaMeses.adivinarMesSecreto();
        System.out.println("\n"+listaMeses.toString());

    }
}