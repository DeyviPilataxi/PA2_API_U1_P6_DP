package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoSolca implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("aplicando solca");
        double valorADescontar = valor * 0.20;

        return valor - valorADescontar;
    }

}
