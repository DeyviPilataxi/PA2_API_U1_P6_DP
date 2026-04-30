package uce.edu.pa2.api;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo // cada vez que un metodo tenga esta anotacion va a utilizar la clase
@Interceptor
@Priority(3)
public class MedirTiempoInterceptor {

    @AroundInvoke // decirle a este metodo que se va a ejecutar el interceptor alredor de la
                  // ejecucion del metodo
    public Object medir(InvocationContext context) throws Exception {

        System.out.println("se ejecuto antes del metodo");
        System.out.println("metodo interceotado: " + context.getMethod().getName());

        long inicio = System.currentTimeMillis();

        Object resultado = context.proceed();// inicia la ejecucion del metodo sino se llama al proceed nunca se ejecuta
                                             // el
        // metodo se ejecuta el interceptor menos el metodo sino se lo llama
        // pasa a la linea 17 una vez que se termine de ejecutar el metodo de negocio

        long fin = System.currentTimeMillis();

        long tiempoTranscurrido = fin - inicio;
        System.err.println("Tiempo transcurrido: " + tiempoTranscurrido);

        return resultado;

    }

}
