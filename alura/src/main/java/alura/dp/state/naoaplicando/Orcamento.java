package alura.dp.state.naoaplicando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private double valor;
	private final List<Item> itens;
	
	private int estadoAtual;
	public static final int EM_APROVACAO = 1;
	public static final int APROVADO = 2;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}

	public double getValor() {
		return this.valor;
	}
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		if (estadoAtual == EM_APROVACAO)
			valor = valor - (valor * 0.05);
		else if (estadoAtual == APROVADO)
			valor = valor - (valor * 0.02);
		else throw new RuntimeException("Somente orçamento em aprovação ou aprovados recebem descontos");
	}

}