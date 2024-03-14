package EjercitacionClase.Abstraccion;
public class Cucurucho implements Helado{
    String sabor;
    public void crearSabor (String saborHelado){
        sabor = saborHelado;
        System.out.println("Cucurucho de sabor: " + saborHelado);
    }
}
