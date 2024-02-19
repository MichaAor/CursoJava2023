package ejercicio6;

public class VehiculoCarga extends Vehiculo {
    Remolque remolque;
    public VehiculoCarga(String matricula, float velocidad) {
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
        if ((this.velocidad + velocidad) > 100 && !this.remolque.esTipoRemoqueNulo() ) {
            System.out.println("El ser un vehiculo de carga con remolque, este no puede superar mas de 100 kms/h");
        } else {
            this.velocidad += velocidad;
        }
    }

    @Override
    public String toString() {
        return "ejercicio6.VehiculoCarga{" +
                "matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad + '\'' +
                ", remolque=" + remolque +
                '}';
    }

    }