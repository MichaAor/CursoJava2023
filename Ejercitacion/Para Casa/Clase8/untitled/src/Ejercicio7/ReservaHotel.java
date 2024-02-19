package Ejercicio7;

import java.time.LocalDate;

public class ReservaHotel extends Reserva{

    String nombreHotel;

    public void ReservaHotel(String nombreHotel, String nombreCliente, LocalDate fechaInicio, LocalDate fechaFin, Float costoTotal) {
        super.Reserva(nombreCliente,fechaInicio,fechaFin,costoTotal);
        this.nombreHotel = nombreHotel;
    }

    @Override
    public String toString() {
        return "ReservaHotel{" +
                "nombreHotel='" + nombreHotel + '\'' +
                '}';
    }

    public void mostrarDetalles(){
        super.toString();
        this.toString();
    }
}
