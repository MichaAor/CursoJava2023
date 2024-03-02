package EjercitacionClase.Ejercicio1;

/**
 * ? c) Implementa subclases concretas como Desarrollador, Diseñador, y Gerente que hereden de la clase Empleado.
 */
public class Gerente  extends Empleado{
    final float COEFICIENTEGERENTE = 8.5f;
    public float calcularSalario() {
        if (this.nivel == "junior") {
            return (salarioBase * evaluacionDesempeno * COEFICIENTEGERENTE);
        } else if (this.nivel == "semisenior") {
            return (salarioBase * evaluacionDesempeno * COEFICIENTEGERENTE);
        } else if (this.nivel == "senior") {
            return (salarioBase * evaluacionDesempeno * COEFICIENTEGERENTE);
        }
        return(0);
    }
}
