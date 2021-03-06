package br.com.fiap.dp.proxy.cliente;

import java.rmi.Naming;

import br.com.fiap.dp.proxy.rmi.Carrinho;
import br.com.fiap.dp.proxy.rmi.Item;

public class ClienteCarrinho {
	
	public static void main(String[] args) throws Exception {

		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://localhost:1099/fiap/carrinho");
		System.out.println(carrinho.getClass());

		Item item1 = new Item();
		item1.setNome("Item 1");
		item1.setPreco(3.0);

		Item item2 = new Item();
		item2.setNome("Item 2");
		item2.setPreco(5.0);

		carrinho.cadastrarItem(item1);
		carrinho.cadastrarItem(item2);

		System.out.println(carrinho.obterQuantidadeItens());
	}
}
