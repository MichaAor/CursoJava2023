package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Notificable miNotificacionSMS = new NotificacionSMS();
        Notificable miNotificacionCorreo = new NotificacionCorreo();

        miNotificacionSMS.enviarNotificacion("envio de mi primer SMS");
        miNotificacionCorreo.enviarNotificacion("Envio de mi primer correo electronico");

    }
}