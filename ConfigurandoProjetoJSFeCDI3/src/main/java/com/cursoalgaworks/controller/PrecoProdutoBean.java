package com.cursoalgaworks.controller;

import com.cursoalgaworks.service.CalculadoraPreco;
import javax.inject.Inject;
import javax.inject.Named;


@Named("meuBean")
public class PrecoProdutoBean{
    
    @Inject
    private CalculadoraPreco calculadora;
    
    public double getPreco(){
        return calculadora.calcularPreco(12, 44.55);
    }
    
}