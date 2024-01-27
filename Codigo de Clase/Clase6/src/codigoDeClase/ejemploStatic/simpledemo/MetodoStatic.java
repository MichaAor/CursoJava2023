package codigoDeClase.ejemploStatic.simpledemo;

public class MetodoStatic {
//! Método estático
        public static void metodoEstatico() {
            System.out.println("¡Este es un método estático!");
        }
    
//! Método no estático
        public void metodoNoEstatico() {
            System.out.println("¡Este es un método no estático!");
        }
    
        public static void main(String[] args) {
//? Llamando a un método estático
            MetodoStatic.metodoEstatico();
    
//* Creando una instancia de la clase
            MetodoStatic ejemplo = new MetodoStatic();
    
//? Llamando a un método no estático a través de la instancia
            ejemplo.metodoNoEstatico();
        }
}
