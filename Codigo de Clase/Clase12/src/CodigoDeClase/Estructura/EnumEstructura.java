package CodigoDeClase.Estructura;
/*
?                       ╔═══════════════════╗
?                       ║  ENUM ESTRUCTURA  ║
?                       ╚═══════════════════╝
! ColorPri:
*   Es un enumerado simple declarado fuera de cualquier clase.
*   Contiene valores constantes ROJO, AMARILLO y AZUL.

! Size:
*   Es un enumerado con cuerpo que contiene métodos, atributos y un constructor.
*   Cada valor (PEQUENIO, MEDIANO, GRANDE) tiene un atributo codigo y un método getCodigo()
*       que devuelve dicho atributo.

! EnumEstructura:
*   Es una clase que contiene dos enumerados dentro de ella:
!   ColorSec:
*       Es un enumerado simple dentro de la clase EnumEstructura con valores NARANJA, VERDE y MORADO.
!   Tamanio:
*       Es un enumerado simple dentro de la clase EnumEstructura con valores PEQUE, MEDI y GRANDE.
*/

//? Declaracion Fuera
enum ColorPri{
    ROJO,AMARILLO,AZUL
}

//! Declaracion Con Cuerpo (Contiene metodos, atributos y constructor)
enum Size {
    PEQUENIO("S"), MEDIANO("M"), GRANDE("L");

    private final String codigo;

    Size(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}

public class EnumEstructura {
    //? Declaracion Dentro
    public enum ColorSec{
        NARANJA,VERDE,MORADO
    }

    //! Declaracion sin Cuerpo
    public enum Tamanio{
        PEQUE,MEDI,GRANDE;
    }
}
