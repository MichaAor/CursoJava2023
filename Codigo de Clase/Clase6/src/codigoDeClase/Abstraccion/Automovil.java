package codigoDeClase.Abstraccion;

public class Automovil implements Vehiculo{
    @Override
    public void acelerar() {
        System.out.println("Acelerar");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar");
    }
}
