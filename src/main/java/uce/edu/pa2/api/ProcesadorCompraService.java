package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    private Instance<Descuento> descuentos;
    @Inject
    private Instance<Costo> costos;

    public void procesar(Compra compra) {

        double total = compra.getSubTotal();

        for (Descuento des : descuentos) {

            total = des.aplicar(total);

        }

        compra.setTotal(total);

        System.out.println("su valor a pagar es: " + compra.getTotal());

    }

    public void reprocesar(Compra compra) {

        double total = compra.getSubTotal();

        for (Costo cos : costos) {

            total = cos.reAplicar(total);

        }

        compra.setTotal(total);

        System.out.println("su valor a pagar es: " + compra.getTotal());

    }

}
