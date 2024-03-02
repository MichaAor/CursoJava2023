package EjercitacionClase.Ejercicio1;

/**
 * ? c) Implementa subclases concretas como Desarrollador, Diseñador, y Gerente que hereden de la clase Empleado.
 */
public class Disenador extends Empleado {
    final float COEFICIENTEDISENADOR = 8.5f;
    public float calcularSalario() {
        if (this.nivel == "junior") {
            return (salarioBase * COEFICIENTEJUNIOR * evaluacionDesempeno * COEFICIENTEDISENADOR);
        } else if (this.nivel == "semisenior") {
            return (salarioBase * COEFICIENTESEMISENIOR * evaluacionDesempeno * COEFICIENTEDISENADOR);
        } else if (this.nivel == "senior") {
            return (salarioBase * COEFICIENTESENIOR * evaluacionDesempeno * COEFICIENTEDISENADOR);
        }
        return(0);
    }
}
