package alura.dp.templatemethod.naoaplicando;

public class IKCV implements Imposto {

	public double calculaImposto(Orcamento orcamento) {
		if (orcamento.getValor() > 500 && temItemMaiorQueCemReaisNo(orcamento)) {
			return orcamento.getValor() * 0.1;
		}
		
		return orcamento.getValor() * 0.06;
	}

	private boolean temItemMaiorQueCemReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}
		return false;
	}

}