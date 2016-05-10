package alura.dp.decorate.aplicando;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	public double calculaImposto(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
		
		return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);
}