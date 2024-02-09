import java.util.*;

public class Main {
    public static void main(String[] args) {
        ejAPICollection();
        ejAPICollection();
    }

    public static void ejEstructurasDatos(){
//? Arreglo (ARRAY)
        int[] arreglo = {1, 2, 3, 4, 5};

//? Lista Doblemente Vinculada
        LinkedList<Integer> listaVinculada = new LinkedList<>();
        listaVinculada.add(10);
        listaVinculada.add(20);
        listaVinculada.add(30);

//? Pila
        Stack<Integer> pila = new Stack<>();
        pila.push(40);
        pila.push(50);
        pila.push(60);

//? Cola
        Queue<Integer> cola = new LinkedList<>();
        cola.add(70);
        cola.add(80);
        cola.add(90);

//? Conjunto
        Set<String> conjunto = new HashSet<>();
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");

//? Mapa
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Uno", 1);
        mapa.put("Dos", 2);
        mapa.put("Tres", 3);

//? Árbol
        TreeSet<Integer> arbol = new TreeSet<>();
        arbol.add(100);
        arbol.add(200);
        arbol.add(300);

//? Mostrar resultados
        System.out.println("Arreglo: " + Arrays.toString(arreglo));
        System.out.println("Lista vinculada: " + listaVinculada);
        System.out.println("Pila: " + pila);
        System.out.println("Cola: " + cola);
        System.out.println("Conjunto: " + conjunto);
        System.out.println("Mapa: " + mapa);
        System.out.println("Árbol: " + arbol);
    }

    public static void ejAPICollection(){
//! Crear dos colecciones
        Collection<String> coleccion1 = new ArrayList<>();
        Collection<String> coleccion2 = new ArrayList<>();

//? add(E e): Añadir elementos a la colección
        coleccion1.add("Elemento 1");
        coleccion1.add("Elemento 2");
        coleccion1.add("Elemento 3");

//? addAll(Collection<?> c): Añadir todos los elementos de otra colección
        coleccion2.addAll(coleccion1);

//? remove(Object o): Eliminar un elemento específico
        coleccion1.remove("Elemento 2");

//? removeAll(Collection<?> c): Eliminar todos los elementos presentes en otra colección
        coleccion2.removeAll(coleccion1);

//? retainAll(Collection<?> c): Retener solo los elementos presentes en otra colección
        coleccion2.retainAll(coleccion1);

//? size(): Obtener el tamaño de la colección
        int tamañoColeccion1 = coleccion1.size();
        int tamañoColeccion2 = coleccion2.size();

//? clear(): Limpiar la colección
        coleccion1.clear();

//? contains(Object objeto): Verificar si la colección contiene un objeto específico
        boolean contieneElemento = coleccion2.contains("Elemento 1");

//? containsAll(Collection<?> c): Verificar si la colección contiene todos los elementos de otra colección
        boolean contieneTodos = coleccion2.containsAll(coleccion1);

//? toArray(): Convertir la colección a un array
        Object[] arrayColeccion2 = coleccion2.toArray();

//? isEmpty(): Verificar si la colección está vacía
        boolean estaVaciaColeccion1 = coleccion1.isEmpty();
        boolean estaVaciaColeccion2 = coleccion2.isEmpty();

//? equals(Object objeto): Verificar si dos colecciones son iguales
        boolean sonIguales = coleccion1.equals(coleccion2);

        // Mostrar resultados
        System.out.println("Colección 1: " + coleccion1);
        System.out.println("Colección 2: " + coleccion2);
        System.out.println("Tamaño Colección 1: " + tamañoColeccion1);
        System.out.println("Tamaño Colección 2: " + tamañoColeccion2);
        System.out.println("¿Contiene 'Elemento 1' en Colección 2?: " + contieneElemento);
        System.out.println("¿Contiene todos los elementos de Colección 1 en Colección 2?: " + contieneTodos);
        System.out.println("Array Colección 2: " + arrayColeccion2);
        System.out.println("¿Colección 1 está vacía?: " + estaVaciaColeccion1);
        System.out.println("¿Colección 2 está vacía?: " + estaVaciaColeccion2);
        System.out.println("¿Colección 1 y Colección 2 son iguales?: " + sonIguales);
    }
}