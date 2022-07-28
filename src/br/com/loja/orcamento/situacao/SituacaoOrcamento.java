package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.DomainException;
import br.com.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovado(Orcamento orcamento) {
		throw new DomainException("Orcamento n�o pode ser aprovado!");
	}
	
	public void reprovado(Orcamento orcamento) {
		throw new DomainException("Orcamento n�o pode ser reprovado!");
	}
	
	public void finalizado(Orcamento orcamento) {
		throw new DomainException("Orcamento n�o pode ser finalizado!");
	}
}
