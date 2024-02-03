package EjercitacionClase;

public class EjerciciosClase {
    public static void main(String[] args) {
      /*
       *                                        //-- EJERCITACION DE CLASE --//
       *REALIZAR CADA EJERCICIO CON SU CORRESPONDIENTE DOCUMENTACION Y DEMOSTRAR LOS RESULTADOS
       *  DE MANERA PROLIJA EN LA CONSOLA
       *
       *1) Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
       *    descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
       *    total teniendo en cuenta el precio unitario y cantidad. Un método que permita
       *    imprimir por pantalla los atributos del objeto de la siguiente forma:
       *    ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
       *        a. Inicialice el objeto con los atributos necesarios
       *        b. Imprima por pantalla el objeto inicializado.
       *
       *2) Modele el objeto que representa la cuenta de un banco, con identificador, nombre
       *    y balance. Considere los getters, setters y constructores necesarios. Tenga en
       *    cuenta los siguientes métodos.
       *        a. El método crédito que representa un depósito de dinero en la cuenta. Este
       *            método debe devolver el balance luego de la operación.
       *        b. El método débito que representa una sustracción de dinero de la cuenta.
       *            Este método debe devolver el balance luego de la operación. Si el dinero en
       *            la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por pantalla un aviso.
       *        c. Un método que imprima por pantalla las características del objeto.
       * Realice las siguientes operaciones:
       *    1. Inicialice una cuenta con un monto inicial de 15000.
       *    2. Realice una operación de crédito de 2500.
       *    3. Realice una operación de compra de 1500.
       *    4. Realice una operación de compra de 30000.
       *    5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea correcto.
       *
       *3) Realice una clase 'Producto' que contenga los atributos:
       *    -nombre
       *    -precioVenta
       *    -costoCompra
       *    -stock
       *    -totalVendido
       *    -CantidadVendida
       * y realizar los metodos correspondientes para demostrar las siguientes estadisticas a traves del metodo toString():
       *  -Nombre
       *  -Precio
       *  -Stock disponible
       *  -TotalVendido
       *  -Balance (Solo con positivo o negativo)
       *  -Unidades Vendidas.
       *
       *  Instanciar 3 productos y demostrar cual es el mas Rentable, no olvidarse de utilizar static cuando corresponda.
       */

//---------------------------------//
//      Inicio Item de Venta       //
//---------------------------------//
/**
 *1) Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
 *    descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
 *    total teniendo en cuenta el precio unitario y cantidad. Un método que permita
 *    imprimir por pantalla los atributos del objeto de la siguiente forma:
 *    ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
 *        a. Inicialice el objeto con los atributos necesarios
 *        b. Imprima por pantalla el objeto inicializado.
 *
 */

  ItemVenta item = new ItemVenta(1,"papel higienico", 100,3450);
  System.out.println(item);

//---------------------------------//
//        Fin Item de Venta        //
//---------------------------------//

//---------------------------------//
//      Inicio Cuenta Banco        //
//---------------------------------//
/**
 *2) Modele el objeto que representa la cuenta de un banco, con identificador, nombre
 *    y balance. Considere los getters, setters y constructores necesarios. Tenga en
 *    cuenta los siguientes métodos.
 *        a. El método crédito que representa un depósito de dinero en la cuenta. Este
 *            método debe devolver el balance luego de la operación.
 *        b. El método débito que representa una sustracción de dinero de la cuenta.
 *            Este método debe devolver el balance luego de la operación. Si el dinero en
 *            la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por pantalla un aviso.
 *        c. Un método que imprima por pantalla las características del objeto.
 * Realice las siguientes operaciones:
 *    1. Inicialice una cuenta con un monto inicial de 15000.
 *    2. Realice una operación de crédito de 2500.
 *    3. Realice una operación de compra de 1500.
 *    4. Realice una operación de compra de 30000.
 *    5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea correcto.
 *
 */

  CuentaBanco miCuenta = new CuentaBanco("Cuenta Corriente",1500);
  CuentaBanco miCuenta2 = new CuentaBanco("Cuenta Corriente",1500);
  System.out.println("El balance antes de hacer el deposito es: "+ miCuenta.getBalance());
  float balance = miCuenta.credito(1500);
  System.out.println("El balance despues de hacer el deposito es: "+balance);
  balance = miCuenta.debito(30000);
  System.out.println(miCuenta);
  System.out.println(miCuenta2);
//---------------------------------//
//        Fin Cuenta Banco         //
//---------------------------------//

//---------------------------------//
//      Inicio Clase Producto      //
//---------------------------------//
/**
 *3) Realice una clase 'Producto' que contenga los atributos:
 *    -nombre
 *    -precioVenta
 *    -costoCompra
 *    -stock
 *    -totalVendido
 *    -CantidadVendida
 * y realizar los metodos correspondientes para demostrar las siguientes estadisticas a traves del
 * metodo toString():
 *  -Nombre
 *  -Precio
 *  -Stock disponible
 *  -TotalVendido
 *  -Balance (Solo con positivo o negativo)
 *  -Unidades Vendidas.
 *
 *  Instanciar 3 productos y demostrar cual es el mas Rentable, no olvidarse de utilizar static
 *  cuando corresponda.
 *
 */
  System.out.println("/====================================/");
  System.out.println("/= Inicio ejercicio: Clase Producto =/");
  System.out.println("/====================================/");
  float gananciaProducto1 = 0f;
  float gananciaProducto2 = 0f;
  float gananciaProducto3 = 0f;

  Producto product1 = new Producto("Galletitas",2135,135,40,46000,23);
  Producto product2 = new Producto("Pañales",33335,300,140,1675,5);
  Producto product3 = new Producto("Zapatos",535,230,250,4815,9);


  if (!(product1.venderProducto(30) )) {
        System.out.println("Venta de " + product1.getNombre() + ": SIN Stock");
      } else {
        System.out.println("Venta de " + product1.getNombre() + " OK");
  }



      if (!(product2.venderProducto(640) )) {
        System.out.println("Venta de " + product2.getNombre() + ": SIN Stock");
      } else {
        System.out.println("Venta de " + product2.getNombre() + " OK");
      }
  System.out.println(product1);
  System.out.println(product2);
  System.out.println(product3);
  gananciaProducto1 =  product1.cantidadVendida * (product1.precioVenta-product1.costoCompra);
  gananciaProducto2 =  product2.cantidadVendida * (product2.precioVenta-product2.costoCompra);
  gananciaProducto3 =  product3.cantidadVendida * (product3.precioVenta-product3.costoCompra);



  if(gananciaProducto1 > gananciaProducto2 && gananciaProducto1 > gananciaProducto3){
    System.out.println("El producto mas rentable fue: " + product1.nombre);
  } else if (gananciaProducto2 > gananciaProducto1 && gananciaProducto2 > gananciaProducto3) {
    System.out.println("El producto mas rentable fue: " + product2.nombre);
  } else {
    System.out.println("El producto mas rentable fue: " + product3.nombre);
  }
  System.out.println("/=================================/");
  System.out.println("/= Fin ejercicio: Clase Producto =/");
  System.out.println("/=================================/");

//---------------------------------//
//        Fin Clase Producto       //
//---------------------------------//

    }
}