package br.com.loja.orcamento;

import java.math.BigDecimal;

import br.com.loja.orcamento.situacao.EmAnalise;
import br.com.loja.orcamento.situacao.Finalizado;
import br.com.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
	
	private int quantidadeItens;
	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovado(this);
	}
	
	public void reprovar() {
		this.situacao.reprovado(this);
	}
	
	public void finalizado() {
		this.situacao.finalizado(this);
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public BigDecimal getValor() {
		return valor;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}
	
	
}
