package alura.dp.chainofresponsibility.naoaplicando;

public class CalculadorDeDescontos {
	
	public double calcuma(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.01;
		}
		
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.005;
		}
		
		return 0;
	}

}
