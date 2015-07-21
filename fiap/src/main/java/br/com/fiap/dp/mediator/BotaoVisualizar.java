package br.com.fiap.dp.mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

//A concrete colleague
class BotaoVisualizar extends JButton implements Command {

	private static final long serialVersionUID = 310992634744456070L;
	
	Mediator med;

	BotaoVisualizar(ActionListener al, Mediator m) {
		super("Visualiza");
		addActionListener(al);
		med = m;
		med.registerView(this);
	}

	public void execute() {
		med.view();
	}

}
