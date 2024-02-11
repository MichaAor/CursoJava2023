public class vehiculoCarga extends Vehiculo {
    Remolque remolque;
    public vehiculoCarga(String matricula, float velocidad, Remolque remolque) {
        super(matricula, velocidad);
        this.remolque = null;
    }
    public void quitarRemolque() {
        this.remolque = null;
    }
    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }
    @Override
    public void acerlerar(float velocidad){
        if ((this.velocidad + velocidad) > 100 ){
            System.out.println("mas de 100 kms");
        }
        this.velocidad += velocidad;
    }

    @Override
    public String toString() {
        return "vehiculoCarga{" +
                "remolque=" + remolque +
                '}';
    }
}