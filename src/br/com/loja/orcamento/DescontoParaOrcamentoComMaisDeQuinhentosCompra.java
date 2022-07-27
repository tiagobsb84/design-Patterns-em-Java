package br.com.loja.orcamento;

import java.math.BigDecimal;

import br.com.loja.desconto.Desconto;

public class DescontoParaOrcamentoComMaisDeQuinhentosCompra extends Desconto {

	public DescontoParaOrcamentoComMaisDeQuinhentosCompra(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		 if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
				return orcamento.getValor().multiply(new BigDecimal("0.1"));
			}
		 
		 return proximo.calcular(orcamento);
	}

}
