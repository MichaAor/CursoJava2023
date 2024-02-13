public class Pizza {

/**
 * Sobre cada pizza se necesita saber el tamaño - mediana o familiar - el tipo - margarita,
 * cuatro quesos o funghi - y su estado - pedida o servida. La clase debe almacenar información sobre el
 * número total de pizzas que se han pedido y que se han servido. Siempre que se crea una pizza nueva,
 * su estado es “pedida”.
  */

    private String tipo;
    private String estado;
    private String tamano;
    static int totalPizzasPedidas = 0;
    static int totalPizzasServidas = 0;

    public Pizza(String tamano, String tipo) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.estado = "Pedida";
        totalPizzasPedidas += 1;
    }



    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static int getTotalPizzasPedidas() {
        return Pizza.totalPizzasPedidas;
    }

    public static int getTotalPizzasServidas() {
        return Pizza.totalPizzasServidas;
    }

    public void ServirPizza() {
        totalPizzasServidas += 1;
        this.estado = "Servida";
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                ", tamano='" + tamano + '\'' +
                '}';
    }
}
