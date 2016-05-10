//package alura.dp.decorator.aplicando;
//
//public abstract class TemplateDeImpostoCondicional extends Imposto {
//	
//	public double calcula(Orcamento orcamento) {
//		if (deveUsarMaximaTaxacao(orcamento)) {
//			return maximaTaxacao(orcamento) + caculoOutroImposto(orcamento);
//		} else {
//			return minimaTaxacao(orcamento) + caculoOutroImposto(orcamento);
//		}
//	}
//	
//	public abstract double minimaTaxacao(Orcamento orcamento);
//	
//	public abstract double maximaTaxacao(Orcamento orcamento);
//	
//	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
//
//}
