package alura.dp.decorate.aplicando;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(final Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {}
	
	public abstract double calculaImposto(Orcamento orcamento);
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (outroImposto == null) {
			return 0;
		}
		return outroImposto.calculaImposto(orcamento);
	}

}
