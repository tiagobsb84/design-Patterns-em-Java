package br.com.loja.orcamento.situacao;

import br.com.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	@Override
	public void finalizado(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
