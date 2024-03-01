package EjercitacionClase.Ejercicio1;

/**
 * ? a) Crea una clase abstracta llamada Empleado con atributos como nombre, salarioBase,
 * ?   nivel (por ejemplo, junior, intermedio, senior), y evaluacionDesempeño.
 * ? b) Define un método abstracto calcularSalario() en la clase Empleado que tenga en cuenta
 * ?   la evaluación de desempeño.
 * ? d) Agrega un método realizarEvaluacion() en la clase Empleado para simular el proceso de
 * ?    evaluación de desempeño.
 */
public abstract class Empleado {
    String nombre;
    float salarioBase;
    String nivel; //junior, intermedio, senior
    int evaluacionDesempeno; // 1=desempeño_bajo/2=desempeño_normal/3=desempeño_alto
    final float COEFICIENTEJUNIOR = 1.5f;
    final float COEFICIENTEINTERMEDIO = 3.5f;
    final float COEFICIENTESENIOR = 9.5f;

    public abstract float calcularSalario();

    public void realizarEvaluacion(String evaluacionDesempeno) {
        if (evaluacionDesempeno = "desempeño_bajo") {
            this.evaluacionDesempeno = 1;
        } else if (evaluacionDesempeno = "desempeño_medio") {
            this.evaluacionDesempeno = 2;
        } else if (evaluacionDesempeno = "desempeño_alto") {
            this.evaluacionDesempeno = 3;
        } else {
            this.evaluacionDesempeno = 0;
            System.out.println("parametro erroneo en evaluacion de desempeño");
        }

        public String obtenerEvaluacion () {
            if (evaluacionDesempeno = 1) {
                return ("desempeño_bajo");
            } else if (evaluacionDesempeno = 2) {
                return ("desempeño_medio");
            } else if (evaluacionDesempeno = 3) {
                return ("desempeño_alto");
            } else {
                return ("parametro erroneo en evaluacion de desempeño");
            }
        }
    }

}