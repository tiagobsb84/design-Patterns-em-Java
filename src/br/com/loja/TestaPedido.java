package br.com.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GerarPedidoHandler;
import br.com.loja.pedido.acao.EnviarEmailNovosPedidos;
import br.com.loja.pedido.acao.SalvarPedidoNoBancoDados;

public class TestaPedido {

	public static void main(String[] args) {
		String cliente = "Fulano";
		BigDecimal valorOrcamento = new BigDecimal("300.99");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

		GerarPedidoHandler handle = new GerarPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDados(),
						new EnviarEmailNovosPedidos()
						)
				);
		handle.execute(gerador);

	}

}
