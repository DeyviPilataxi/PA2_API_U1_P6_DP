package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadisticasVentasGlobales {

    private int totalVentas = 0;
    private double montoTotalVendido = 0;

    public void registrarVenta(double totalVentaIndividual) {
        totalVentas++;
        montoTotalVendido += totalVentaIndividual;

    }

    public void mostrarEstadisticasGlobales() {
        System.out.println("Estadisticas Globales");
        System.out.println("Cantidad de ventas: " + this.totalVentas);
        System.out.println("Valor total vendido " + this.montoTotalVendido);

    }

}
