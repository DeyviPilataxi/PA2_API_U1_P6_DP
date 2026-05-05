package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoIva implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("aplicando iva");
        double valorADescontar = valor * 0.15;
        return valor - valorADescontar; // 1)
        // return valor * 1.15; 2) cualquiera de los dos es valido
    }

}
