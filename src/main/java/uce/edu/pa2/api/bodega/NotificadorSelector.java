package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificacionMail mail;
    @Inject
    private NotificadorSms sms;

    @Inject

    private NotificadorWhatsap wat;

    @Inject
    private NotificadorFisico fisico;

    @Inject
    private NotificadorPdf pdf;

    public Notificador enviarComprobante(String destino) {

       
        if (destino != null && !destino.isBlank()) {

            
            return pdf; 
        } else {
            return fisico; 
        }
    }

    }

     

