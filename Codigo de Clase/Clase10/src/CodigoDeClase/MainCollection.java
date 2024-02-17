package CodigoDeClase;

import java.util.ArrayList;
import java.util.Collection;

public class MainCollection {
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔═══════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  EJEMPLO API COLLLECTION  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═══════════════════════════╝" + "\u001B[0m");

    //? Crear una colección utilizando la implementación ArrayList
        Collection<String> miColeccion = new ArrayList<>();

    //? Agregar elementos a la colección
        miColeccion.add("Elemento 1");
        miColeccion.add("Elemento 2");
        miColeccion.add("Elemento 3");

    //? Mostrar la colección
        System.out.println("Contenido de la colección: " + miColeccion);

    //? Obtener el tamaño de la colección
        System.out.println("Tamaño de la colección: " + miColeccion.size());

    //? Verificar si la colección está vacía
        System.out.println("¿La colección está vacía?: " + miColeccion.isEmpty());

    //? Eliminar un elemento de la colección
        miColeccion.remove("Elemento 2");
        System.out.println("Después de eliminar 'Elemento 2': " + miColeccion);

    //? Limpiar la colección
        miColeccion.clear();
        System.out.println("Después de limpiar la colección: " + miColeccion);
    }
}