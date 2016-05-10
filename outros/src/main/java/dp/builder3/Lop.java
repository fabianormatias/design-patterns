package dp.builder3;

class Lop<B extends Lop.Builder<B>> extends Rabbit<B> {

	float earLength;

	public Lop(Builder<B> builder) {
		super(builder);
		this.earLength = builder.earLength;
	}

	public static class Builder<B extends Lop.Builder<B>> extends Rabbit.Builder<B> {

		protected float earLength;

		public B earLength(float earLength) {
			this.earLength = earLength;
			return (B) this;
		}

		@Override
		public Lop<B> build() {
			return new Lop<>(this);
		}
	}

	@Override
	public String toString() {
		return "Lop [earLength=" + earLength + "]";
	}

}