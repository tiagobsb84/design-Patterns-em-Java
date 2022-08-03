package br.com.loja.orcamento;

import java.util.Map;

import br.com.loja.DomainException;
import br.com.loja.http.HttpAdapter;

public class RegistroOrcamento {
	
	private HttpAdapter http;
	
	public RegistroOrcamento(HttpAdapter httpAdapter) {
		this.http = httpAdapter;
	}

	public void registra(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento não finalizado");
		}
		
		String url = "http://api.externo/orcamento";
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeItens()
				);
		http.post(url, dados);
	}
}
