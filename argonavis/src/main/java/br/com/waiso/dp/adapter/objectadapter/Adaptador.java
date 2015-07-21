package br.com.waiso.dp.adapter.objectadapter;

public class Adaptador extends Alvo {

	ClasseExistente existente = new ClasseExistente();

	public void operacao() {
		String texto = existente.metodoUtilDois("Operação Realizada.");
		existente.metodoUtilUm(texto);
	}

}
