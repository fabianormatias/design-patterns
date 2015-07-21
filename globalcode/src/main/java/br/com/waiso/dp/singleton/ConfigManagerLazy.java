package br.com.waiso.dp.singleton;

public class ConfigManagerLazy {

	private static ConfigManagerLazy instance;
	private String serverName;

	private ConfigManagerLazy() {
	}

	public static synchronized ConfigManagerLazy getInstance() {
		if (instance == null) instance = new ConfigManagerLazy();
			return instance;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
}