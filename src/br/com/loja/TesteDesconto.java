package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.desconto.CalculadoraDesconto;
import br.com.loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("600"), 2);
		
		CalculadoraDesconto calcular = new CalculadoraDesconto();
		System.out.println(calcular.calcular(primeiro));
		System.out.println(calcular.calcular(segundo));
	}
}
