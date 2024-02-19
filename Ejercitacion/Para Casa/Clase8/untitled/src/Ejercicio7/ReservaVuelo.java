package Ejercicio7;

import java.time.LocalDate;

public class ReservaVuelo extends Reserva{
    String aerolinea;
    int numeroVuelo;

    public void ReservaVuelo(String aerolinea, int numeroVuelo, String nombreCliente, LocalDate fechaInicio, LocalDate fechaFin, Float costoTotal) {
        //Reserva(nombreCliente,fechaInicio,fechaFin,costoTotal);
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
        super.toString();
        this.toString();
    }

}
