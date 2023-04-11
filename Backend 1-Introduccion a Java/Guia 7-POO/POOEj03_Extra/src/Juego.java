import java.util.Scanner;

public class Juego {

    private Integer numeroJugador1;
    private Integer numeroJugador2;
    private Integer numIntentos;

    public Juego(){}

    public void iniciarJuego(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número de intentos del juego");
        this.numIntentos = teclado.nextInt();
        System.out.println("Jugador 1, ingrese un número");
        this.numeroJugador1 = teclado.nextInt();
        System.out.println("Jugador 2, ingrese un número");
        this.numeroJugador2 = teclado.nextInt();
    }

    public Boolean seAdivinoElNumero(){
        return null;
    }

    public Integer cantidadDeVecesPartidasGanadas(){

    }
}
