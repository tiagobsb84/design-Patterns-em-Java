package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.DescontoParaOrcamentoComMaisDeCincoItens;
import br.com.loja.orcamento.DescontoParaOrcamentoComMaisDeQuinhentosCompra;
import br.com.loja.orcamento.Orcamento;
import br.com.loja.orcamento.SemDesconto;

public class CalculadoraDesconto {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens (
			new DescontoParaOrcamentoComMaisDeQuinhentosCompra (
					new SemDesconto(null)
					)
				);
		
		return desconto.calcular(orcamento);
	}
}
