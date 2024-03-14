package codigoDeClase.ejemploInterface.EjSimple;

public class OtraClase implements EjOtraInterfaz{
// * Acceso a la variable de la Super Interfaz.
    void imprimirConstante(){
        System.out.println("\033[36m" + "║  VALOR DE VARIABLE DE INTERFAZ: " + VALOR_CONSTANTE + "║" + "\u001B[0m");
    }


    @Override
    public void metodoAbstracto() {

    }
}
