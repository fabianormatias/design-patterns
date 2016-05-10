package alura.dp.strategy.naoaplicando;

public class CalculadorDeImpostos {

	/**
	 * @problema Conforme for aumentando a quantidade de impostos, vai aumentar a quantidade de ifs no método realizaCalculo
	 * 
	 * @param orcamento
	 * @param imposto
	 */
	public void realizaCalculo(Orcamento orcamento, String imposto) {
		if (imposto.equals("ICMS")) {
			double icms = orcamento.getValor() * 0.1;
			System.out.println("Valor do ICMS: " + icms);
		} else if (imposto.equals("ISS")) {
			double iss = orcamento.getValor() * 0.06;
			System.out.println("Valor do ISS: " + iss);
		}
	}

}
