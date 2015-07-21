package br.com.fiap.dp.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean extends UnicastRemoteObject implements Carrinho {

	private static final long serialVersionUID = 269486222690890452L;
	
	private List<Item> itens = new ArrayList<Item>();

	protected CarrinhoBean() throws RemoteException {
		super();
	}

	public void cadastrarItem(Item item) throws RemoteException {
		itens.add(item);
		System.out.println("Item cadastrado com sucesso: " + item.getNome());
	}

	public List<Item> obterItens() throws RemoteException {
		return this.itens;
	}

	public int obterQuantidadeItens() throws RemoteException {
		return this.itens.size();
	}
}
