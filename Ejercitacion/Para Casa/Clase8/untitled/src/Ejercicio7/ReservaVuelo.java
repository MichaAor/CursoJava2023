package Ejercicio7;

import java.time.LocalDate;

public class ReservaVuelo extends Reserva{
    String aerolinea;
    int numeroVuelo;

    public ReservaVuelo(String aerolinea, int numeroVuelo, String nombreCliente, LocalDate fechaInicio, LocalDate fechaFin, Float costoTotal) {
        super(nombreCliente,fechaInicio,fechaFin,costoTotal);
        this.aerolinea = aerolinea;
        this.numeroVuelo = numeroVuelo;
    }

    @Override
    public String toString() {
        return "ReservaVuelo{" +
                "aerolinea='" + aerolinea + '\'' +
                ", numeroVuelo=" + numeroVuelo +
                '}';
    }
    public void mostrarDetalles(){
        System.out.println(super.toString() +  this.toString());
    }

}
