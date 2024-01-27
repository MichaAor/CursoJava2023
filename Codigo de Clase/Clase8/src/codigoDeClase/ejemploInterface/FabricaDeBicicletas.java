package codigoDeClase.ejemploInterface;

//? Fábrica que fabrica bicicletas
class FabricaDeBicicletas implements FabricanteDeVehiculos {
    @Override
    public String fabricar() {
        return "Bicicleta";
    }
}