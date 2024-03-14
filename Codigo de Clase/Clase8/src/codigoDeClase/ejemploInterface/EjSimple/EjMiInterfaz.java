package codigoDeClase.ejemploInterface.EjSimple;
//! EJEMPLO COMPLETO
public interface EjMiInterfaz {
/*
? Declaracion de Variables
*   Las variables en interfaces deben ser declaradas como publicas, estaticas y finales.
*   Se definen automaticamente como constantes y no pueden modificarse despues de la inicializacion.
*/
    int VALOR_CONSTANTE = 10;

//? Declaracion de Metodos
// * Metodo Abstracto
    void metodoAbstracto();

// * Metodo Default
    default void metodoDefault(){
        System.out.println("Metodo Default de MiInterfaz");
        System.out.println("\033[36m" + "╔═════════════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  METODO PRETERMINADO DE MiInterfaz  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═════════════════════════════════════╝" + "\u001B[0m");
    }
// * Metodo Static
    static void metodoEstatico(){
        System.out.println("Metodo Estatico de MiInterfaz");
        System.out.println("\033[36m" + "╔═════════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  METODO ESTATICO DE MiInterfaz  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═════════════════════════════════╝" + "\u001B[0m");
    }
}
