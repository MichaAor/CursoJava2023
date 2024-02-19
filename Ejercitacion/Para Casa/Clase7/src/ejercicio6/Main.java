package ejercicio6;

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
        Remolque miRemolque = new Remolque("ABC123", 50);
        miRemolque.setTipoRemolque(1);
        miVehiculoCarga.ponRemolque(miRemolque);

        //Creo vehiculo particular
        VehiculoParticular miVehiculoParticular = new VehiculoParticular("AXN234", 43, 4);

        //Muestro informacion de los vehiculos
        System.out.println("Mi vehiculo particular: " + miVehiculoParticular);
        System.out.println("Mi vehiculo carga: " + miVehiculoCarga);

        // Acelero vehiculo de carga con remolque
        System.out.println("Acelero el vehiculo de carga en 75 unidades");
        miVehiculoCarga.acerlerar(75);
        System.out.println("Mi vehiculo carga: " + miVehiculoCarga);

        System.out.println("Acelero el vehiculo de carga en 25 unidades");
        miVehiculoCarga.acerlerar(25);
        System.out.println("Mi vehiculo carga: " + miVehiculoCarga);


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
/*
    ╔═════════════════╗
    ║  Observaciones  ║
    ╚═════════════════╝
* Ejercicio 6
    + Buena organizacion y presentacion, se puede mejorar en las clases representantes.

    ? El formato del toString puede mejorarse.
    ? Cuidado con el metodo acelerar del ejercicio6.VehiculoCarga, ya que es poco explicito y declarativo.

    ! Cuidado con la interpretacion de las caracteristicas que se piden.
    ! Se debe ser explicito con la encapsulacion de los miembros.
    ! ejercicio6.Remolque como tal no es ni posee las caracteristicas de un ejercicio6.Vehiculo, cuidado con la definicion de atributos.
    ! ejercicio6.Remolque no cumple con lo pedido.

* Ejercicio 7
    + Buena organizacion y presentacion, se puede mejorar en las clases representantes.

    ? Se nota la falta de metodos para la administracion del sistema.
    ? Me gusta la cantidad de atributos representativos que tiene el proyecto,aunque podrian derivarse.
    ? Se puede optimizar aun mas?

    ! Es extranio que PM este repetido en 2 clases. Habra una buena razon?

*/