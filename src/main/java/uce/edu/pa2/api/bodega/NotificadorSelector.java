package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificacionMail mail;
    @Inject
    private NotificadorSms sms;

    public Notificador seleccionar(double total) {

        if (total > 100) {

            return mail;

        } else {
            return sms;
        }

    }

}
