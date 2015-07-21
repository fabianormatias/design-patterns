package br.com.fiap.dp.state.compadrao;

class Ventilador {
	
	private Estado estadoCorrente;

	public Ventilador() {
		estadoCorrente = new Desligado();
	}

	public void setEstado(Estado estado) {
		estadoCorrente = estado;
	}

	public void ligar() {
		estadoCorrente.ligar(this);
	}
}
