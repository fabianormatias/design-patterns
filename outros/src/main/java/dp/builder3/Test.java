package dp.builder3;

public class Test {

	public void test() {
		Rabbit rabbit = new Rabbit.Builder<>().colour("White").build();
		Lop lop1 = new Lop.Builder<>().earLength(1.4F).colour("Brown").build();
		Lop lop2 = new Lop.Builder<>().colour("Brown").earLength(1.4F).build();
		
		System.out.println(lop2.colour);
		
	}

	public static void main(String args[]) {
		try {
			new Test().test();
		} catch (Throwable t) {
			t.printStackTrace(System.err);
		}
	}
}