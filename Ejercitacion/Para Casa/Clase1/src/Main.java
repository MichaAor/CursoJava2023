public class Main {
    /*
    ! Clase1
    ! Temas
    !Introducción a Java.
    !Estructura y Componentes de Proyecto.
    !Buenas Prácticas de Codificación en Java.
    !Variables.
    !Manejo de Cadenas de Texto [Clase String].

    ?Ejercicios
    ?1)Explica con tus propias palabras por qué JAVA es un lenguaje de programación distinto a los demás.
    *Java es un lenguaje de programación orientado a objetos fuertemente tipado, lo que lo diferencia de otros lenguajes es su robustez y su adaptabilidad a diferentes entornos gracias a la java virtual machine.

    ?2)¿Nuestro proyecto JAVA es dependiente de algún sistema operativo en particular? Justifica.
    *No, ya que la JVM proporciona el entorno adecuado para su utilizacion en diferentes sistemas operativos


    ?3)¿Cuál es la principal diferencia entre las variables ‘primitivas’ y ‘de referencia’?
    *La diferencia entre ambas es que las variables primitivas son datos que se guardan en memoria, ocupan poco espacio, y las variables de referencia son clases que ofrecen diferentes métodos para trabajar con ellas, por ejemplo int (primitiva) -Integer (de referencia) que permite utilizar métodos como suma, compare to, etc.

    ?4)Enumera 3 proyectos en los que propondría JAVA para llevar a cabo su desarrollo.
    *-app homebanking
    *-app para control de pagos de gimnasio
    *-app para puntos de venta de supermercados (omnicanal)
    */
    public static void main(String[] args) {
        ej5();
    }
    
//?5)Arregla este  ‘Haiku (Recuerda poner el título con algún color que te guste) y disfruta el mensaje’:
//?“Dev Haiku.C0dig0 danz4, err0res 3nseñan,desarr0ll0 av4nza, l1neas traz4n.Desafi0s emergen, cima de saber,ideas brot4n, jardin del aprender.En binari0, crece, pr0gram4 el ser.”
    public static void ej5(){
        String original = "Dev Haiku.C0dig0 danz4, err0res 3nseñan,desarr0ll0 av4nza, l1neas traz4n.Desafi0s emergen, cima de saber,ideas brot4n, jardin del aprender.En binari0, crece, pr0gram4 el ser.";
        String corregido;

        //?--Pasos para arreglar la cadena:
        //**1. Convertir toda la cadena a mayusculas
        corregido = original.toUpperCase();
        //*2. Reemplazar 0 por O.
        corregido = corregido.replace('0','O');
        //*3. Reemplazar 1 por I.
        corregido = corregido.replace('1','I');
        //*4. Reemplazar 4 por A.
        corregido = corregido.replace('4','A');
        //*5. Reemplazar 3 por A.
        corregido = corregido.replace('3','E');
        System.out.println("La cadena corregida es: " + "\033[32m" + "'" + corregido + "'" + "\u001B[0m");
    }

    //Observacion: Excelente organizacion, te animas a formatear el Haiku para que sea mas legible?
}