package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorSms implements Notificador {

    public void enviar(String correo, String mensaje) {
        System.out.println("Se envia el mail al numero: " + correo);
        System.out.println("Con el mensaje: " + mensaje);

    }

}
