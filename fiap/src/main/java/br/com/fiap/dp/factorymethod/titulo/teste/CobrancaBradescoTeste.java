package br.com.fiap.dp.factorymethod.titulo.teste;

import br.com.fiap.dp.factorymethod.titulo.Cobranca;
import br.com.fiap.dp.factorymethod.titulo.CobrancaBradesco;

public class CobrancaBradescoTeste {

	public static void main(String[] args) {
		Cobranca cobrancaBradesco = new CobrancaBradesco();
		cobrancaBradesco.criarTitulo();
		System.out.println(cobrancaBradesco.obterCodigoBarras());
	}

}
