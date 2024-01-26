
//! EJEMPLO INSTANCIACIÓN A TRAVES DE INTERFAZ

//? Interfaz que define un fabricante simple de vehículos
interface FabricanteDeVehiculos {
    String fabricar();
}

//? Fábrica que fabrica autos
class FabricaDeAutos implements FabricanteDeVehiculos {
    @Override
    public String fabricar() {
        return "Auto";
    }
}

//? Fábrica que fabrica bicicletas
class FabricaDeBicicletas implements FabricanteDeVehiculos {
    @Override
    public String fabricar() {
        return "Bicicleta";
    }

//* Simulación de evento.
public class Concesionario {

    public static void main(String[] args) {
//* Una persona elige un auto
        FabricanteDeVehiculos fabricanteDeAutos = new FabricaDeAutos();
        String auto = fabricanteDeAutos.fabricar();
        System.out.println("¡La persona tiene un auto! " + auto);

//* Otra persona elige una bicicleta
        FabricanteDeVehiculos fabricanteDeBicicletas = new FabricaDeBicicletas();
        String bicicleta = fabricanteDeBicicletas.fabricar();
        System.out.println("¡La otra persona tiene una bicicleta! " + bicicleta);
    }
}
}

