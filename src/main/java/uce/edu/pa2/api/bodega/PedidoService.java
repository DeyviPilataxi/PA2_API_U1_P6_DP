package uce.edu.pa2.api.bodega;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
// @Unremovable
public class PedidoService {

    // @Inject
    // private NotificacionMail notificadorMail;

    @Inject
    private NotificadorSelector selector;

    private PagoEstrategia pago;

    public void registrar(Pedido pedido, PagoEstrategia pago) {
        System.out.println("Registrando pedido");
        System.out.println("cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        pago.realizar(pedido.getTotal());

        // NotificadorMail n1 = new NotificadorMail(); sin di
        // con Di por el contenedor
        Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "pedido registrado");

    }
    // si el clinet tiene un destino registarado se envia un comprabnate de tipo pdf y si no  tiene registrsado o es nulo se gebnera un comprobante digital o fisico
}
