package dp.builder5;

public class Proprietario<A> {

	private Empresa empresa;
	private Endereco endereco;
	
	public Proprietario(Builder<A> builder) {
		this.empresa = builder.empresa;
		this.endereco = builder.endereco;
	}
	
	public static class Builder<A> {

		private Empresa empresa;
		private Endereco endereco;

		public A daEmpresa(Empresa empresa) {
			this.empresa = empresa;
			return (A) this;
		}
		
		public A localizadaNoEndereco(Endereco endereco) {
			this.endereco = endereco;
			return (A) this;
		}

		public A build() {
			return (A) new Proprietario(this);
		}
	}
	
}