public class Vehiculo {

    String matricula;
    float velocidad;

    public Vehiculo() {
        this.matricula = "";
        this.velocidad = 0;
    }

    public Vehiculo(String matricula, float velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void acerlerar(float velocidad){
        this.velocidad += velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
