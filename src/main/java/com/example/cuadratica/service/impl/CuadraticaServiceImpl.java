package com.example.cuadratica.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cuadratica.controller.CuadraticaDTO;
import com.example.cuadratica.service.CuadraticaService;

@Service
public class CuadraticaServiceImpl implements CuadraticaService {
    @Override

    public CuadraticaDTO entregarResultado() {
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();

        System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds); 
        String hora = hours  + ":"+ minutes +":"+seconds;

        //ejemplo de hora 15:28:59, con % sacamos el valor restante de dividir
        
        int a = hours % 10; //5
        int b = minutes % 10; //8
        int c = seconds % 10; //9

        List<Integer> valoreUsados = new ArrayList<>();
        //así se debe ver la lista al ppio [] y aca le agregamos lo que tenemos a ,b y c
 
        valoreUsados.add(a);
        valoreUsados.add(b);
        valoreUsados.add(c);

        Integer operacionInternaRaiz = b*b - (4*a*c);
        Integer operacionDenominador = (2*a);

        if (operacionInternaRaiz < 0) {
            String operacion = "Operación interna de la raíz es negativa ";
            String resultadoRaiz="No es posible entregar resultadoRaiz, resultadoNumerador es negativo: " + operacionInternaRaiz;
            String resultadoNumerador="No es posible entregar resultadoNumerador por ser negativo";
            String resultadoDenominador = String.valueOf(operacionDenominador);
            String resultado="No es posible entregar resultado, resultadoNumerador es negativo";

            return new CuadraticaDTO(operacion, hora,valoreUsados,resultadoRaiz,resultadoNumerador,resultadoDenominador,resultado);
       
        }

        if (operacionDenominador == 0) {

            String operacion = "Operación del denominador es cero";
            
            double raizCuadrada = Math.sqrt(operacionInternaRaiz);
            double operacionNumerador = -b + raizCuadrada;
            
            String resultadoRaiz = String.valueOf(raizCuadrada);
            String resultadoNumerador = String.valueOf(operacionNumerador);        
            String resultadoDenominador = String.valueOf(operacionDenominador);
            String resultado="No es posible entregar resultadoRaiz resultadoNumedor negativo";

            return new CuadraticaDTO(operacion, hora,valoreUsados,resultadoRaiz,resultadoNumerador,resultadoDenominador,resultado);
       
        }
        else  {

            String operacion = "Raíz cuadratica: ";
            double raizCuadrada = Math.sqrt(operacionInternaRaiz);
            double operacionNumerador = -b + raizCuadrada;
            double resultadofinal = operacionNumerador / operacionDenominador;     

            String resultadoRaiz = String.valueOf(raizCuadrada);
            String resultadoNumerador = String.valueOf(operacionNumerador);
            String resultadoDenominador = String.valueOf(operacionDenominador);
            String resultado = String.valueOf(resultadofinal);
            return new CuadraticaDTO(operacion, hora,valoreUsados,resultadoRaiz,resultadoNumerador,resultadoDenominador,resultado);

        }
 
    }

}  

