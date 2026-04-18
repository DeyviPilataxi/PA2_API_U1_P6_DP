package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagoTarjetaCredito implements PagoEstrategia{

    @Override
    public void realizar(double valor) {
        System.out.println("presenta la pantalla donde pide datos de la tarjeta ");
        System.out.println("realizando cobro");
    
        
    }

}
