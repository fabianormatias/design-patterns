package dp.builder4;

public class Endereco<B extends Endereco.Builder<B>> {
	
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	
	public Endereco(Builder<B> builder) {
		this.cep = builder.cep;
	}
	
	public static class Builder<B extends Endereco.Builder<B>> {

		private String cep;
		private String logradouro;
		private String numero;
		private String complemento;
		private String bairro;

		public B cep(String cep) {
			this.cep = cep;
			return (B) this;
		}
		
		public B logradouro(String logradouro) {
			this.logradouro = logradouro;
			return (B) this;
		}
		
		public B numero(String numero) {
			this.numero = numero;
			return (B) this;
		}
		
		public B complemento(String complemento) {
			this.complemento = complemento;
			return (B) this;
		}
		
		public B bairro(String bairro) {
			this.bairro = bairro;
			return (B) this;
		}

		public Endereco<B> build() {
			return new Endereco<>(this);
		}
	}
	
}