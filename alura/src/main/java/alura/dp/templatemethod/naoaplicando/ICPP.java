package alura.dp.templatemethod.naoaplicando;

public class ICPP implements Imposto {
	
	public double calculaImposto(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		
		return orcamento.getValor() * 0.05;
	}

}