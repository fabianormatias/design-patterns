package alura.dp.state.aplicando;

public class Finalizado implements EstadoDeUmOrcamento {
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento FINALIZADO não recebe desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos FINALIZADOS não podem ser aprovados novamente");
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos FINALIZADOS não podem ser reprovados novamente");
	}

	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos FINALIZADOS não podem ser finalizados novamente");
	}

}
