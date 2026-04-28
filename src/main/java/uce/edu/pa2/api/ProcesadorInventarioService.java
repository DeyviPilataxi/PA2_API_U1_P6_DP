package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorInventarioService {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo
    public void registrarInvetario(Venta venta) {

        // inicia la venta
        System.out.println("Procesando el inventario ");
        // esta consultando el stock de cada item,
        // esta consultando en la base de datos
        // finaliza la venta para saber cuanto duro la venta

        // voy a similar tiempo de demora

        try {
            Thread.sleep(500);
        } catch (Exception e) {

        }

        // REGISTRAR ESTADISTICAS
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("fializando el inventario ");

    }
}
