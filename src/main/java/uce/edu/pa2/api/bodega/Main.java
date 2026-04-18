package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        // modelos de IoC
        // 1 DI
        @Inject
        private PedidoService pedidoService;

        @Inject
        private PagoTarjetaCredito pagoTar;

        @Inject
        private PagoEfectivo pagoEfe;

        // 2. Service Locator LookuP
        // con el current accedo al contenedor etsoy buscando manualmente la dependencia
        // private PedidoService pedidoService =
        // CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args) {
           

            System.out.println("caso 1 ----------------------");
            Pedido pedido = new Pedido("Deyvi Pilataxi", "Libro", 3, "ragonzaga@uce.edu.ec");

            // PedidoService service = new PedidoService();
            this.pedidoService.registrar(pedido, pagoEfe);


            // caso 2

            
             System.out.println("caso 2 -----------------------");
             Pedido pedido2 = new Pedido("Joel", "jugo", 120, "djpilataxi@uce.edu.ec");
             this.pedidoService.registrar(pedido2, pagoTar);

             /* 
             * System.out.println("caso 3-------------------------");
             * Pedido pedido3 = new Pedido("maria", "agua", 75, "deyvi@uce.edu.ec");
             * pedidoService.registrar(pedido3);
             */

            return 0;
        }

    }

}
