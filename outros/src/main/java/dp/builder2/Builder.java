package dp.builder2;

public interface Builder {

	public Builder marca(String marca);

	public Builder modelo(String modelo);

	public Builder anoModelo(int anoModelo);

	public Builder anoFabricacao(int anoFabricacao);

	public Builder placa(String placa);

	public Builder quantidadePortas(int quantidadePortas);

	public Builder combustivel(String combustivel);

	public Veiculo build();
}