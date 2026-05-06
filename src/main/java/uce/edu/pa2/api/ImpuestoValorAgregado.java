package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoValorAgregado implements Impuesto {

    @Override
    public double imponer(double valor) {

        System.out.println("aplicando impuesto valor agregado");
        double valorADescontar = valor * 0.20;
        return valor + valorADescontar;
    }

}
