package br.com.fiap.dp.factorymethod.titulo.teste;

import br.com.fiap.dp.factorymethod.titulo.Cobranca;
import br.com.fiap.dp.factorymethod.titulo.CobrancaItau;

public class CobrancaItauTeste {

	public static void main(String[] args) {
		Cobranca cobrancaItau = new CobrancaItau();
		cobrancaItau.criarTitulo();
		System.out.println(cobrancaItau.obterCodigoBarras());
	}

}
