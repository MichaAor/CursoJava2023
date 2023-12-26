import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** 1.	Realizar un algoritmo que permita calcular el índice de masa corporal de una
         *      persona ingresando sus valores del peso y la altura*/


        System.out.print("Ejercicio Masa Corporal");
        System.out.print("\033[33m" + "\nIngrese Peso: " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String cadenaPeso = scannerBasic.next();
        float peso = Float.parseFloat(cadenaPeso);
        System.out.print("\033[33m" + "\nIngrese Altura: " + "\u001B[0m");
        String cadenaAltura = scannerBasic.next();
        cadenaAltura = cadenaAltura.replace(',','.');
        float altura = Float.parseFloat(cadenaAltura);
        float masaCorporal = peso / altura;
        if (masaCorporal < 20) {
            System.out.println("MC = " + masaCorporal + " mal estado");
        } else if (masaCorporal >= 20 && masaCorporal < 22) {
            System.out.println("MC = " + masaCorporal + " bajo de peso");
        } else if (masaCorporal >= 22 && masaCorporal < 25) {
            System.out.println("MC = " + masaCorporal + " peso normal");
        } else if (masaCorporal >= 25 && masaCorporal < 30) {
            System.out.println("MC = " + masaCorporal + " Sobrepeso");
        } else if (masaCorporal >= 30 && masaCorporal < 40) {
            System.out.println("MC = " + masaCorporal + " Sobrepeso Cronico");
        }  else if (masaCorporal >= 40) {
            System.out.println("MC = " + masaCorporal + " Hospitalizado");
        }
    }
}