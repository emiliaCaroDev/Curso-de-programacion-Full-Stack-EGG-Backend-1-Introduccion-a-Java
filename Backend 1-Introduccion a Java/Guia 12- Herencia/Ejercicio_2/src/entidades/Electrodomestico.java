import java.util.Scanner;

public class Electrodomestico {

    private Double precio;
    private String color;
    private char consumoEnergetico;
    private Double peso;

    public Electrodomestico(){
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        char result = ' ';
        if(letra=='A' || letra=='B' || letra=='C' || letra=='D' || letra=='E' || letra=='F'){
            result = letra;
        }
        else{
            result = 'F';
        }
        return result;
    }

    private void comprobarColor(String color){
        if(color.toLowerCase().equals("blanco") || color.toLowerCase().equals("negro") || color.toLowerCase().equals("rojo") || color.toLowerCase().equals("azul") || color.toLowerCase().equals("gris")){
            this.color = color;
        }
        else{
            this.color = "blanco";
        }
    }

    public Electrodomestico crearElectrodomestico(){
        Electrodomestico electrodomestico = new Electrodomestico();
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nIngrese el color del electrodomestico");
        String colr = teclado.nextLine();
        electrodomestico.setColor();

        System.out.println("\nIngrese el consumo electrico");
        char consumoEnerg = teclado.nextLine().charAt(0);
        this.comprobarConsumoEnergetico(consumoEnerg);

        this.precio = 1000.0;

        System.out.println("\nIngrese el peso del electrodometico");
        Double pes= 

        return null;
    }

    public String toString(){
        return "Electrodomestico { Precio = "+precio+", Color = "+color+", Consumo energetico = "+consumoEnergetico+ ", Peso = "+peso+"}";
    }


}
