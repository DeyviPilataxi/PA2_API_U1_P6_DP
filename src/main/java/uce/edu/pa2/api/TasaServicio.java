package uce.edu.pa2.api;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class TasaServicio implements Costo {

    @Override
    public double reAplicar(double valor) {
        System.out.println("aplicando tasa de servicio");
        double valorADescontar = valor * 0.10;
        return valor - valorADescontar;

    }

}
