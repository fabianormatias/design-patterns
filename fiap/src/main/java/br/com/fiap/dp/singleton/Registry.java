package br.com.fiap.dp.singleton;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private String name;

	private Registry(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Registry)) {
			return false;
		}
		Registry other = (Registry) obj;
		return this.getName().equals(other.getName());
	}

	public String toString() {
		return getName();
	}

	private static Map<String, Registry> instances = new HashMap<String, Registry>();

	public static Registry getInstance(String name) {
		Registry instance = instances.get(name);
		if (instance == null) {
			instance = new Registry(name);
			instances.put(name, instance);
		}
		return instance;
	}
}
