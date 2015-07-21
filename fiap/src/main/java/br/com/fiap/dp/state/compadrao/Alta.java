package br.com.fiap.dp.state.compadrao;

class Alta implements Estado {
	
	public void ligar(Ventilador ventilador) {
		ventilador.setEstado(new Desligado());
		System.out.println("Desligado");
	}
	
}
