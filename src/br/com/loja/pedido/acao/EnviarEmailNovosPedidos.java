package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class EnviarEmailNovosPedidos implements AcaoAposGeraPedido {

	public void acaoExecute(Pedido pedido) {
		System.out.println("Enviar email com dados do novo pedido");
	}
}
