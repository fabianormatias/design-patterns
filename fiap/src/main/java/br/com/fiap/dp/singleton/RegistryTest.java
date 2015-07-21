package br.com.fiap.dp.singleton;

public class RegistryTest {

	public static void main(String[] args) {
		Registry a = Registry.getInstance("a");
		Registry b = Registry.getInstance("b");
		Registry c = Registry.getInstance("c");

		Registry a2 = Registry.getInstance("a");
		Registry b2 = Registry.getInstance("b");
		Registry c2 = Registry.getInstance("c");

		check(a == a2, "a == a2");
		check(b == b2, "b == b2");
		check(c == c2, "c == c2");

		check(a != b, "a != b");
		check(a != c, "a != c");
		check(b != c, "b != c");

		check(!a.equals(b), "!a.equals(b)");
		check(!a.equals(c), "!a.equals(c)");
		check(!b.equals(c), "!b.equals(c)");
	}

	private static void check(boolean b, String msg) {
		if (b) {
			System.out.println("Assertion checked: " + msg);
		} else {
			System.out.println("Assertion failed: " + msg);
		}
	}

}
