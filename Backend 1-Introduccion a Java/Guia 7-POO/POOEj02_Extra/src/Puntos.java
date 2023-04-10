import java.util.Scanner;

public class Puntos {

    private Integer x1;
    private Integer x2;
    private Integer y1;
    private Integer y2;

    public Puntos(){}

    public Puntos(Integer x1,Integer y1,Integer x2,Integer y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }


    public Integer getX1() {
        return x1;
    }

    public void setX1(Integer x1) {
        this.x1 = x1;
    }

    public Integer getX2() {
        return x2;
    }

    public void setX2(Integer x2) {
        this.x2 = x2;
    }

    public Integer getY1() {
        return y1;
    }

    public void setY1(Integer y1) {
        this.y1 = y1;
    }

    public Integer getY2() {
        return y2;
    }

    public void setY2(Integer y2) {
        this.y2 = y2;
    }

    public String toString(){
        return "\nPuntos: \nP1("+this.getX1()+","+this.getY1()+")\nP2("+this.getX2()+","+this.getY2()+")";

    }

    public void crearPuntos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese coordenada x1");
        Integer px1 = teclado.nextInt();
        System.out.println("Ingrese coordenada y1");
        Integer py1 = teclado.nextInt();
        System.out.println("Ingrese coordenada x2");
        Integer px2 = teclado.nextInt();
        System.out.println("Ingrese coordenada y2");
        Integer py2 = teclado.nextInt();
        this.x1=px1;
        this.x2=px2;
        this.y1=py1;
        this.y2=py2;
    }

    public Double calcularDistancia(){
        return Math.sqrt((double) Math.pow((this.getX2()-this.getX1()),2)+(double) Math.pow((this.getY2()-this.getY1()),2));
    }
}
