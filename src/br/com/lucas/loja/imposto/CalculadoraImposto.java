package br.com.lucas.loja.imposto;

import br.com.lucas.loja.orcamentos.Orcamentos;

import java.math.BigDecimal;

public class CalculadoraImposto {
    public BigDecimal calcular(Orcamentos orcamentos , TipoImposto tipoImposto){
        switch (tipoImposto){
            case ICMS -> {return orcamentos.getValor().multiply(new BigDecimal("0.1"));}
            case ISS -> {return orcamentos.getValor().multiply(new BigDecimal("0.6"));}
            default ->  {return BigDecimal.ZERO;}
        }

    }
}
