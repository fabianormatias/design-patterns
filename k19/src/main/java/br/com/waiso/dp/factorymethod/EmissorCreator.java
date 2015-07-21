package br.com.waiso.dp.factorymethod;

public class EmissorCreator {

	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;

	public Emissor create(int tipoDeEmissor) {
		if (tipoDeEmissor == EmissorCreator.SMS) {
			return new EmissorSMS();
		}
		if (tipoDeEmissor == EmissorCreator.EMAIL) {
			return new EmissorEmail();
		}
		if (tipoDeEmissor == EmissorCreator.JMS) {
			return new EmissorJMS();
		} else {
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}
}
