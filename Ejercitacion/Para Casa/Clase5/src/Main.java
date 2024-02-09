public class Main {
    public static void main(String[] args) {
//---------------------------------//
//          Inicio Fraccion        //
//---------------------------------//
/**
 * 4)	Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
 * métodos pueden ser invierte, simplifica, multiplica, divide, etc.
  */
        System.out.println("//---------------------------------//");
        System.out.println("//        Inicio Fraccion          //");
        System.out.println("//---------------------------------//");

        System.out.println("Creo la fraccion 4/2");
        Fraccion fraccion1 = new Fraccion(4,2);
        System.out.println("la fraccion es: " + fraccion1);

        System.out.println("Creo la fraccion 4/0");
        Fraccion fraccion2 = new Fraccion(4,0);

        System.out.println("Invierto la fraccion 4/2");
        fraccion1.invierte();
        System.out.println("la fraccion es: " + fraccion1);

        System.out.println("Simplifico la fraccion 4/2");
        fraccion1.simplifica();
        System.out.println("la fraccion 4/2 simplificada es: " + fraccion1);


        fraccion2 = new Fraccion(2,4);
        System.out.println("Multiplico la fraccion " + fraccion1 + " por " + fraccion2);
        System.out.println("La fraccion:4/2 multiplicada por la fraccion: 2/4 es: " + fraccion1.multiplica(fraccion2));

        System.out.println("//---------------------------------//");
        System.out.println("//         Fin Fraccion            //");
        System.out.println("//---------------------------------//");

//---------------------------------//
//             Fin Fraccion        //
//---------------------------------//

//---------------------------------//
//          Inicio Pizza           //
//---------------------------------//
/**
 * Sobre cada pizza se necesita saber el tamaño - mediana o familiar - el tipo - margarita,
 * cuatro quesos o funghi - y su estado - pedida o servida. La clase debe almacenar información sobre el
 * número total de pizzas que se han pedido y que se han servido. Siempre que se crea una pizza nueva,
 * su estado es “pedida”.
 */
    System.out.println("//---------------------------------//");
    System.out.println("//          Inicio Pizza           //");
    System.out.println("//---------------------------------//");
    System.out.println(" ");
    System.out.println("Encargo pizzas");
    Pizza miPizza1 = new Pizza("mediana","cuatro quesos");
    Pizza miPizza2 = new Pizza("familiar","margarita");

    System.out.println(miPizza1);
    System.out.println(miPizza2);
    System.out.println("Pizzas encargadas: " + Pizza.totalPizzasPedidas);
    System.out.println("Pizzas servidas: " + Pizza.totalPizzasServidas);

    System.out.println(" ");

    System.out.println("Sirvo la Pizza2");
    miPizza2.ServirPizza();
    System.out.println(miPizza2);
    System.out.println("Pizzas encargadas: " + Pizza.totalPizzasPedidas);
    System.out.println("Pizzas servidas: " + Pizza.totalPizzasServidas);
    System.out.println(" ");
    System.out.println("//---------------------------------//");
    System.out.println("//           Fin Pizza             //");
    System.out.println("//---------------------------------//");

//---------------------------------//
//          Fin Pizza              //
//---------------------------------//
    }
}