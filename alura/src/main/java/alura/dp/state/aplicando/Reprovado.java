package alura.dp.state.aplicando;

public class Reprovado implements EstadoDeUmOrcamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento REPROVADO não recebe desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos REPROVADOS não podem ser aprovados");
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos REPROVADOS não podem ser reprovados novamente");
	}

	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

}
