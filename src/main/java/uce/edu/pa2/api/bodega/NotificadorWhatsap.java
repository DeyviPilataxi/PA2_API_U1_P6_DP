package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@ApplicationScoped
// @Default
public class NotificadorWhatsap implements Notificador {

    public void enviar(String wat, String mensaje) {
        System.out.println("Se envia el whatsap : " + wat);
        System.out.println("Con el mensaje: " + mensaje);

    }
}
