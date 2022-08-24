package com.example.cuadratica.controller;

import java.util.List;

public class CuadraticaDTO {

    private String operacion;
    private String hora;
    private List<Integer> valoresUsados; 
    private String resultadoRaiz;
    private String resultadoNumerador;
    private String resultadoDenominador;
    private String resultado;
    
    public CuadraticaDTO(String operacion, String hora, List<Integer> valoresUsados, String resultadoRaiz,
            String resultadoNumerador, String resultadoDenominador, String resultado) {
        this.operacion = operacion;
        this.hora = hora;
        this.valoresUsados = valoresUsados;
        this.resultadoRaiz = resultadoRaiz;
        this.resultadoNumerador = resultadoNumerador;
        this.resultadoDenominador = resultadoDenominador;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Integer> getValoresUsados() {
        return valoresUsados;
    }

    public void setValoresUsados(List<Integer> valoresUsados) {
        this.valoresUsados = valoresUsados;
    }

    public String getResultadoRaiz() {
        return resultadoRaiz;
    }

    public void setResultadoRaiz(String resultadoRaiz) {
        this.resultadoRaiz = resultadoRaiz;
    }

    public String getResultadoNumerador() {
        return resultadoNumerador;
    }

    public void setResultadoNumerador(String resultadoNumerador) {
        this.resultadoNumerador = resultadoNumerador;
    }

    public String getResultadoDenominador() {
        return resultadoDenominador;
    }

    public void setResultadoDenominador(String resultadoDenominador) {
        this.resultadoDenominador = resultadoDenominador;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    
}
