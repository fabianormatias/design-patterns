package alura.dp.strategy.aplicando;

public class ICMS implements Imposto {
	
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
