package dp.builder5;

public class Endereco<A> {
	
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	
	public Endereco(Builder<A> builder) {
		this.cep = builder.cep;
		this.logradouro = builder.logradouro;
		this.numero = builder.numero;
		this.complemento = builder.complemento;
		this.bairro = builder.bairro;
	}
	
	public static class Builder<A> {

		private String cep;
		private String logradouro;
		private String numero;
		private String complemento;
		private String bairro;

		public A cep(String cep) {
			this.cep = cep;
			return (A) this;
		}
		
		public A logradouro(String logradouro) {
			this.logradouro = logradouro;
			return (A) this;
		}
		
		public A numero(String numero) {
			this.numero = numero;
			return (A) this;
		}
		
		public A complemento(String complemento) {
			this.complemento = complemento;
			return (A) this;
		}
		
		public A bairro(String bairro) {
			this.bairro = bairro;
			return (A) this;
		}

		public Endereco<A> build() {
			return new Endereco<>(this);
		}
	}
	
}