package br.com.waiso.dp.singleton;

import org.junit.Test;

public class UsaConfigManager {

	@Test
	public void test() {

		String s = ConfigManager.getInstance().getServerName();

		ConfigManager config = ConfigManager.getInstance();
		config.setServerName("Teste1");
		String s1 = config.getServerName();
		System.out.println("Server: " + s1.toString());

	}

}
