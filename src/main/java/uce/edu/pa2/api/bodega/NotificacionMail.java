package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificacionMail {

    public void enviar(String correo, String mensaje) {
        System.out.println("Se envia el mail al correo: " + correo);
        System.out.println("Con el mensaje: " + mensaje);

    }

}
