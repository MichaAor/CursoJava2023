package codigoDeClase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ClaseLocalDateYLocalDateTime {
    public static void main(String[] args) {
//        localDateDEMO();
        localDateTimeDEMO();
    }

    public static void localDateDEMO(){
        //LOCALDATETIME
        //--CREACION--
        System.out.println("\033[36m" + "//--CREACION LOCALDATE--\\" + "\u001B[0m");

            //.now() -> Devuelve fecha Actual.
            System.out.print("\033[33m"+"LocalDate.now() "+"\u001B[0m");
            LocalDate fechaA = LocalDate.now();
            System.out.println("\033[35m"+"\n"+ fechaA +"\u001B[0m");

            //.of(anio,mes,dia) -> Formatea segun los parametros recibidos.
            System.out.print("\033[33m"+"\nLocalDate.of(anio,mes,dia)"+"\u001B[0m");
            LocalDate fechaOf = LocalDate.of(2023, 1, 12);
            System.out.println("\033[35m"+"\n"+ fechaOf +"\u001B[0m");

            //.parse(cadenaConFecha) -> convierte una cadena a LocalDate.
            System.out.print("\033[33m"+"\nLocalDate.parse(cadenaConFecha)"+"\u001B[0m");
            String fechaString = "2023-02-22";
            LocalDate fechaParseada = LocalDate.parse(fechaString);
            System.out.println("\033[35m"+"\n"+ fechaParseada +"\u001B[0m");


        //--OPERACIONES--
        System.out.println("\033[36m" + "\n//--OPERACIONES LOCALDATE--\\" + "\u001B[0m");

            //MANIPULACION
            System.out.print("\033[32m"+"--MANIPULACION--"+"\u001B[0m");

                //.plus... -> agregar anios,meses o dias.
                System.out.println("\033[33m"+"\nLocalDate.plus...()"+"\u001B[0m");

                System.out.println("\033[35m"+"Fecha Actual: "+ fechaA +"\u001B[0m");
                fechaA = fechaA.plusYears(3);
                fechaA = fechaA.plusMonths(2);
                fechaA = fechaA.plusDays(7);

                System.out.println("\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17");
                System.out.println("\033[34m"+"Agregamos 3 anios, 2 meses y 7 dias"+"\u001B[0m");
                System.out.println("\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17");
                System.out.println("\033[35m"+"Fecha Modificada: "+ fechaA +"\u001B[0m");

                //.minus... -> decrementa anios,meses o dias.
                System.out.println("\033[33m"+"\nLocalDate.minus...()"+"\u001B[0m");
                fechaA = LocalDate.now();

                System.out.println("\033[35m"+"Fecha Actual: "+fechaA +"\u001B[0m");
                fechaA = fechaA.minusYears(3);
                fechaA = fechaA.minusMonths(2);
                fechaA = fechaA.minusDays(7);

                System.out.println("\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17");
                System.out.println("\033[34m"+"Decrementamos 3 anios, 2 meses y 7 dias"+"\u001B[0m");
                System.out.println("\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17");

                System.out.println("\033[35m"+"Fecha Modificada: "+fechaA +"\u001B[0m");

            //OBTENCION DE DATOS
            System.out.println("\033[32m"+"\n--OBTENCION DE DATOS LOCALDATE--"+"\u001B[0m");
                fechaA = LocalDate.now();
                System.out.println("\033[35m"+"Fecha Actual: "+fechaA +"\u001B[0m");

                //.getYear() -> Retorna el Anio.
                int anio = fechaA.getYear();
                System.out.println("\033[34m"+"Anio: "+ anio +"\u001B[0m");

                //.getMonthValue() -> Retorna el Mes.
                int mes = fechaA.getMonthValue();
                System.out.println("\033[34m"+"Mes: "+ mes +"\u001B[0m");

                //.getDayOfMonth() -> Retorna dia del Mes.
                int diaDelMes = fechaA.getDayOfMonth();
                System.out.println("\033[34m"+"Dia del Mes: "+ diaDelMes +"\u001B[0m");

            //FORMATEO
            System.out.println("\033[32m"+"\n--FORMATEO--"+"\u001B[0m");
                //.format(DateTimeFormater) -> formatea fecha y hora.
                System.out.println("\033[33m"+".format(DateFormater)"+"\u001B[0m");
                System.out.println("\033[35m"+"Fecha Actual SIN FORMATEAR: "+ fechaA +"\u001B[0m");
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String fechaFormateada = fechaA.format(formato);
                System.out.println("\033[34m"+"Fecha Actual FORMATEADA: "+ fechaFormateada +"\u001B[0m");

            //COMPARACION
            System.out.println("\033[32m"+"\n--COMPARACION--"+"\u001B[0m");
                fechaA = LocalDate.now();
                LocalDate otraFecha = LocalDate.of(2019,2,6);

                System.out.println("\033[35m"+"Fecha Actual: "+ fechaA +"\u001B[0m");
                System.out.println("\033[35m"+"Otra Fecha: "+ otraFecha +"\u001B[0m");

                // .isBefore(LocalDate other) -> Compara si la fecha actual es anterior a otra.
                boolean esAntes = fechaA.isBefore(otraFecha);
                System.out.println("\033[34m"+"\nFecha Actual es anterior?: "+ esAntes +"\u001B[0m");
                // .isEqual(LocalDate other) -> Compara si la fecha actual es igual a otra.
                boolean esIgual = fechaA.isEqual(otraFecha);
                System.out.println("\033[34m"+"Fecha Actual es igual?: "+ esIgual +"\u001B[0m");
                // .isAfter(LocalDate other) -> Compara si la fecha actual es posterior a otra.
                boolean esPosterior = fechaA.isAfter(otraFecha);
                System.out.println("\033[34m"+"Fecha Actual es posterior?: "+ esPosterior +"\u001B[0m");
    }

    public static void localDateTimeDEMO(){
        //LOCALDATETIME
        //--CREACION--
        System.out.println("\033[36m" + "//--CREACION LOCALDATETIME--\\" + "\u001B[0m");

        //.now() -> Devuelve fecha y Hora Actual.
        System.out.print("\033[33m"+"LocalDateTime.now() "+"\u001B[0m");
        LocalDateTime fechaYHoraActual = LocalDateTime.now();
        System.out.println("\033[35m"+"\n"+fechaYHoraActual +"\u001B[0m");

        //.of(anio,mes,dia,hora,minuto) -> Formatea segun los parametros recibidos.
        System.out.print("\033[33m"+"\nLocalDateTime.of(anio,mes,dia,hora,minuto)"+"\u001B[0m");
        LocalDateTime fechaYHoraOf = LocalDateTime.of(2023, 1, 12,
                15, 33);
        System.out.println("\033[35m"+"\n"+fechaYHoraOf +"\u001B[0m");

        //.now().atTime(hora,minuto) -> combinacion de fecha actual + tiempo por parametro.
        System.out.print("\033[33m"+"\nLocalDateTime.now().atTime(hora,minuto)"+"\u001B[0m");
        LocalDateTime fechaYHoraCombinado = LocalDate.now().atTime(12, 40);
        System.out.println("\033[35m"+"\n"+fechaYHoraCombinado +"\u001B[0m");

        //.parse(cadenaConFechaYHora) -> convierte una cadena a LocalDateTime.
        System.out.print("\033[33m"+"\nLocalDateTime.parse(cadenaConFechaYHora)"+"\u001B[0m");
        String fechaYHoraString = "2023-02-22T15:24:55";
        LocalDateTime fechaYHoraParseado = LocalDateTime.parse(fechaYHoraString);
        System.out.println("\033[35m"+"\n"+fechaYHoraParseado +"\u001B[0m");

        //--OPERACIONES--
        System.out.println("\033[36m" + "\n//--OPERACIONES LOCALDATETIME--\\" + "\u001B[0m");

        //MANIPULACION
        System.out.print("\033[32m"+"--MANIPULACION--"+"\u001B[0m");

        //.plus... -> agregar meses,dias,horas o minutos
        System.out.println("\033[33m"+"\n\nLocalDateTime.plus...()"+"\u001B[0m");

        System.out.println("\033[35m"+"Fecha y Hora Actual: "+fechaYHoraActual +"\u001B[0m");
        fechaYHoraActual = fechaYHoraActual.plusHours(3);
        fechaYHoraActual = fechaYHoraActual.plusMinutes(20);

        System.out.println("\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17");
        System.out.println("\033[34m"+"Agregamos 3 horas y 20 minutos"+"\u001B[0m");
        System.out.println("\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17");
        System.out.println("\033[35m"+"Fecha y Hora Modificada: "+fechaYHoraActual +"\u001B[0m");

        //.minus... -> decrementa meses,dias,horas o minutos.
        System.out.println("\033[33m"+"\nLocalDateTime.minus...()"+"\u001B[0m");
        fechaYHoraActual = LocalDateTime.now();

        System.out.println("\033[35m"+"Fecha y Hora Actual: "+fechaYHoraActual +"\u001B[0m");
        fechaYHoraActual = fechaYHoraActual.minusHours(3);
        fechaYHoraActual = fechaYHoraActual.minusMinutes(20);

        System.out.println("\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17");
        System.out.println("\033[34m"+"Decremento 3 horas y 20 minutos"+"\u001B[0m");
        System.out.println("\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17"+"\uD83E\uDC17");

        System.out.println("\033[35m"+"Fecha y Hora Modificada: "+fechaYHoraActual +"\u001B[0m");

        //FORMATEO
        System.out.println("\033[32m"+"\n--FORMATEO--"+"\u001B[0m");
        fechaYHoraActual = LocalDateTime.now();

        //.toLocalDate() -> extrae de tu LocalDateTime valores LocalDate.
        System.out.println("\033[33m"+"\n.ToLocalDate()"+"\u001B[0m");
        System.out.println("\033[35m"+"Fecha y Hora Actual: "+ fechaYHoraActual +"\u001B[0m");
        LocalDate fechaActual = fechaYHoraActual.toLocalDate();
        System.out.println("\033[34m"+"Fecha Actual: "+ fechaActual+"\u001B[0m");

        //.toLocalTime() -> extrae de tu LocalDateTime valores LocalTime.
        System.out.println("\033[33m"+"\n.ToLocalTime()"+"\u001B[0m");
        System.out.println("\033[35m"+"Fecha y Hora Actual: "+fechaYHoraActual +"\u001B[0m");
        LocalTime tiempoActual = fechaYHoraActual.toLocalTime();
        System.out.println("\033[34m"+"Tiempo Actual: "+tiempoActual+"\u001B[0m");

        //.format(DateTimeFormater) -> formatea fecha y hora.
        System.out.println("\033[33m"+"\n.format(DateTimeFormater)"+"\u001B[0m");
        System.out.println("\033[35m"+"Fecha y Hora Actual SIN FORMATEAR: "+fechaYHoraActual +"\u001B[0m");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHoraFormateada = fechaYHoraActual.format(formato);
        System.out.println("\033[34m"+"Fecha y Hora Actual FORMATEADA: "+fechaHoraFormateada +"\u001B[0m");

        //COMPARACION
        System.out.println("\033[32m"+"\n--COMPARACION--"+"\u001B[0m");
        fechaYHoraActual = LocalDateTime.now();
        LocalDateTime otraFechaHora = LocalDateTime.of(2019,2,6,21,37);

        System.out.println("\033[35m"+"Fecha y Hora Actual: "+ fechaYHoraActual +"\u001B[0m");
        System.out.println("\033[35m"+"Otra Fecha y Hora: "+ otraFechaHora +"\u001B[0m");

        // .isBefore(LocalDateTime other) -> Compara si la fecha y hora actual es anterior a otra.
        boolean esAntes = fechaYHoraActual.isBefore(otraFechaHora);
        System.out.println("\033[34m"+"\nFecha y Hora Actual es anterior?: "+ esAntes +"\u001B[0m");
        // .isEqual(LocalDateTime other) -> Compara si la fecha y hora actual es igual a otra.
        boolean esIgual = fechaYHoraActual.isEqual(otraFechaHora);
        System.out.println("\033[34m"+"Fecha y Hora Actual es igual?: "+ esIgual +"\u001B[0m");
        // .isAfter(LocalDateTime other) -> Compara si la fecha y hora actual es posterior a otra.
        boolean esPosterior = fechaYHoraActual.isAfter(otraFechaHora);
        System.out.println("\033[34m"+"Fecha y Hora Actual es posterior?: "+ esPosterior +"\u001B[0m");
    }
}
