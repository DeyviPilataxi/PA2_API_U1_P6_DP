package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@Dependent // con esto ya se inyecta uevamente ejemplo 3 ventas y luego 2 ventas del otro
           // service
// @ApplicationScoped // con esto las inyecciones se acumulan mientras que aqui
// se acumulan de todos los service ya sea el original o el 1
public class TrakingVenta {

    private long tiempoInicio = 0;
    private long tiempoFinal = 0;
    private long tiempoTotalAcumulado = 0;
    private int numeroOperaciones = 0;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();

    }

    public void finalizar() {

        this.tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo ejecucion " + tiempoEjecucion + "ms");

        this.tiempoTotalAcumulado += tiempoEjecucion;

        this.numeroOperaciones++;

        System.out.println("Tiempo ejecucion " + tiempoEjecucion + "ms");
        System.out.println("Tiempo acumulado " + tiempoTotalAcumulado + "ms");
        System.out.println("Cantidad de Operaciones " + this.numeroOperaciones);

    }

}
