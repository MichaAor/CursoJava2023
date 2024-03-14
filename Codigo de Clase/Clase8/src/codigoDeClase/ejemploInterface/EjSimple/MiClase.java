package codigoDeClase.ejemploInterface.EjSimple;

public class MiClase implements EjMiInterfaz{
/*
? Uso de variables
*   Las implementaciones de la interfaz deben respetar las restricciones.
*   Ademas de utilizar las variables como constantes.
*/
void imprimirConstanteInterfaz(){
    System.out.println("\033[36m" + "║  VALOR DE VARIABLE DE INTERFAZ: " + VALOR_CONSTANTE + "║" + "\u001B[0m");
}


//? Implementacion de Metodos
    @Override
    public void metodoAbstracto() {
        System.out.println("\033[36m" + "╔════════════════════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  METODO ABSTRACTO IMPLEMENTADO EN MiClase  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚════════════════════════════════════════════╝" + "\u001B[0m");
    }

//? La clase puede optar por sobrescribir o no le metodoDefault / preterminado.Aunque no es obligatorio.

}
