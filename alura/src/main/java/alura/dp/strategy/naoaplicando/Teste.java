package alura.dp.strategy.naoaplicando;

public class Teste {

	public static void main(String[] args) {
		CalculadorDeImpostos calculadorICMS = new CalculadorDeImpostos();
		calculadorICMS.realizaCalculo(new Orcamento(100.0), "ICMS");
		
		CalculadorDeImpostos calculadorISS = new CalculadorDeImpostos();
		calculadorISS.realizaCalculo(new Orcamento(100.0), "ISS");
	}

}
