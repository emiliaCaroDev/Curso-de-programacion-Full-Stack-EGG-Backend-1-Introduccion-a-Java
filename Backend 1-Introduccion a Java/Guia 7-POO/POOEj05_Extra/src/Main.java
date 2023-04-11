public class Main {
    public static void main(String[] args) {

        /*
        5_Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
        "salario". Luego, crea un método "calcular_aumento" que calcule el
        aumento salarial de un empleado en función de su edad y salario actual.
        El aumento salarial debe ser del 10% si el empleado tiene más de 30
        años o del 5% si tiene menos de 30 años.
        */

        Empleado miEmpleado = new Empleado("Matias",35,120000.0);
        System.out.println(miEmpleado.toString());
        System.out.println("El aumento salarial del empleado es: $"+miEmpleado.calcularAumento());
        Empleado miEmpleado2 = new Empleado("Juan",25,20000.0);
        System.out.println(miEmpleado2.toString());
        System.out.println("El aumento salario del empleado es: $"+miEmpleado2.calcularAumento());
    }
}