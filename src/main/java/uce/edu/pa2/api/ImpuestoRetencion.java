package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoRetencion implements Impuesto {

    @Override
    public double imponer(double valor) {

        System.out.println("aplicando impuesto retencion");
        double valorADescontar = valor * 0.10;
        return valor + valorADescontar;

    }
}
