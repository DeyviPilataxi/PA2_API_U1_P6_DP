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

    private NotificadorCliente cliente;

   public void registrar(Pedido pedido, PagoEstrategia pago, NotificadorCliente cliente) {
    System.out.println("Registrando pedido");
    System.out.println("cliente: " + pedido.getCliente());
    System.out.println("Total: " + pedido.getTotal());

    // 1. Procesar el pago
    pago.realizar(pedido.getTotal());

    // 2. Obtener el destino desde el objeto 'pedido'
    // Asumo que tu clase Pedido tiene un método getDestino() o getEmail()
    String destinoEncontrado = pedido.getDestino(); 

    // 3. Validar y enviar
    if (destinoEncontrado != null) {
        // Aquí usamos el método que SÍ existe en tu interfaz
        cliente.enviarComprobante(destinoEncontrado);
    } else {
        System.out.println("No hay destino: generando comprobante físico/digital.");
    }
}
