package codigoDeClase.Abstraccion;

//? Abstraemos las particulares de un vehiculo para aplicarlo en diversos usos.
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
