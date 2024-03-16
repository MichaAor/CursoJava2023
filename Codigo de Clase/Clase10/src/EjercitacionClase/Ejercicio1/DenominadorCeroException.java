package EjercitacionClase.Ejercicio1;

//! Definición de la excepción personalizada
public class DenominadorCeroException extends Exception {
        //? Constructor que acepta un mensaje de Error.
        public DenominadorCeroException(String message){
            super(message);
        }
    }

