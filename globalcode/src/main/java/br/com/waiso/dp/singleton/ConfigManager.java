package br.com.waiso.dp.singleton;

public class ConfigManager {

	private static ConfigManager instance = new ConfigManager();
	private String serverName;

	private ConfigManager() {
	}
	
	public static ConfigManager getInstance() {
		return instance;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
}