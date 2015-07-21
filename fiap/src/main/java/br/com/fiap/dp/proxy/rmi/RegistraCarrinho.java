package br.com.fiap.dp.proxy.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RegistraCarrinho {

	public static void main(String[] args) throws Exception {
		LocateRegistry.createRegistry(1099);
		Naming.rebind("fiap/carrinho", new CarrinhoBean());
		System.out.println("carrinho registrado no RMIRegistry");
	}
}
