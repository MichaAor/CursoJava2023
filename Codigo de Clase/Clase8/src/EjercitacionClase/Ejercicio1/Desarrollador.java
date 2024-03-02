package EjercitacionClase.Ejercicio1;

/**
 * ? c) Implementa subclases concretas como Desarrollador, Diseñador, y Gerente que hereden de la clase Empleado.
 */
public class Desarrollador  extends Empleado{
    final float COEFICIENTEDESARROLLADOR = 8.5f;
    public float calcularSalario() {
        if (this.nivel == "junior") {
            return (salarioBase * evaluacionDesempeno * COEFICIENTEDESARROLLADOR);
        } else if (this.nivel == "semisenior") {
            return (salarioBase * evaluacionDesempeno * COEFICIENTEDESARROLLADOR);
        } else if (this.nivel == "senior") {
            return (salarioBase * evaluacionDesempeno * COEFICIENTEDESARROLLADOR);
        }
        return(0);
    }

}
