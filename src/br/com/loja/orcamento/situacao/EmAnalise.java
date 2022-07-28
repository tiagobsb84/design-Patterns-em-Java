package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void aprovado(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovado(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
}
