package alura.dp.decorate.naoaplicando;

public class ISS implements Imposto {
	
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
