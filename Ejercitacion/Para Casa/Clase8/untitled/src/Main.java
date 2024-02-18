import Ejercicio6.Notificable;
import Ejercicio6.NotificacionCorreo;
import Ejercicio6.NotificacionSMS;

public class Main {
    public static void main(String[] args) {
        Notificable miNotificacionSMS = new NotificacionSMS();
        Notificable miNotificacionCorreo = new NotificacionCorreo();

        miNotificacionSMS.enviarNotificacion("envio de mi primer SMS");
        miNotificacionCorreo.enviarNotificacion("Envio de mi primer correo electronico");

    }
}