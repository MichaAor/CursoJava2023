package EjercitacionClase.Ej1;

public class Rectangulo {
    float ancho = 1.0f;
    float alto = 1.0f;
    
    public Rectangulo(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }


    public float getAncho() {
        return ancho;
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
  
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+
         "\n ancho=" + this.ancho +  
         "\n alto=" + this.alto +
         "\n area=" + this.calcularArea() + 
         "\n perimetro=" + this.calcularPerimitero();
    } 

public float calcularArea(){
   return (this.alto * this.ancho);
}
public float calcularPerimitero(){
    return (this.alto*2 + this.ancho*2);
 }
 
    
}
