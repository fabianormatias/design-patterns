package br.com.waiso.dp.strategy.com;

public class Normal implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 1.25 + 10;
	}

}
