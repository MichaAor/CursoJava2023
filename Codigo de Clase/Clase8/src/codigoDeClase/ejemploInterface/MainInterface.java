package codigoDeClase.ejemploInterface;

// *Simulación de evento.
public class MainInterface {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// *Una persona elige un auto
        FabricanteDeVehiculos fabricanteDeAutos = new FabricaDeAutos();
        String auto = fabricanteDeAutos.fabricar();
        System.out.println("¡La persona tiene un auto! " + auto);

// * Otra persona elige una bicicleta
        FabricanteDeVehiculos fabricanteDeBicicletas = new FabricaDeBicicletas();
        String bicicleta = fabricanteDeBicicletas.fabricar();
        System.out.println("¡La otra persona tiene una bicicleta! " + bicicleta);
    }    
}
