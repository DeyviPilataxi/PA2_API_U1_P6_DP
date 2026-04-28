package uce.edu.pa2.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

//asi se declara una anotacion

@InterceptorBinding // le indicamos que va ser un interceptor
@Target({ ElementType.METHOD, ElementType.TYPE }) // se debe crear con esa configuracion
@Retention(RetentionPolicy.RUNTIME)
public @interface MedirTiempo {

}
