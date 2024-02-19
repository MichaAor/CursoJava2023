package Ejercicio7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.of(2024, 2, 13);
        LocalDate fechaFin = LocalDate.of(2024, 2, 25);

        ReservaHotel miReservaHotel = new ReservaHotel("Corregidor Hotel","Jose Macias",fechaInicio,fechaFin,2500);
        ReservaVuelo miReservaVuelo = new ReservaVuelo("Turkish Airline","Jose Macias",fechaInicio,fechaFin,2500);

        miReservaHotel.mostrarDetalles();
        miReservaVuelo.mostrarDetalles();
    }
}