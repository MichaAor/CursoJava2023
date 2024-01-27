package codigoDeClase.ejemplosAbstracClass;

//! Clase Abstracta Padre que posee las caracteristicas y comportamientos
//! base de cualquier personaje involucrado.
public abstract class Personaje {
    private String nombre;
    private int nivel;
    private int vida;
    private int danioBase;

    public Personaje(String nombre, int nivel, int vida,int danioBase) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.danioBase =  danioBase;
    }

    public Personaje() {
        this.nombre = this.getClass().getSimpleName();
        this.nivel = 1;
        this.vida = 100;
        this.danioBase =  100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanioBase() {
        return danioBase;
    }

    public void setDanioBase(int danioBase) {
        this.danioBase = danioBase;
    }

    public String mostrarEstadisticas(){
        return this.getClass().getSimpleName() +
                "\n Nombre: " +  this.nombre +
                "\n Nivel: " + this.nivel +
                "\n Vida: " + this.vida;
    }

    public abstract void atacar(Personaje personaje);
}
