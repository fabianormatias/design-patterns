package br.com.fiap.dp.state.compadrao;

class Media implements Estado {
	
	public void ligar(Ventilador ventilador) {
		ventilador.setEstado(new Alta());
		System.out.println("Velocidade media");
	}
	
}
