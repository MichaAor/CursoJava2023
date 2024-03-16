package EjercitacionClase.Ejercicio1;

//! Definición de la excepción personalizada
public class NumeroNoPositivoException extends Exception{
    //? Constructor que acepta un mensaje de Error.
    public NumeroNoPositivoException(String message){
        super(message);
    }

}
