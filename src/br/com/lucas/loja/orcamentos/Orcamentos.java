package br.com.lucas.loja.orcamentos;

import java.math.BigDecimal;

public class Orcamentos {
    private BigDecimal valor;

    public Orcamentos(BigDecimal valor) {
        this.valor = valor;
    }
    public BigDecimal getValor() {
        return valor;
    }
}
