package br.com.fiap.dp.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

//A concrete colleague
class BotaoReserva extends JButton implements Command {

	private static final long serialVersionUID = 8901725465901272239L;

	Mediator med;

	BotaoReserva(ActionListener al, Mediator m) {
		super("Reserva");
		addActionListener(al);
		med = m;
		med.registerBook(this);
	}

	public void execute() {
		med.book();
	}

}
