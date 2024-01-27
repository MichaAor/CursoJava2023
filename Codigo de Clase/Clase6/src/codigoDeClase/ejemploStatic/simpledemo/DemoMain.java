package codigoDeClase.ejemploStatic.simpledemo;

public class DemoMain {
//! Método STATIC (main!!)
    public static void main(String[] args){
//? Ejemplo DemoStaticGral
        System.out.println("Valor de atrST: " + StaticGral.atrSt);
        System.out.println("Desde main");

//? Ejemplo DemoMetodoStatic
// *Ejemplo metodo static
        MetodoStatic.metodoEstatico();

// *Ejemplo metodo no static
        MetodoStatic instancia = new MetodoStatic();
        instancia.metodoNoEstatico();
    }
}
