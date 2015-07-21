package br.com.fiap.dp.factorymethod.titulo;

public abstract class Cobranca {

	private TituloPagamento tituloPagamento;

	abstract TituloPagamento criarTituloPagamento(); // factory method

	public void criarTitulo() {
		this.tituloPagamento = this.criarTituloPagamento();
	}

	public String obterCodigoBarras() {
		return this.tituloPagamento.getCodigoBarras();
	}

}
