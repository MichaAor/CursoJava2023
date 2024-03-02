package EjercitacionClase.Ejercicio1;

public class EjerciciosClase {
    public static void main(String[] args) {
 /*
!                                        //-- EJERCITACION DE CLASE --//
!  REALIZAR CADA EJERCICIO CON SU CORRESPONDIENTE DOCUMENTACIÓN Y DEMOSTRAR LOS RESULTADOS
!   DE MANERA PROLIJA EN LA CONSOLA
?  1)  Sistema de Recursos Humanos en una Empresa Tecnológica
?  Diseña un sistema avanzado de recursos humanos para una empresa tecnológica que utilice clases 
?   y métodos abstractos, incorporando conceptos adicionales.
? a) Crea una clase abstracta llamada Empleado con atributos como nombre, salarioBase,
?   nivel (por ejemplo, junior, intermedio, senior), y evaluacionDesempeño.
? b) Define un método abstracto calcularSalario() en la clase Empleado que tenga en cuenta 
?   la evaluación de desempeño.
? c) Implementa subclases concretas como Desarrollador, Diseñador, y Gerente que hereden de la clase Empleado.
? d) Agrega un método realizarEvaluacion() en la clase Empleado para simular el proceso de evaluación de desempeño.
? e) En el programa principal, crea instancias de diferentes empleados, realiza evaluaciones de desempeño
?   y muestra sus salarios calculados.
*/


    Empleado juniorJava = new Desarrollador();
    Empleado seniorJava = new Desarrollador();

    juniorJava.setNombre("Juan Cars");
    juniorJava.setNivel("junior");
    juniorJava.setSalarioBase(4000);
    juniorJava.realizarEvaluacion("desempeño_medio");
    System.out.println("El salario del " + juniorJava.getNivel() +" developer :" + juniorJava.getNombre() + " cuyo desempeño fue: " + juniorJava.obtenerEvaluacion()+ " es: " + juniorJava.calcularSalario());

    seniorJava.setNombre("Ernesto Figueras");
    seniorJava.setNivel("senior");
    seniorJava.setSalarioBase(4000);
    seniorJava.realizarEvaluacion("desempeño_alto");
    System.out.println("El salario del " + seniorJava.getNivel() +" developer :" + seniorJava.getNombre() + " cuyo desempeño fue: " + seniorJava.obtenerEvaluacion()+ " es: " + seniorJava.calcularSalario());


    }

}