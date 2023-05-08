import java.util.*;

/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
*/
public class Main {
    public static void main(String[] args) {
         List<String> listPerros = new ArrayList<>();
         addRazasPerros(listPerros);
         getTodosPerros(listPerros);

    }

    public static List<String> addRazasPerros(List<String> listRazas){
        Scanner teclado = new Scanner(System.in);
        Character respuesta = ' ';
        do{
            System.out.println("Ingrese raza de perro: ");
            String raza = teclado.nextLine();
            listRazas.add(raza);
            System.out.println("Quiere agregar otra raza de perro? ");
            respuesta = teclado.nextLine().toLowerCase().charAt(0);
        }while(respuesta!='n');

        return listRazas;
    }

    public static void getTodosPerros(List<String> listRazas){
        Iterator<String> iter = listRazas.iterator();
        while(iter.hasNext()){
            String raza = iter.next();
            System.out.println(""+raza);
        }
    }
}