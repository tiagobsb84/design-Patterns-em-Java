package br.com.loja.orcamento;

import java.math.BigDecimal;

import br.com.loja.desconto.Desconto;

public class SemDesconto extends Desconto {

	public SemDesconto(Desconto proximo) {
		super(null);
		
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

}
