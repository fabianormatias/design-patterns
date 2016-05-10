package alura.dp.templatemethod.aplicando;

public class TesteTemplateMethod {

	public static void main(String[] args) {
		Imposto imposto1 = new ICPP();
		Imposto imposto2 = new IKCV();

		Orcamento orcamento = new Orcamento(600);
		orcamento.adicionaItem(new Item("caneta", 100));
		orcamento.adicionaItem(new Item("lapis", 100));
		orcamento.adicionaItem(new Item("borracha", 100));
		orcamento.adicionaItem(new Item("caderno", 100));
		orcamento.adicionaItem(new Item("regua", 100));
		orcamento.adicionaItem(new Item("pincel", 100));

		double icpp = imposto1.calculaImposto(orcamento);
		double ikcv = imposto2.calculaImposto(orcamento);
		
		System.out.println("ICPP: " + icpp);
		System.out.println("IKCV: " + ikcv);
	}

}