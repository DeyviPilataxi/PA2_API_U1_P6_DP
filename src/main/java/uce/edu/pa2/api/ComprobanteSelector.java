package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pa2.api.bodega.NotificadorCliente;
import uce.edu.pa2.api.bodega.NotificadorFisico;
import uce.edu.pa2.api.bodega.NotificadorPdf;

@ApplicationScoped
public class ComprobanteSelector {

    @Inject
    private NotificadorFisico fis;

    @Inject
    private NotificadorPdf pdf;



    public NotificadorCliente enviarCompNotificadorCliente(String destino) {
        if (destino != null && !destino.trim().isEmpty()) {
            return pdf;
        } else {
            return fis;
        }
    }

    

}
