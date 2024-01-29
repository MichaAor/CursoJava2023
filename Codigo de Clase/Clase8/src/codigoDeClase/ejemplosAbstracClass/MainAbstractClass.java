package codigoDeClase.ejemplosAbstracClass;

public class MainAbstractClass {
    public static void main(String[] args) {
        Caballero caballero = new Caballero();
        System.out.println(caballero.mostrarEstadisticas());

        Mago mago = new Mago();

        caballero.atacar(mago);

        System.out.println(mago.mostrarEstadisticas());
    }
}