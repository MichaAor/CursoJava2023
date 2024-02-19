package Ejercicio7;

import java.time.LocalDate;
import java.util.Date;
public abstract class Reserva {
    private String nombreCliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Float costoTotal;
    public Reserva(){

    }
    public Reserva(String nombreCliente, LocalDate fechaInicio, LocalDate fechaFin, Float costoTotal) {
        this.nombreCliente = nombreCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", costoTotal=" + costoTotal +
                '}';
    }

    public abstract void mostrarDetalles();
}
