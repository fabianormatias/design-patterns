package dp.builder4;

public class Proprietario<B extends Proprietario.Builder<B>> {

	private Empresa empresa;
	private Endereco endereco;
	
	public Proprietario(Builder<B> builder) {
		this.empresa = builder.empresa;
		this.endereco = builder.endereco;
	}
	
	public static class Builder<B extends Proprietario.Builder<B>> {

		private Empresa empresa;
		private Endereco endereco;

		public B daEmpresa(Empresa empresa) {
			this.empresa = empresa;
			return (B) this;
		}
		
		public B localizadaNoEndereco(Endereco endereco) {
			this.endereco = endereco;
			return (B) this;
		}

		public Proprietario<B> build() {
			return new Proprietario<>(this);
		}
	}
	
}