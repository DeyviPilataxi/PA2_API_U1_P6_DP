package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.enterprise.inject.Instance;

@ApplicationScoped
public class ProcesadorImpuestoService {

    @Inject
    private Instance<Impuesto> impuestos;

    public void procesar(Compra compra) {

        double total = compra.getSubTotal();

        for (Impuesto imp : impuestos) {
            total = imp.imponer(total);
        }

        compra.setTotal(total);
        System.out.println("Valor con impuestos aplicados: " + compra.getTotal());
    }

}
