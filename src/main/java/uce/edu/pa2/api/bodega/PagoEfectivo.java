package uce.edu.pa2.api.bodega;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoEfectivo  implements PagoEstrategia{

    @Override
    public void realizar(double valor) {
        System.out.println("presenta la pantalla");
        System.out.println("realizando cobro");


       
    }

}
