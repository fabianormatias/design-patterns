//package br.com.waiso.dp.strategy.sem;
//
//import java.util.Scanner;
//
//public class Exemplo {
//
//	public static void main(String[] args) {
//
//		try (Scanner entrada = new Scanner(System.in)) {
//			System.out.print("Informe a distância: ");
//			int distancia = entrada.nextInt();
//			
//			System.out.print("Qual é o tipo de frete? (1) Normal, (2) Sedex: ");
//			int opcaoFrete = entrada.nextInt();
//			
//			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
//			Frete frete = new Frete(tipoFrete);
//			double preco = frete.calcularDistancia(distancia);
//			System.out.printf("O valor total é de R$%.2f", preco);
//		}
//	}
//
//}
