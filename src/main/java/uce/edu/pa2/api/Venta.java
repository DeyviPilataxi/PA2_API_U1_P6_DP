package uce.edu.pa2.api;

public class Venta {

    private String Cliente;
    private double total;

    public Venta(String cliente, double total) {
        Cliente = cliente;
        this.total = total;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
