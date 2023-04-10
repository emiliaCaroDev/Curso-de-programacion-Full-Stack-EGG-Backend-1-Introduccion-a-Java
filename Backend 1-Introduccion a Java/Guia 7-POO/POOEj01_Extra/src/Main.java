public class Main {
    public static void main(String[] args) {


/*====================================================================================================================*/

        /*1. Desarrollar una clase Cancion con los siguientes atributos: título y autor.
        Se deberá definir además dos constructores: uno vacío que inicializa el
        título y el autor a cadenas vacías y otro que reciba como parámetros el
        título y el autor de la canción. Se deberán además definir los métodos
        getters y setters correspondientes.
        */


        Cancion cancion =  new Cancion();
        //System.out.println(cancion.toString());
        cancion.setTitulo("Perfecta");
        cancion.setAutor("Miranda");
        System.out.println(cancion.toString());

         

/*====================================================================================================================*/




    }
}