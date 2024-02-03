package EjercitacionClase;
    class Rectangulo {
        float ancho = 1.0f;
        float alto = 1.0f;
        public Rectangulo() {
        }
        public Rectangulo(float ancho, float alto) {
            this.ancho = ancho;
            this.alto = alto;
        }
        public float getAncho() {
            return ancho;
        }
        public float getAlto() {
            return alto;
        }

        public void setAncho(float ancho) {
            this.ancho = ancho;
        }
        public void setAlto(float alto) {
            this.alto = alto;
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() +
                    "\n ancho=" + this.ancho +
                    "\n alto=" + this.alto +
                    "\n area=" + this.calcularArea() +
                    "\n perimetro=" + this.calcularPerimitero();
        }

        public float calcularArea() {
            return (this.alto * this.ancho);
        }

        public float calcularPerimitero() {
            return (this.alto * 2 + this.ancho * 2);
        }
    }
class Empleado {

        String dni;
        String nombre;
        String apellido;
        float salario;


    public Empleado(String dni, String nombre, String apellido, float salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
    public double calcularSalarioAnual(){
        return salario*12;
    }
    public void incrementarSalario(float porcentajeIncremento){
        this.salario += (porcentajeIncremento * this.salario)/100;
    }

}
public class EjerciciosClase {
    public static void main(String[] args) {
        /*
         *                                        //-- EJERCITACION DE CLASE --//
         * REALIZAR CADA EJERCICIO CON SU CORRESPONDIENTE DOCUMENTACION Y DEMOSTRAR LOS RESULTADOS
         *  DE MANERA PROLIJA EN LA CONSOLA
         *
         *1) Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
         *    1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
         *    debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
         *    siguientes pruebas:
         *    a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
         *    b. Imprimir por pantalla el alto y ancho.
         *    c. Imprimir por pantalla el área y perímetro.
         *    d. Modificar el alto y el ancho de la instancia.
         *    e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
         *    f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
         *2) Modele el objeto Empleado que posee las siguientes características, dni, nombre,
         *    apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
         *    anual. A su vez se requiere otro método que permita aumentar el salario
         *    dependiendo del porcentaje que se le pase por parámetro. Considere crear un
         *    método que facilite imprimir por pantalla las características del objeto de la
         *    siguiente forma:
         *        Empleado[dni=?, nombre=?, apellido=?, salario=?]
         *        a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
         *        b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
         *        c. Imprima ambos objetos por pantalla
         *        d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo.
         */
//---------------------------------//
//        Inicio Rectangulo        //
//---------------------------------//
/**
         *1) Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
                *    1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
                *    debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
                *    siguientes pruebas:
*/

//     a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        Rectangulo rectangulo = new Rectangulo(2.1f, 1.0f);
//     b. Imprimir por pantalla el alto y ancho.
//     c. Imprimir por pantalla el área y perímetro.
        System.out.println(rectangulo);
//     d. Modificar el alto y el ancho de la instancia.
//     e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
        rectangulo.setAncho(10);
        rectangulo.setAlto(20);
        System.out.println(rectangulo);
//     f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
        Rectangulo rectangulo2 = new Rectangulo();
        System.out.println(rectangulo2);
//---------------------------------//
//         Fin  Rectángulo         //
//---------------------------------//
//---------------------------------//
//         Inicio Empleado         //
//---------------------------------//
/**
 *     a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
 *     b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
 *     c. Imprima ambos objetos por pantalla
 *     d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo.
 */
 Empleado empeadoMes1 = new Empleado("23456345","Carlos", "Gutiérrez",25000);
 Empleado empeadoMes2 = new Empleado("34234123","Ana", "Sánchez",27500);
 System.out.println(empeadoMes1);
 System.out.println(empeadoMes2);
 empeadoMes1.incrementarSalario(15);
 System.out.println("El salario anual de: " + empeadoMes1.getNombre() + " " + empeadoMes1.apellido + " es: " + empeadoMes1.calcularSalarioAnual());
//---------------------------------//
//          Fin Empleado           //
//---------------------------------//
    }
}



