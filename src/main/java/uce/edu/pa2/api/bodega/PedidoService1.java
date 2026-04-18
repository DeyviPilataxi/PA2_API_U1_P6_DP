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
//pedido pago por tarjeta de credito o efectivo 
//el comprobante va hacer un pdf y el otro papel fisico y el otro un xml 3 tipos de comprobante 
// a travez de la defiicion del que pero no del como ------------es la ineterfaz 
