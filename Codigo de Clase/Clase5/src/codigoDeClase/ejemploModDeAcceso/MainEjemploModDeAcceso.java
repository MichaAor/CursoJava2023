package codigoDeClase.ejemploModDeAcceso;

public class MainEjemploModDeAcceso {
    public static void main(String[] args) {
//-----------------Ejemplo POO COMPLETO-----------------//
        System.out.println("\033[36m" + "//--EJEMPLO POO COMPLETO--//" + "\u001B[0m");

        //Instancia creda junto a la declaracion para un uso y relleno rapido.
        Medico medico = new Medico("Jorgelio","Banquito","145151547547");

        //Mostramos su saludo.
        System.out.println("\033[32m" + "--Instancia 'medico' saluda--" + "\u001B[0m");
        medico.saludar();

        //Mostramos la instancia con su metodo toString().
        System.out.println("\033[32m" + "\n--Instancia 'medico' se muestra con .toString()--" + "\u001B[0m");
        System.out.println("\033[36m" + medico.toString() + "\u001B[0m"); //no es obligatorio poner .toString();
    }
}