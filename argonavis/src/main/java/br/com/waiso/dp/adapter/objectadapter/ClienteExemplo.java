package br.com.waiso.dp.adapter.objectadapter;

public class ClienteExemplo {

	Alvo[] alvos = new Alvo[10];

	public void inicializaAlvos() {
		alvos[0] = new Adaptador();
//		alvos[1] = new AlvoExistente();
	}

	public void executaAlvos() {
		for (int i = 0; i < alvos.length; i++) {
			alvos[i].operacao();
		}
	}

}
