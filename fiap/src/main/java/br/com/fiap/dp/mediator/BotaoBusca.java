package br.com.fiap.dp.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

//A concrete colleague
class BotaoBusca extends JButton implements Command {

	private static final long serialVersionUID = -7139373224015940259L;
	
	Mediator med;

	BotaoBusca(ActionListener al, Mediator m) {
		super("Busca");
		addActionListener(al);
		med = m;
		med.registerSearch(this);
	}

	public void execute() {
		med.search();
	}

}
