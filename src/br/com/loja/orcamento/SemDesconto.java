package br.com.loja.orcamento;

import java.math.BigDecimal;

import br.com.loja.desconto.Desconto;

public class SemDesconto extends Desconto {

	public SemDesconto(Desconto proximo) {
		super(null);
		
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
