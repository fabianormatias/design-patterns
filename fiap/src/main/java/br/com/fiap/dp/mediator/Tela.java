package br.com.fiap.dp.mediator;

import java.awt.Font;

import javax.swing.JLabel;

class Tela extends JLabel {

	private static final long serialVersionUID = -5150972283782441022L;

	Mediator med;

	Tela(Mediator m) {
		super("Sistema de reserva de livros");
		med = m;
		med.registerDisplay(this);
		setFont(new Font("Arial", Font.BOLD, 24));
	}

}
