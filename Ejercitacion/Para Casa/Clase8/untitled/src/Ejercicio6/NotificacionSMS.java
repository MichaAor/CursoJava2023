package Ejercicio6;

public class NotificacionSMS implements Notificable{

    public void enviarNotificacion(String mensaje){
        System.out.println("envio notificacion de SMS: " + mensaje );
    }

}
