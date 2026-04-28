package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo
    public void procesar(Venta venta) {

        // inicia la venta
        System.out.println("Procesando pedido ");
        // esta consultando el stock de cada item,
        // esta consultando en la base de datos
        // finaliza la venta para saber cuanto duro la venta

        // voy a similar tiempo de demora

        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }

        // REGISTRAR ESTADISTICAS
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("fializando pedido ");

    }

    @MedirTiempo
    public void reprocesar(Venta venta) {

        // inicia la venta
        System.out.println("Reprocesando pedido ");
        // esta consultando el stock de cada item,
        // esta consultando en la base de datos
        // finaliza la venta para saber cuanto duro la venta

        // voy a similar tiempo de demora

        try {
            Thread.sleep(250);
        } catch (Exception e) {

        }

        // REGISTRAR ESTADISTICAS
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("finalizando el reproceso ");

    }

}
