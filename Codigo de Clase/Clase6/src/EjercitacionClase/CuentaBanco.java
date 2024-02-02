package EjercitacionClase;
/**
 *2) Modele el objeto que representa la cuenta de un banco, con identificador, nombre
         *    y balance. Considere los getters, setters y constructores necesarios. Tenga en
         *    cuenta los siguientes métodos.
         *        a. El método crédito que representa un depósito de dinero en la cuenta. Este
         *            método debe devolver el balance luego de la operación.
         *        b. El método débito que representa una sustracción de dinero de la cuenta.
         *            Este método debe devolver el balance luego de la operación. Si el dinero en
         *            la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por pantalla un aviso.
         *        c. Un método que imprima por pantalla las características del objeto.
         * Realice las siguientes operaciones:
         *    1. Inicialice una cuenta con un monto inicial de 15000.
         *    2. Realice una operación de crédito de 2500.
         *    3. Realice una operación de compra de 1500.
         *    4. Realice una operación de compra de 30000.
         *    5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea correcto.
         *
         */

public class CuentaBanco {
   int identificador;
   String nombre;
   float balance;

    public int getIdentificador() {
        return identificador;
    }
    public CuentaBanco(int identificador, String nombre, float balance) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.balance = balance;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "CuentaBanco{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
    public float credito(float montoDeposito){
        this.balance = this.balance +  montoDeposito;
        return this.balance;
    }
    public float debito(float montoDebitar){
        if(this.balance <= montoDebitar){
            System.out.println("Sin saldo");
        }else{
            this.balance = this.balance -  montoDebitar;
        }
        return this.balance;
    }

}
