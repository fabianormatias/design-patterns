package br.com.waiso.dp.factorymethod;

import org.junit.Test;

public class TesteFactoryMethod {

	@Test
	public void test() {
		
		Emissor emissorSms = new EmissorSMS(); 
		emissorSms.envia("K19 - Treinamentos / SMS");
		
		Emissor emissorEmail = new EmissorEmail();
		emissorEmail.envia("K19 - Treinamentos / Email");
		
		Emissor emissorJms = new EmissorJMS();
		emissorJms.envia("K19 - Treinamentos / JMS");
		
		EmissorCreator creatorSMS = new EmissorAssincronoCreator();
		Emissor emissorSMS = creatorSMS.create(EmissorCreator.SMS); 
		emissorSMS.envia("K19 - Treinamentos / SMS");
		
		EmissorCreator creatorEmail = new EmissorAssincronoCreator();
		Emissor emissorEMAIL = creatorEmail.create(EmissorCreator.EMAIL); 
		emissorEMAIL.envia("K19 - Treinamentos / EMAIL");
		
		EmissorCreator creatorJMS = new EmissorAssincronoCreator();
		Emissor emissorJMS = creatorJMS.create(EmissorCreator.JMS); 
		emissorJMS.envia("K19 - Treinamentos / JMS");
		
	}

}
