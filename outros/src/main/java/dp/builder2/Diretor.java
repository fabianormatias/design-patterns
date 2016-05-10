package dp.builder2;

public class Diretor {

	private Builder builder;

	public Diretor(Builder builder) {
		this.builder = builder;
	}

	public Veiculo buildVeiculo() {
		return builder.build();
	}

}