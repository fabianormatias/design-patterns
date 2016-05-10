package alura.dp.strategy.aplicando;

public class CalculadorDeImpostos {

	/**
	 * @problema Conforme for aumentando a quantidade de impostos, vai aumentar a quantidade de ifs no método realizaCalculo
	 * 
	 * @param orcamento
	 * @param imposto
	 */
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double imp = impostoQualquer.calculaImposto(orcamento);
		System.out.println("Valor do Imposto: " + imp);
	}

}
