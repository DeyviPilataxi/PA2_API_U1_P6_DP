package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaLineaService {

    @Inject
    private TrakingVenta trakingVenta;

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    public void procesar(Venta venta) {

        this.trakingVenta.iniciar();

        System.out.println("Procesando pedido ");

        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }

        this.trakingVenta.finalizar();

        // REGISTRAR ESTADISTICAS
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());

    }

}
