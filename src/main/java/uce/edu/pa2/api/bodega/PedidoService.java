package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    @Inject
    private NotificacionMail notificadorMail;

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        // NotificadorMail n1 = new NotificadorMail(); sin di
        // con Di por el contenedor
        notificadorMail.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido");

    }
}
