package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService1 {

    // @Inject
    // private NotificacionMail notificadorMail;

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido");

    }
}
