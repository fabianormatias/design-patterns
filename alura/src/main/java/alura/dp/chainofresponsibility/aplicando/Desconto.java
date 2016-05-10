package alura.dp.chainofresponsibility.aplicando;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	
	void setProximo(Desconto proximo);

}
