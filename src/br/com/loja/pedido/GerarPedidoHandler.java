package br.com.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.acao.AcaoAposGeraPedido;

public class GerarPedidoHandler {

	List<AcaoAposGeraPedido> acao;
	
	public GerarPedidoHandler(List<AcaoAposGeraPedido> acao) {
		this.acao = acao;
	}

	public void execute(GeraPedido dado) {
		Orcamento orcamento = new Orcamento(dado.getValorOrcamento(), dado.getQuantidadeItens());
		Pedido pedido = new Pedido(dado.getCliente(), LocalDateTime.now(), orcamento);
		
		acao.forEach(x -> x.acaoExecute(pedido));
	}
}
