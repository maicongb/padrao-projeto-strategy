package org.example;

import loja.Orcamento;
import loja.imposto.CalculadoraDeImposto;
import loja.imposto.ICMS;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

        System.out.println(calculadoraDeImposto.calcular(orcamento, new ICMS()));
    }
}