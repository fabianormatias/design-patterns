package alura.dp.chainofresponsibility.aplicando;

public class TesteDeDescontos {
	
	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(600);
		orcamento.adicionaItem(new Item("caneta", 100));
		orcamento.adicionaItem(new Item("lapis", 100));
		orcamento.adicionaItem(new Item("borracha", 100));
		orcamento.adicionaItem(new Item("caderno", 100));
		orcamento.adicionaItem(new Item("regua", 100));
		orcamento.adicionaItem(new Item("pincel", 100));
		
		double descontoFinal = descontos.calcula(orcamento);
		System.out.println(descontoFinal);
	}

}
