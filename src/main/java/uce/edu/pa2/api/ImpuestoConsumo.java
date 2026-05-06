package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoConsumo implements Impuesto {

    @Override
    public double imponer(double valor) {
        System.out.println("aplicando impuesto consumo");
        double valorADescontar = valor * 0.15;
        return valor + valorADescontar;

    }
}
