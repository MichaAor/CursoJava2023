package CodigoDeClase;

import java.util.ArrayList;
import java.util.Collection;

public class MetodosAPICollection {
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔═══════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  EJEMPLO API COLLLECTION  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═══════════════════════════╝" + "\u001B[0m");

    //? Crear una colección utilizando la implementación ArrayList
        Collection<String> miColeccion = new ArrayList<>();

    //? Agregar elementos a la colección
        System.out.println("\033[31m" + "\n═  miColeccion.add(E elemento)  ═" + "\u001B[0m");
        miColeccion.add("Elemento 1");
        miColeccion.add("Elemento 2");
        miColeccion.add("Elemento 3");

    //? Mostrar la colección
        System.out.println("\033[31m" + "\n═  string + miColeccion  ═" + "\u001B[0m");
        System.out.println("Contenido de la colección: " + miColeccion);

    //? Comprobar si contiene un elemento
        System.out.println("\033[31m" + "\n═  miColeccion.contains(E elemento)  ═" + "\u001B[0m");
        if(miColeccion.contains("Elemento 4")){
            System.out.println("La coleccion contiene: 'Elemento 4'");
        }else{
            System.out.println("No contiene 'Elemento 4'");
        }

    //? Obtener el tamaño de la colección
        System.out.println("\033[31m" + "\n═  miColeccion.size()  ═" + "\u001B[0m");
        System.out.println("Tamaño de la colección: " + miColeccion.size());

    //? Verificar si la colección está vacía
        System.out.println("\033[31m" + "\n═  miColeccion.isEmpty()  ═" + "\u001B[0m");
        System.out.println("¿La colección está vacía?: " + miColeccion.isEmpty());

    //? Eliminar un elemento de la colección
        System.out.println("\033[31m" + "\n═  miColeccion.remove(E elemento)  ═" + "\u001B[0m");
        miColeccion.remove("Elemento 2");
        System.out.println("Después de eliminar 'Elemento 2': " + miColeccion);

    //? Limpiar la colección
        System.out.println("\033[31m" + "\n═  miColeccion.clear  ═" + "\u001B[0m");
        miColeccion.clear();
        System.out.println("Después de limpiar la colección: " + miColeccion);
    }
}