package br.com.waiso.dp.strategy.com;

public class Sedex implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 1.45 + 12;
	}

}
