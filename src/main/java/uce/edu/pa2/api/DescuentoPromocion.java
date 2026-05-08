package uce.edu.pa2.api;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class DescuentoPromocion implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("aplicando promocion");
        double valorADescontar = valor * 0.25;
        return valor - valorADescontar;
    }

}
