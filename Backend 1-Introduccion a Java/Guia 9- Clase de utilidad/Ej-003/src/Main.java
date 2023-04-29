import servicio.ArregloService;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayA = new Integer[5];
        Integer[] arrayB =  new Integer[5];

        ArregloService arregloService = new ArregloService();
        arrayA=arregloService.inicializarA(arrayA);

        System.out.println("\nArray A");
        arregloService.mostrarArray(arrayA);

        System.out.println("\nArrayA ordenado");
        arregloService.ordenarArray(arrayA);

        arrayB=arregloService.inicializarB(arrayA);

        System.out.println("ArrayB");
        arregloService.mostrarArray(arrayB);



    }
}