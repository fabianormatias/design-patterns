package dp.builder3;

class Rabbit<B extends Rabbit.Builder<B>> {

	String colour;

	public Rabbit(Builder<B> builder) {
		this.colour = builder.colour;
	}

	public static class Builder<B extends Rabbit.Builder<B>> {

		protected String colour;

		public B colour(String colour) {
			this.colour = colour;
			return (B) this;
		}

		public Rabbit<B> build() {
			return new Rabbit<>(this);
		}
	}

	@Override
	public String toString() {
		return "Rabbit [colour=" + colour + "]";
	}
	
}