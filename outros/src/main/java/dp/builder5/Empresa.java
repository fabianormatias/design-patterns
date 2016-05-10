package dp.builder5;

public class Empresa<A> {

	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;

	public Empresa(Builder<A> builder) {
		this.nomeFantasia = builder.nomeFantasia;
		this.razaoSocial = builder.razaoSocial;
		this.cnpj = builder.cnpj;
	}	
	
	public static class Builder<A> {

		private String nomeFantasia;
		private String razaoSocial;
		private String cnpj;

		public A nomeFantasia(String nomeFantasia) {
			this.nomeFantasia = nomeFantasia;
			return (A) this;
		}
		
		public A razaoSocial(String razaoSocial) {
			this.razaoSocial = razaoSocial;
			return (A) this;
		}
		
		public A cnpj(String cnpj) {
			this.cnpj = cnpj;
			return (A) this;
		}

		public Empresa<A> build() {
			return new Empresa<>(this);
		}
	}
}