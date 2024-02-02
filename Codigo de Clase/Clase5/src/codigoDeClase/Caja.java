package codigoDeClase;
import java.util.ArrayList;
import java.util.List;

//! EJEMPLO CLASE GENERIC
//? Clase genérica Caja que puede almacenar
//?     cualquier tipo de elemento.
/*
* Utilizamos < > para especificar el tipo de parámetro.
* T - El parámetro de tipo genérico pasado a la clase genérica. 
*     Puede tomar cualquier objeto.
* t - Instancia del tipo genérico.
*/
public class Caja<T> {
//? Lista de tipo 'T' para almacenar elementos en la caja
    private List<T> elementos;

//? Constructor para inicializar la lista de elementos.
    public Caja() {
        this.elementos = new ArrayList<>();
    }

//* Método para agregar un elemento a la caja.
    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

//* Método para obtener todos los elementos de la caja.
    public List<T> obtenerElementos() {
        return elementos;
    }

//! Main del ejemplo
public static void main(String[] args) {
//* Creamos una caja para almacenar números enteros.
    Caja<Integer> cajaEnteros = new Caja<>();

//* Agregamos algunos números enteros a la caja.
    cajaEnteros.agregarElemento(5);
    cajaEnteros.agregarElemento(10);

//* Obtenemos los elementos de la caja de números enteros.
    List<Integer> elementosEnteros = cajaEnteros.obtenerElementos();

//* Imprimimos los elementos de la caja de números enteros.
    System.out.println("Elementos en la caja de enteros: " 
                        + elementosEnteros);

//* Creamos una caja para almacenar cadenas de texto.
    Caja<String> cajaTexto = new Caja<>();

//* Agregamos algunas cadenas de texto a la caja.
    cajaTexto.agregarElemento("Hola");
    cajaTexto.agregarElemento("Mundo");

//* Obtenemos los elementos de la caja de cadenas de texto.
    List<String> elementosTexto = cajaTexto.obtenerElementos();

//* Imprimimos los elementos de la caja de cadenas de texto.
    System.out.println("Elementos en la caja de texto: " 
                        + elementosTexto);
    }

//! SINTAXIS BÁSICA MÉTODO GENERIC.
/*
? <T>: Indica que el método es genérico y utiliza un parámetro de tipo T.
?  T parámetro: El parámetro del método es de tipo T. */
    public static <T> void nombreDelMetodo(T parametro) {
        // * Cuerpo del método
    }
}
