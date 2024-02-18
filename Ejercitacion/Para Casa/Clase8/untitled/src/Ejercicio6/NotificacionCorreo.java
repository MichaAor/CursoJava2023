package Ejercicio6;

public class NotificacionCorreo implements Notificable{
    public void enviarNotificacion(String mensaje){
        System.out.println("envio notificacion de Correo: " + mensaje );
    }
}
