package br.com.loja.orcamento;

import java.math.BigDecimal;

import br.com.loja.desconto.Desconto;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

}
