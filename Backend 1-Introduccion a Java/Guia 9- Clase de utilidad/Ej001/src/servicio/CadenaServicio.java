package servicio;

import entidad.Cadena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class CadenaServicio {

    Scanner teclado = new Scanner(System.in);


    public Cadena crearCadena(){
        System.out.println("Ingrese una frase: ");
        String frase = teclado.nextLine();
        Cadena cadena = new Cadena(frase);
        return cadena;
    }

    public Integer mostrarVocales(Cadena cadena){
        Integer contVocales = 0;
        char[] cadenaArrayChar = new char[cadena.getLongitud()];
        cadenaArrayChar = cadena.getFrase().toLowerCase().toCharArray();
        for(char character: cadenaArrayChar){
            if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u'){
                contVocales++;
            }
        }
        return contVocales;
    }


    public String invertirFrase(Cadena cadena){
        String result="";

        ArrayList<Character> fraseInv = new ArrayList<>();
        char[] cadenaToArrayChar = new char[cadena.getLongitud()];
        cadenaToArrayChar = cadena.getFrase().toLowerCase().toCharArray();
        for(int i=cadena.getLongitud()-1;i>=0;i--){
            fraseInv.add(cadenaToArrayChar[i]);
        }
        Iterator<Character> iter = fraseInv.iterator();
        while(iter.hasNext()){
            char caracter = iter.next();
            result+=""+caracter;
        }
        return result;
    }

    public Integer vecesRepetido(String letra,Cadena cadena){
        Integer contadorCharRepetido = 0;
        char letraChar = letra.charAt(0);
        char[] cadenaToArray = cadena.getFrase().toLowerCase().toCharArray();
        for(char cad: cadenaToArray){
            if(cad==letraChar){
                contadorCharRepetido++;
            }
        }
        return  contadorCharRepetido;
    }

    public void compararLongitud(String frase,Cadena cadena){
        if(cadena.getLongitud()==frase.length()) {
            System.out.println("\nLa frase : '" + cadena.getFrase() + "' tiene la misma longitud que la frase ingresada: " + frase+"'.");
        }
        else{
            if(cadena.getLongitud()>frase.length()){
                System.out.println("\nLa frase : '"+ cadena.getFrase()+"' tiene mayor longitud que la frase ingresada: '"+frase+"'.");
            }
            else{
                System.out.println("\nLa frase : '"+ cadena.getFrase()+"' tiene menor longitud que la frase ingresada: "+frase+"'.");
            }
        }
    }

    public String unirFrases(String frase, Cadena cadena){
        return cadena.getFrase().concat(frase);
    }

    public String reemplazar(String letra,Cadena cadena){
        return cadena.getFrase().replace('a',letra.charAt(0));
    }

    public Boolean contiene(String letra,Cadena cadena){
        return cadena.getFrase().contains(letra);
    }
}

