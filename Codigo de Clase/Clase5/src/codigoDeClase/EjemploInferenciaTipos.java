package codigoDeClase;

import java.util.List;

//! EJEMPLO INFERENCIA DE TIPOS
public class EjemploInferenciaTipos {
//? Método genérico que devuelve el primer elemento de una lista
//? <> - El operador diamante denota inferencia de tipo.
//? Mediante el operador diamante, el compilador determina el tipo del parámetro. 
//? Este operador está disponible a partir de la versión Java SE 7.
    public static <T> T obtenerPrimerElemento(List<T> lista) {
        if (lista.isEmpty()) {
            return null;
        }
    return lista.get(0);
    }

    public static void main(String[] args) {
//* Se crea una lista de cadenas de texto
        List<String> listaCadenas = List.of("Hola", "Mundo");

//* Inferencia de tipo al invocar el método
        String primerElemento = obtenerPrimerElemento(listaCadenas);

//? Ya no es necesario especificar el tipo de manera explícita
//? En lugar de: 
//? String primerElemento = EjemploInferenciaTipos.<String>obtenerPrimerElemento(listaCadenas);
        System.out.println("Primer elemento: " + primerElemento);
    }
}
