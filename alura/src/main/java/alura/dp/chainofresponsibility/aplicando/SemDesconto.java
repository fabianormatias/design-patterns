package alura.dp.chainofresponsibility.aplicando;

public class SemDesconto implements Desconto {

	public double desconta(Orcamento orcamento) {
		return 0;
	}

	public void setProximo(Desconto proximo) {
		//Não tem
	}

}