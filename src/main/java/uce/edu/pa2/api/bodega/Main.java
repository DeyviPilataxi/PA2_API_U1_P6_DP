package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        private PedidoService pedidoService;

        @Override
        public int run(String... args) {

            Pedido pedido = new Pedido("Deyvi Pilataxi", "Libro", 3, "ragonzaga@uce.edu.ec");

            // PedidoService service = new PedidoService();
            this.pedidoService.registrar(pedido);

            return 0;

        }

    }

}
