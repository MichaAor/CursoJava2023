package codigoDeClase;

public class ClasesWrapper {
    public static void main(String[] args) {
    //WRAPPER CLASSES
    // Autoboxing: convirtiendo tipos primitivos en objetos (clases envolventes)
        Integer enteroObjeto = Integer.valueOf(42);
        Double decimalObjeto = Double.valueOf(3.14);
        Character caracterObjeto = Character.valueOf('A');
        Boolean booleanoObjeto = Boolean.valueOf(true);

        System.out.println("\033[32m"+"\n//--AUTOBOXING--//"+"\u001B[0m");
        System.out.println("Integer Objeto: " + enteroObjeto);
        System.out.println("Double Objeto: " + decimalObjeto);
        System.out.println("Character Objeto: " + caracterObjeto);
        System.out.println("Boolean Objeto: " + booleanoObjeto);

    // Unboxing: convirtiendo objetos en tipos primitivos
        int enteroPrimitivo = enteroObjeto.intValue();
        double decimalPrimitivo = decimalObjeto.doubleValue();
        char caracterPrimitivo = caracterObjeto.charValue();
        boolean booleanoPrimitivo = booleanoObjeto.booleanValue();

        System.out.println("\033[32m"+"\n//--UNBOXING--//"+"\u001B[0m");
        System.out.println("Integer Primitivo: " + enteroPrimitivo);
        System.out.println("Double Primitivo: " + decimalPrimitivo);
        System.out.println("Character Primitivo: " + caracterPrimitivo);
        System.out.println("Boolean Primitivo: " + booleanoPrimitivo);

    // Parsing: convirtiendo cadenas a tipos primitivos o clases envolventes
        System.out.println("\033[32m"+"\n//--PARSING--//"+"\u001B[0m");
        String numeroComoCadena = "123";
        int numeroDesdeCadena = Integer.parseInt(numeroComoCadena);
        System.out.println("Parsing: Convertir cadena a entero -> " + numeroDesdeCadena);

    // Comparación de objetos envolventes
        System.out.println("\033[32m"+"\n//--COMPARACION DE WRAPPERS--//"+"\u001B[0m");
        Integer primero = 5;
        Integer segundo = 10;
        int resultadoComparacion = primero.compareTo(segundo);
        System.out.println("Resultado de la comparación: " + resultadoComparacion);
    }
}