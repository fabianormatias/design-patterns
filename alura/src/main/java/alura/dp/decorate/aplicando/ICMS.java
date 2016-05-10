package alura.dp.decorate.aplicando;

public class ICMS extends Imposto {
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICMS() {}
	
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
	}

}
