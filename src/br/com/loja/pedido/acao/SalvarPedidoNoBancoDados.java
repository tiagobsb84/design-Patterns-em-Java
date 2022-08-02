package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDados implements AcaoAposGeraPedido {

	public void acaoExecute(Pedido pedido) {
		System.out.println("Salvar pedido no Banco de Dados");
	}

}
