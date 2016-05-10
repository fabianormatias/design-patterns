package alura.dp.templatemethod.aplicando;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	public double calculaImposto(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		
		return minimaTaxacao(orcamento);
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);
}