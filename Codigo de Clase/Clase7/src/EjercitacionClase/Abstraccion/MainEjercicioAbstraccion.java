package EjercitacionClase.Abstraccion;

/*
 * Realiza las clases correspondientes para demostrar una abstraccion en un sistema de gestion de helados
*/
public class MainEjercicioAbstraccion {
    public static void main(String[] args) {
        Helado miHelado1 = new Cucurucho();
        miHelado1.crearSabor("Chocolate");

        Helado miHelado2 = new Pote();
        miHelado2.crearSabor("Vainilla");
    }
}