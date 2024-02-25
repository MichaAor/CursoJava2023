package CodigoDeClase;

import java.util.*;

public class EstructurasAPICollection {
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔═══════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  ESTRUCTURAS API COLLLECTION  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═══════════════════════════════╝" + "\u001B[0m");

        //? Lista (ArrayList)
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        System.out.println("Lista: " + lista);

        //? Conjunto (HashSet)
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        System.out.println("Conjunto: " + conjunto);

        //? Mapa (HashMap)
        Map<String, Double> mapa = new HashMap<>();
        mapa.put("Clave1", 3.14);
        mapa.put("Clave2", 2.71);
        mapa.put("Clave3", 1.618);
        System.out.println("Mapa: " + mapa);

        //? Cola (LinkedList como Queue)
        Queue<String> cola = new LinkedList<>();
        cola.offer("Elemento 1");
        cola.offer("Elemento 2");
        cola.offer("Elemento 3");
        System.out.println("Cola: " + cola);

        //? Pila (LinkedList como Deque)
        Deque<String> pila = new LinkedList<>();
        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");
        System.out.println("Pila: " + pila);
    }
}
