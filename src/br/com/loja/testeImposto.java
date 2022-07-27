package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.imposto.CalculadoraImposto;
import br.com.loja.imposto.ICMS;
import br.com.loja.orcamento.Orcamento;

public class testeImposto  {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraImposto calculadora = new CalculadoraImposto();
		System.out.println(calculadora.calculadora(orcamento, new ICMS()));
	}	
}
