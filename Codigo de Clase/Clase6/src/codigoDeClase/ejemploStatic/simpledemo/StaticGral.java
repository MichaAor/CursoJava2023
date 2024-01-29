package codigoDeClase.ejemploStatic.simpledemo;

//! Bloques, métodos y atributos STATIC
public class StaticGral {
//? Atributo STATIC    
    static int atrSt = metSt();

//? Bloque STATIC
    static{
        System.out.println("Dentro del bloque estático");
    }

//? Método STATIC    
    static int metSt(){
        System.out.println("Desde metSt");
    return 8;
    }
}
