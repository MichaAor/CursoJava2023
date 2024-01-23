package codigoDeClase.ejemploStaticyNonStatic;

public class DemoMetoStatic {
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
            DemoMetoStatic.metodoEstatico();
    
//* Creando una instancia de la clase
            DemoMetoStatic ejemplo = new DemoMetoStatic();
    
//? Llamando a un método no estático a través de la instancia
            ejemplo.metodoNoEstatico();
        }
}
