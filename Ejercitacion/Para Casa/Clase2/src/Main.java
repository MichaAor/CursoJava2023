import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       // ej1();
       //ej2();
       ej3();
    }
      
      /*
       * Clase2
       * Temas
       * Operadores.
       * Flujos de Control.
       * Wrapper.
       * Ejercicios
       * Clasifica y menciona al menos 2 ejemplos de Operadores.
       * operadores aritméticos: +,-,*,/
       * operadores logicos: &,!,||
       * 
       * ¿Cual es la principal diferencia entre las sentencias ‘if’ y switch?
       * Cuando usamos IF no necesitamos conocer exactamente la cantidad y valor de
       * los casos a evaluar
       * Cuando usamos SWITCH es necesario saber exactamente, la cantidad y los
       * valores de los escenarios a evaluar
       * 
       * Explica con tus palabras el funcionamiento de la estructura de control de
       * iteración ‘foreach’.
       * La estructura for each te permite recorrer un array tomando cada uno se sus
       * elementos.
       * Sirve para cuando no sabes en que posición del array se encuentra el elemento
       * que estás buscando.
       * 
       * 
       * Declara una variable ‘hora’ de tipo ‘int’ y que muestra los buenos días,
       * buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a
       * 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
       * horas, los minutos no se deben usar.
       */
      public static void ej1() {
          int hora = 7;
          String saludar;
          if (hora >= 6 && hora <= 12) {
              saludar = "Buenos días";
          } else if (hora >= 13 && hora <= 20) {
              saludar = "Buenas tardes";
          } else {
              saludar = "Buenas noches";
          }
          System.out.println(saludar);
      }

      public static void ej2() {
          // Realiza un mini cuestionario con 5 preguntas tipo test. Cada pregunta
          // acertada sumará un punto. El programa mostrará al final la calificación
          // obtenida.
          // declaro un scanner para obtener los datos ingresados por el user
          Scanner sc = new Scanner(System.in);

          // hago la pregunta 1
          System.out.println(" De que color es el cielo?");

          // leo la respuesta ingresada por el user
          String respuesta1 = sc.nextLine();
          // paso la respuesta a mayusculas

          // coloco un contador para sumar el puntaje obtenido por respuesta correcta
          int puntos = 0;

          if (respuesta1.equalsIgnoreCase("azul")) {
              System.out.println(" La respuesta es correcta! El cielo es " + respuesta1);
              puntos++;
          } else {
              System.out.println("Respuesta incorrecta! El cielo no es " + respuesta1);
          }
          System.out.println("Usted tiene: " + puntos + " puntos");

          // pregunta 2
          System.out.println(" Cuantas patas tiene un gato?");
          int respuesta2 = sc.nextInt();

          if (respuesta2 == 4) {
              System.out.println(" La respuesta es correcta!, Un gato tiene " + respuesta2 + " patas");
              puntos++;
          } else {
              System.out.println("Respuesta incorrecta! Un gato no tiene " + respuesta2 + " patas");
          }
          System.out.println("Usted tiene: " + puntos + " puntos");

          sc.nextLine();

          // pregunta 3
          System.out.println(" Cual es la capital de Italia?");
          String respuesta3 = sc.nextLine();

          if (respuesta3.equalsIgnoreCase("Roma")) {
              System.out.println(" la respuesta es correcta! La capital de Italia es:  " + respuesta3);
              puntos++;
          } else {
              System.out.println("Respuesta incorrecta! La capital de Italia no es " + respuesta3);
          }
          System.out.println("Usted tiene: " + puntos + " puntos");

          // pregunta 4
          System.out.println(" La capital de Francia es Roma");
          boolean respuesta4 = sc.nextBoolean();

          if (respuesta4 == false) {
              System.out.println(" la respuesta es correcta! La capital de Francia es Paris");
              puntos++;
          } else {
              System.out.println("Respuesta incorrecta! La capital de Francia no es Roma");
          }
          System.out.println("Usted tiene: " + puntos + " puntos");


          // pregunta 5
          System.out.println(" El caballo de san martin era blanco");
          boolean respuesta5 = sc.nextBoolean();

          if (respuesta5 == true) {
              System.out.println(" la respuesta es correcta! El caballo de San Martin era blanco");
              puntos++;
          } else {
              System.out.println("Respuesta incorrecta! El caballo de San Martin era blanco");
          }
          System.out.println("Usted tiene: " + puntos + " puntos");

      }

      public static void ej3() {
        //Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.
        System.out.println(" Ingrese un numero");
        int numero = sc.nextInt();
        int numero2 = numero++;
        int fibonacci = 0;

        fo

    }
}




   
