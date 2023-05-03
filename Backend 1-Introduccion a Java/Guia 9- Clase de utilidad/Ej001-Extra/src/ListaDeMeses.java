
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaDeMeses {


    private List<String> meses;
    private String mesSecreto;

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public ListaDeMeses(){
        this.meses = new ArrayList<>();

    }

    public ListaDeMeses(List<String> meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    public List<String> getMeses() {
        return meses;
    }

    public void setMeses(List<String> meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public void addMes(){
        for(int i=0;i<12;i++){
            System.out.println("Ingrese un mes: ");
            String mes = teclado.nextLine();
            meses.add(mes.toLowerCase());
        }
    }

    public void adivinarMesSecreto(){
        this.mesSecreto = this.meses.get(1);
        String mesUsuario="";
        System.out.println("\nIngrese el mes secreto: ");
        mesUsuario = teclado.nextLine();
        do{
            if(this.mesSecreto.equals(mesUsuario)){
                System.out.println("¡Ha acertado!");
            }
            else{
                System.out.println("No ha acertado.Intente adivinarlo introduciendo otro mes: ");
                mesUsuario = teclado.nextLine();
            }
        }
        while(!this.mesSecreto.equals(mesUsuario));
        System.out.println("¡Ha acertado!");
    }

    @Override
    public String toString() {
        return "ListaDeMeses{" +
                "meses=" + meses +
                ", mesSecreto='" + mesSecreto + '\'' +
                '}';
    }
}
