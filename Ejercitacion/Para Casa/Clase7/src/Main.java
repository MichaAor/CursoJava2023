import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/**
 * 6)	Construya un simulador de Vehículos, con las siguientes características, tomando en cuenta que existen
 *      dos tipos de Vehículo: particular y carga.
 * a)	Sus características comunes son la matrícula y la velocidad. En el momento de crearlos, la matrícula
 *      se recibe por parámetro y la velocidad se inicializa a 0. El método toString() de los vehículos devuelve
 *      información acerca de la matrícula y la velocidad. Además se pueden acelerar, pasando por parámetro la
 *      cantidad en km/h que se tiene que acelerar.
 * b)	Los vehículos particulares tienen además un atributo para el número de puertas, que se recibe también
 *      por parámetro en el momento de crearlo., tiene además un método que devuelve el número de puertas.
 * c)	Los vehículos de carga tienen un atributo de tipo Remolque que inicializa a null (para indicar que
 *      no tiene un remolque). Además, tiene un método ponRemolque(), que recibe el Remolque por parámetro,
 *      y otro quitaRemolque(). Cuando se muestre la información de un camión que lleve remolque, además de
 *      la matrícula y velocidad, debe aparecer la información del remolque.
 * d)	En esta clase, hay que sobreescribir el método acelerar de manera que si el vehículo de carga tiene
 *      remolque y la velocidad más la aceleración superan los 100 km/h, se lance un mensaje.
 * e)	Hay que implementar la clase Remolque. Esta clase tiene un atributo de tipo entero que es el peso y
 *      cuyo valor se le da en el momento de crear el objeto. Debe tener un método toString() que devuelva la
 *      información del remolque.
  */

        VehiculoCarga miVehiculoCarga = new VehiculoCarga("OGG234",10);
        Remolque miRemolque = new Remolque("ABC123",50,1);
        miVehiculoCarga.ponRemolque(miRemolque);

        VehiculoParticular miVehiculoParticular = new VehiculoParticular("AXN234",43,4);

        System.out.println("Mi vehiculo particular: " + miVehiculoParticular);
        System.out.println("Mi vechiculo carga: "+ miVehiculoCarga);
    }
}