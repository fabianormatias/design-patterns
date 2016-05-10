package dp.builder4;

public class Empresa {

	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;

	public Empresa comNomeFantasia(final String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
		return this;
	}

	public Empresa comRazaoSocial(final String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public Empresa comCnpj(final String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public Empresa build() {
		return new Empresa();
	}
	
}