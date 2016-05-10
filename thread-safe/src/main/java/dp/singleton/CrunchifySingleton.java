package dp.singleton;

public class CrunchifySingleton {

	private static CrunchifySingleton instance = null;

	protected CrunchifySingleton() {
	}

	// Lazy Initialization (If required then only)
	public static CrunchifySingleton getInstance() {
		if (instance == null) {
			// Thread Safe. Might be costly operation in some case
			synchronized (CrunchifySingleton.class) {
				if (instance == null) {
					instance = new CrunchifySingleton();
				}
			}
		}
		return instance;
	}
}