package codigoDeClase.Encapsulamiento;

/*
!   ENCAPSULAMIENTO:
?   Explicación: 
*   En este ejemplo, se crea una clase CuentaBancaria que encapsula el saldo como un atributo privado.
*       Los métodos públicos depositar y retirar son las únicas formas de interactuar con el saldo,
*       lo que garantiza que las operaciones se realicen de manera controlada.
?   Ventajas:
*   -La modularidad y mantenibilidad del código: Al ocultar el detalle interno de cómo se gestiona el saldo,
*       es más fácil modificar la implementación interna sin afectar el código externo.
*   -Facilita el control sobre el acceso y modificación de los datos internos: Al proporcionar métodos
*       específicos para depositar y retirar dinero, se asegura un control adecuado sobre el saldo.
?  Desventajas:
*   -Puede requerir la creación de numerosos métodos de acceso (getters y setters): Aunque proporciona un control
*       adicional, puede aumentar la cantidad de métodos en la clase.
 */
public class MainEncapsulamiento {
    public static void main(String[] args) {
//! Declaración e Instantiacion o inicializacion;
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        System.out.println(cuentaBancaria.getSaldo());
    }
}