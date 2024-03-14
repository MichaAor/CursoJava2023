package EjercitacionClase.Abstraccion;

public class Pote implements Helado{
    String sabor;
    public void crearSabor (String saborHelado){
        sabor = saborHelado;
        System.out.println("Pote de sabor: " + saborHelado);
    }
}
