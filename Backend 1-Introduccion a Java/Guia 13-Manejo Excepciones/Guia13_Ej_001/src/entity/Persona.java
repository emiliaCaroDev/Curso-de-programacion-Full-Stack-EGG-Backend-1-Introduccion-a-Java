package entity;



public class Persona {
    private String nombre;
    private Integer edad;
    private Sexo sexo;
    private Double peso;
    private Double altura;

    public Persona(){}

    public Persona(String nombre, Integer edad, Sexo sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String toString(){
        return "\nPersona { Nombre = "+nombre+", Edad = "+edad+", Sexo = "+sexo+", Peso = "+peso+", Altura = "+altura+" }";
    }
}
