package br.com.loja.orcamento;

import java.math.BigDecimal;

import br.com.loja.desconto.Desconto;

public class DescontoParaOrcamentoComMaisDeQuinhentosCompra extends Desconto {

	public DescontoParaOrcamentoComMaisDeQuinhentosCompra(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		
		return orcamento.getValor().multiply(new BigDecimal("0.1"));	 
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
