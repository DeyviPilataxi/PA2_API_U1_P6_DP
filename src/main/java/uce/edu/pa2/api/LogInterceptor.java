package uce.edu.pa2.api;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Log // cada vez que un metodo tenga esta anotacion va a utilizar la clase
@Interceptor
@Priority(1)
public class LogInterceptor {

    @AroundInvoke
    public Object medir(InvocationContext context) throws Exception {

        System.out.println("se ejecuto log antes del metodo");
        System.out.println("interceptado el metodo: " + context.getMethod().getName());
        Object[] args = context.getParameters();

        for (int i = 0; i < args.length; i++) {

            System.out.println("argumentos : " + args[i]);
            Object obj = args[i];
            Venta venta = (Venta) obj;
            System.out.println(venta.getCliente());
            System.out.println(venta.getTotal());

        }
        Object resultado = context.proceed();

        return resultado;

    }

}
