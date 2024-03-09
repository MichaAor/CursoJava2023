package EjercitacionClase.Ejercicio2;

public class EjerciciosClase {
    public static void main(String[] args) {
 /*
!                                        //-- EJERCITACION DE CLASE --//
!  REALIZAR CADA EJERCICIO CON SU CORRESPONDIENTE DOCUMENTACIÓN Y DEMOSTRAR LOS RESULTADOS
!   DE MANERA PROLIJA EN LA CONSOLA

? 2)  Galería de Arte con Subastas y Colecciones
? Amplía el sistema de gestión de figuras artísticas en una galería para incluir subastas y colecciones.
? a) Modifica la clase ObraDeArte para incluir atributos como estilo y periodoArtístico.
? b) Define un método abstracto adicional exponer() en la clase ObraDeArte para simular 
?   la exposición de la obra en una galería.
? c) Crea una clase abstracta llamada Subasta que tenga atributos como obraEnSubasta, 
?   pujaActual, y pujadorActual.
? d) Define métodos abstractos como iniciarSubasta() y cerrarSubasta() en la clase Subasta.
? e) Implementa subclases concretas como SubastaPresencial y SubastaVirtual que hereden de la clase Subasta.
? f) En el programa principal, crea instancias de obras de arte, organiza subastas y muestra información 
?   sobre las colecciones y subastas.
*/
        Subasta miSubastaPresencial = new SubastaPresencial();
        ObraDeArte miObraDeArte = new Cuadro();
        miObraDeArte.setEstilo("Renacentista");
        miObraDeArte.setPeriodoArtístico("1800 1801");

        miSubastaPresencial.setObraEnSubasta(miObraDeArte);

        miSubastaPresencial.iniciarSubasta();
        miSubastaPresencial.setPujadorActual("Juan Cortez");
        miSubastaPresencial.setPujaActual("Puja 1");

        miSubastaPresencial.setPujadorActual("Ernesto Rodriguez");
        miSubastaPresencial.setPujaActual("Puja 2");

        miSubastaPresencial.cerrarSubasta();

        System.out.println("Informacion sobre subasta:" + miSubastaPresencial.toString());

    }
}