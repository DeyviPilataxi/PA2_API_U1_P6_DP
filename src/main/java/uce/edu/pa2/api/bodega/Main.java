package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import uce.edu.pa2.api.AmbitoAplicacion;
import uce.edu.pa2.api.AmbitoInject;
import uce.edu.pa2.api.AmbitoRequest;
import uce.edu.pa2.api.AmbitoSingleton;
import uce.edu.pa2.api.ClaseIntermedia;
import uce.edu.pa2.api.EstadisticasVentasGlobales;
import uce.edu.pa2.api.ProcesadorVentaLineaService;
import uce.edu.pa2.api.ProcesadorVentaService;
import uce.edu.pa2.api.ProcesadorVentaService1;
import uce.edu.pa2.api.Venta;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        // modelos de IoC
        // 1 DI
        /*
         * @Inject
         * private PedidoService pedidoService;
         * 
         * @Inject
         * private PagoTarjetaCredito pagoTar;
         * 
         * @Inject
         * private PagoEfectivo pagoEfe;
         * 
         * // 2. Service Locator LookuP
         * // con el current accedo al contenedor etsoy buscando manualmente la
         * dependencia
         * // private PedidoService pedidoService =
         * // CDI.current().select(PedidoService.class).get();
         */

        /*
         * @Inject
         * private AmbitoAplicacion ambitoAplicacion;
         * 
         * @Inject
         * private ClaseIntermedia claseIntermedia;
         * 
         * @Inject
         * private AmbitoRequest ambitoRequest;
         * 
         * @Inject
         * private AmbitoInject ambitoInject;
         * 
         * @Inject
         * private AmbitoSingleton ambitoSingleton;
         */

        @Inject
        private ProcesadorVentaService procesadorVentaService;

        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;

        @Inject
        private ProcesadorVentaLineaService procesadorVentaLineaService;

        @Override
        public int run(String... args) {

            /*
             * System.out.println("caso 1 ----------------------");
             * Pedido pedido = new Pedido("Deyvi Pilataxi", "Libro", 3,
             * "ragonzaga@uce.edu.ec");
             * 
             * // PedidoService service = new PedidoService();
             * this.pedidoService.registrar(pedido, pagoEfe);
             * 
             * 
             * // caso 2
             * 
             * 
             * System.out.println("caso 2 -----------------------");
             * Pedido pedido2 = new Pedido("Joel", "jugo", 120, "djpilataxi@uce.edu.ec");
             * this.pedidoService.registrar(pedido2, pagoTar);
             * 
             * /*
             * System.out.println("caso 3-------------------------");
             * Pedido pedido3 = new Pedido("maria", "agua", 75, "deyvi@uce.edu.ec");
             * pedidoService.registrar(pedido3);
             */

            /*
             * System.out.println(this.ambitoAplicacion);
             * System.out.println(this.ambitoAplicacion.incrementar());
             * System.out.println(this.ambitoAplicacion.incrementar());
             * System.out.println(this.ambitoAplicacion.incrementar());
             * 
             * this.claseIntermedia.imprimirObjetoValor();
             * 
             * /*
             * System.out.println("----------------Ambito Request---------");
             * System.out.println(this.ambitoRequest.incrementar());
             * System.out.println(this.ambitoRequest.incrementar());
             * System.out.println(this.ambitoRequest.incrementar());
             */

            /*
             * System.out.println("---------------Ambito Depent----------");
             * System.out.println(this.ambitoInject.incrementar());
             * System.out.println(this.ambitoInject.incrementar());
             * System.out.println(this.ambitoInject.incrementar());
             * 
             * this.claseIntermedia.imprimirObjetoInject();
             * 
             * System.out.println("-----------Ambito singleton------------");
             * System.out.println(this.ambitoSingleton.incrementar());
             * System.out.println(this.ambitoSingleton.incrementar());
             * System.out.println(this.ambitoSingleton.incrementar());
             * this.claseIntermedia.imprimirObjetoValorSingleton();
             */

            Venta v1 = new Venta("Deyvi pilataxi", 70);
            this.procesadorVentaService.procesar(v1);

            Venta v2 = new Venta("Joel Guaina", 40);
            this.procesadorVentaService.procesar(v2);

            Venta v3 = new Venta("Mishell Sinche", 20);
            this.procesadorVentaService.procesar(v3);

            Venta v4 = new Venta("Alejandra Paredes", 20);
            this.procesadorVentaService1.procesar(v4);

            Venta v5 = new Venta("Alejandra Paredes", 20);
            this.procesadorVentaService1.procesar(v5);

            Venta v6 = new Venta("Alejandra Perex", 20);
            this.procesadorVentaLineaService.procesar(v6);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            return 0;

        }

    }

}
