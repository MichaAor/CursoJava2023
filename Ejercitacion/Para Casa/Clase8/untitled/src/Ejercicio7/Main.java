package Ejercicio7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ReservaHotel miReservaHotel = new ReservaHotel("Jose Macias",
                                                       LocalDate.now(),
                                                       LocalDate.now().plusDays(45),
                                              2500f,
                                            "Corregidor Hotel");
        ReservaVuelo miReservaVuelo = new ReservaVuelo("Turkish Airline",
                                                     2,
                                                     "Jose Macias",
                                                      LocalDate.now(),
                                                      LocalDate.now(),
                                                      2500f);

        miReservaHotel.mostrarDetalles();
        miReservaVuelo.mostrarDetalles();
    }
}