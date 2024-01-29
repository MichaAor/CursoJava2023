package codigoDeClase.ejemplosAbstracClass;

public class Mago extends Personaje{
    private int magia;

    public Mago(){
        super();
        this.magia = 1;
    }

    public Mago(String nombre, int nivel, int vida,int magia,int danioBase) {
        super(nombre, nivel, vida,danioBase);
        this.magia = magia;
    }

    @Override
    public void atacar(Personaje personaje) {
        personaje.setVida(personaje.getVida() - this.calcularDanioTotal());
    }


    private int calcularDanioTotal(){
        return getDanioBase() * magia;
    }
}
