package codigoDeClase.ejemplosAbstracClass;

//! Heredamos de Personaje, aprovechándonos de sus particularidades.
//! Declaramos las propias a la clase 'Caballero'.
public class Caballero extends Personaje{
//? Ademas de los atributos heredados, declaramos 'fuerza' como uno propio de Caballero.
    private int fuerza;

//? Utilizamos la palabra reservada super para llamar el metodo construtor de la superclase.
    public Caballero(){
        super();
        this.fuerza = 1;
    }
    public Caballero(String nombre, int nivel, int vida,int fuerza,int danioBase) {
        super(nombre, nivel, vida,danioBase);
        this.fuerza = fuerza;
    }

//? Implementamos o desarrollamos el método abstracto.
    @Override
    public void atacar(Personaje personaje) {
        personaje.setVida(personaje.getVida() - this.calcularDanioTotal());
    }


    private int calcularDanioTotal(){
        return getDanioBase() * fuerza;
    }

    @Override
    public String mostrarEstadisticas(){
        return super.mostrarEstadisticas() +
                "\n Fuerza: " +  this.fuerza;
    }
}
