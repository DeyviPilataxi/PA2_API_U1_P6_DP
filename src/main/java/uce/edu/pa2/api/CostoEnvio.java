package uce.edu.pa2.api;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class CostoEnvio implements Costo {

    @Override
    public double reAplicar(double valor) {
        System.out.println("aplicando costo de envio");
        double valorADescontar = valor * 0.10;
        return valor - valorADescontar;
    }

}
