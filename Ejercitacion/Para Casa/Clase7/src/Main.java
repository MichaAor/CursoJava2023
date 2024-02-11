import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        simuladorVehiculos();
        gestionDeProyectos();
    }

    public static void simuladorVehiculos() {
        System.out.println("//-----------------------------------//");
        System.out.println("//---Simulador de vehiculos INICIO---//");
        System.out.println("//-----------------------------------//");

        //Creo vehiculo de carga
        VehiculoCarga miVehiculoCarga = new VehiculoCarga("OGG234", 10);

        //Creo vehiculo de remolque
        Remolque miRemolque = new Remolque("ABC123", 50, 10000);
        miVehiculoCarga.ponRemolque(miRemolque);

        //Creo vehiculo particular
        VehiculoParticular miVehiculoParticular = new VehiculoParticular("AXN234", 43, 4);

        //Muestro informacion de los vehiculos
        System.out.println("Mi vehiculo particular: " + miVehiculoParticular);
        System.out.println("Mi vehiculo carga: " + miVehiculoCarga);

        // Acelero vehiculo de carga con remolque
        miVehiculoCarga.acerlerar(101);
        System.out.println("//--------------------------------//");
        System.out.println("//---Simulador de vehiculos FIN---//");
        System.out.println("//--------------------------------//");

    }
    public static void gestionDeProyectos() {
        System.out.println("//----------------------------------------//");
        System.out.println("//-Sistema de Gesiton de proyectos INICIO-//");
        System.out.println("//----------------------------------------//");

        System.out.println("//-----------------------------------------//");
        System.out.println("//---Sistema de Gesiton de proyectos FIN---//");
        System.out.println("//-----------------------------------------//");
    }
}
