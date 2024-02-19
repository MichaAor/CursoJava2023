package Ejercicio7;

import java.time.LocalDate;

public class ReservaHotel extends Reserva{

    String nombreHotel;

    public ReservaHotel(String nombreCliente, LocalDate fechaInicio, LocalDate fechaFin, Float costoTotal,String nombreHotel) {
        super(nombreCliente,fechaInicio,fechaFin,costoTotal);
        this.nombreHotel = nombreHotel;
    }

    @Override
    public String toString() {
        return "ReservaHotel{" +
                "nombreHotel='" + nombreHotel + '\'' +
                '}';
    }

    public void mostrarDetalles(){
        System.out.println(super.toString() +  this.toString());
    }
}
