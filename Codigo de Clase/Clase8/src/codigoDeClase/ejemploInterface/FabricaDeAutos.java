package codigoDeClase.ejemploInterface;

//? Fábrica que fabrica autos
class FabricaDeAutos implements FabricanteDeVehiculos {
    @Override
    public String fabricar() {
        return "Auto";
    }
}