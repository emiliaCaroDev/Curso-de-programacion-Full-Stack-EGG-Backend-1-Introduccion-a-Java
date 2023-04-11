public class Empleado {

    private String nombre;
    private Integer edad;
    private Double salario;

    public Empleado(){}

    public Empleado(String nombre, Integer edad, Double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nEmpleado \nNombre: "+this.getNombre()+"\nEdad: "+this.getEdad()+ "\nSalario: $"+this.getSalario();
    }

    public Double calcularAumento(){
        Double result = 0.d;
        if(this.edad>30){
            result = (getSalario()*0.10);
        }
        else{
            result = (getSalario()*0.5);
        }
        return result;
    }
}
