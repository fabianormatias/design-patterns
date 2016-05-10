package alura.dp.decorator.aplicando;

public abstract class Imposto {

	public Imposto outroImposto;
	
	public Imposto() {}
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	public double caculoOutroImposto(Orcamento orcamento) {
		if (orcamento == null) return 0;
		return outroImposto.calcula(orcamento);
	}

}
