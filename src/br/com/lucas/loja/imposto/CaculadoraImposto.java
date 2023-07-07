package br.com.lucas.loja.imposto;

import br.com.lucas.loja.orcamentos.Orcamentos;

import java.math.BigDecimal;

public class CaculadoraImposto {
    public BigDecimal calcular(Orcamentos orcamentos){
        return orcamentos.getValor().multiply(new BigDecimal("0.1"));
    }
}
