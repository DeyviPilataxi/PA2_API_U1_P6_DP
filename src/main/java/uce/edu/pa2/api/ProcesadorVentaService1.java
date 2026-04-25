package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaService1 {

    @Inject // aqui como inyecto trakingventa se crea un objeto
    private TrakingVenta trakingVenta;

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    public void procesar(Venta venta) {

        this.trakingVenta.iniciar();

        System.out.println("Procesando pedido ");
        // esta consultando el stock de cada item,
        // esta consultando en la base de datos
        // finaliza la venta para saber cuanto duro la venta

        // voy a similar teimpo de demora

        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }

        this.trakingVenta.finalizar();

        // REGISTRAR ESTADISTICAS
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());

    }

}
