package codigoDeClase.ejemploStaticyNonStatic;

//! Bloques, métodos y atributos STATIC
public class DemoStatic {
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

//! Método STATIC (main!!)    
    public static void main(String[] args){
        System.out.println("Valor de atrST: " + atrSt);
        System.out.println("Desde main");
    }
}
