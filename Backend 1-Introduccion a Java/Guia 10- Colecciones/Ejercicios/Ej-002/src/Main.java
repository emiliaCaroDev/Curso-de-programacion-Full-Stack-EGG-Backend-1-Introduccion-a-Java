import java.util.*;

/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/
public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> listPerros = new ArrayList<>();
        addRazasPerros(listPerros);
        getTodosPerros(listPerros);
        System.out.println("\nIngrese una raza de perro a buscar: ");
        String razaABuscar = teclado.nextLine();
        System.out.println("\n"+buscarRazaPerro(listPerros,razaABuscar).toString());

    }

    public static List<String> addRazasPerros(List<String> listRazas){

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

    public static List<String> buscarRazaPerro(List<String> listRazas,String raza){
        Iterator<String> iter = listRazas.iterator();
        String razaBuscada = "";
        Boolean seEncontro = false;
        while(iter.hasNext()){
            String razaPerro = iter.next();
            if(razaPerro.equalsIgnoreCase(raza)){
                razaBuscada = razaPerro;
                seEncontro = true;
            }
        }
        if(seEncontro){
            listRazas.remove(razaBuscada);
        }
        else{
            System.out.println("\nNo se encontro la raza de perro buscada ");
        }
        Collections.sort(listRazas);
        return listRazas;
    }
}
