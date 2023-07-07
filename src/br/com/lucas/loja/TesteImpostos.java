package br.com.lucas.loja;

import br.com.lucas.loja.imposto.CalculadoraImposto;
import br.com.lucas.loja.imposto.TipoImposto;
import br.com.lucas.loja.orcamentos.Orcamentos;

import java.math.BigDecimal;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamentos orcamentos = new Orcamentos(new BigDecimal("100"));
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        System.out.println(calculadoraImposto.calcular(orcamentos, TipoImposto.ISS));
    }
}
