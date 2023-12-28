import java.util.Scanner;

public class ImcCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso en kg: ");
        Float peso = scanner.nextFloat();

        System.out.print("Ingrese la altura en metros: ");
        Float altura = scanner.nextFloat();

        Float imc = peso / (altura * altura);

        if (imc < 20) {
            System.out.println("Mal Estado");
        } else if (imc >= 20 && imc <= 22) {
            System.out.println("Bajo de Peso");
        } else if (imc > 22 && imc <= 25) {
            System.out.println("Peso Normal");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc > 30 && imc <= 40) {
            System.out.println("Sobrepeso Crónico");
        } else {
            System.out.println("Hospitalizado");
        }
//Ser mas declarativo con las partes de nuestro Runneable.
//Titular los ejercicios para luego mostrar todo junto.
//Codigo limpio y ordenado, bien hecho!!
    }
}
