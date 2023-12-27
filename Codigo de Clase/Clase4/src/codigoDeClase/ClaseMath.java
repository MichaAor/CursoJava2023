package codigoDeClase;

public class ClaseMath {
    public static void main(String[] args) {

        //OPERACIONES BASICAS
        System.out.println("\033[36m" + "//--OPERACIONES BASICAS--\\" + "\u001B[0m");

            // Método abs: Retorna el valor absoluto de un número
            System.out.println("\033[33m"+"Math.abs"+"\u001B[0m");
            double valorAbsoluto = Math.abs(-15);
            System.out.println("Valor Absoluto: " + valorAbsoluto);

            // Método ceil: Retorna el menor entero más grande que es mayor o igual a un número
            System.out.println("\033[33m"+"\nMath.ceil"+"\u001B[0m");
            double techo = Math.ceil(15.25);
            System.out.println("Techo: " + techo);

            // Método floor: Retorna el mayor entero que es menor o igual a un número
            System.out.println("\033[33m"+"\nMath.floor"+"\u001B[0m");
            double piso = Math.floor(15.75);
            System.out.println("Piso: " + piso);

            // Método max: Retorna el valor máximo entre dos números
            System.out.println("\033[33m"+"\nMath.max"+"\u001B[0m");
            int maximo = Math.max(20, 30);
            System.out.println("Máximo: " + maximo);

            // Método min: Retorna el valor mínimo entre dos números
            System.out.println("\033[33m"+"\nMath.min"+"\u001B[0m");
            int minimo = Math.min(20, 30);
            System.out.println("Mínimo: " + minimo);

            // Método round: Redondea un número al entero más cercano
            System.out.println("\033[33m"+"\nMath.round"+"\u001B[0m");
            long redondeo = Math.round(15.5);
            System.out.println("Redondeo: " + redondeo);

        //POTENCIA Y RAICES
        System.out.println("\033[36m" + "\n//--POTENCIA Y RAICES--\\" + "\u001B[0m");
            // exp(double a): Retorna el valor de Euler elevado a la potencia de un número.
            System.out.println("\033[33m"+"Math.exp"+"\u001B[0m");
            double exponente = 2.5;
            double resultadoExponencial = Math.exp(exponente);
            System.out.println("Exponente: " + exponente);
            System.out.println("Resultado Exponencial: " + resultadoExponencial);

            // log(double a): Retorna el logaritmo natural (base e) de un número.
            System.out.println("\033[33m"+"\nMath.log"+"\u001B[0m");
            double numeroLogaritmo = 10;
            double resultadoLogaritmo = Math.log(numeroLogaritmo);
            System.out.println("Numero Logaritmo: " + numeroLogaritmo);
            System.out.println("Logaritmo Natural: " + resultadoLogaritmo);

            // pow(double base, double exponente): Retorna la potencia de un número.
            System.out.println("\033[33m"+"\nMath.pow"+"\u001B[0m");
            double base = 2;
            double exponentePotencia = 3;
            double resultadoPotencia = Math.pow(base, exponentePotencia);
            System.out.println("Base: " + base);
            System.out.println("Exponente: " + exponentePotencia);
            System.out.println("Potencia: " + resultadoPotencia);

            // sqrt(double a): Retorna la raíz cuadrada de un número.
            System.out.println("\033[33m"+"\nMath.sqrt"+"\u001B[0m");
            double numeroRaiz = 25;
            double resultadoRaizCuadrada = Math.sqrt(numeroRaiz);
            System.out.println("Numero Raiz: " + numeroRaiz);
            System.out.println("Raíz Cuadrada: " + resultadoRaizCuadrada);


        //FUNCIONES TRIGONOMETRICAS
        System.out.println("\033[36m" + "\n//--FUNCIONES TRIGONOMETRICAS--\\" + "\u001B[0m");

            //Metodo toRadians: Convertierte a radianes
            System.out.println("\033[33m"+"Math.toRadians"+"\u001B[0m");
            int grados = 45;
            System.out.println("Grados:" + grados);
            double anguloRad = Math.toRadians(grados); //
            System.out.println("Grados en Radianes: " + anguloRad);

            //Metodo sin: Obtiene el seno del angulo en radianes
            System.out.println("\033[33m"+"\nMath.sin"+"\u001B[0m");
            double seno = Math.sin(anguloRad);
            System.out.println("Seno: " + seno);

            //Metodo cos: Obtiene el coseno del angulo en radianes
            System.out.println("\033[33m"+"\nMath.cos"+"\u001B[0m");
            double coseno = Math.cos(anguloRad);
            System.out.println("Seno: " + coseno);

            //Metodo tan: Obtiene la tangente del angulo en radianes
            System.out.println("\033[33m"+"\nMath.tan"+"\u001B[0m");
            double tangente = Math.tan(anguloRad);
            System.out.println("Tangente: " + tangente);


        //RANDOM
            //Método random(): Retorna un número pseudoaleatorio entre 0.0 (inclusive) y 1.0 (exclusivo).
            System.out.println("\033[36m" + "\n//--RANDOM--\\" + "\u001B[0m");
            double numeroAleatorio = Math.random();
            System.out.println("Número Aleatorio: " + numeroAleatorio);
    }
}