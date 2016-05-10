package dp.builder2;

public class Veiculo {
	private final String marca; // obrigatorio
	private final String modelo; // obrigatorio
	private final Integer anoModelo; // obrigatorio
	private final Integer anoFabricacao; // obrigatorio
	private final String placa; // obrigatorio
	private final int quantidadePortas; // opcional
	private final String combustivel; // opcional

	public Veiculo(String marca, String modelo, Integer anoModelo, Integer anoFabricacao, String placa,
			int quantidadePortas, String combustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.quantidadePortas = quantidadePortas;
		this.combustivel = combustivel;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public String getCombustivel() {
		return combustivel;
	}

	@Override
	public String toString() {
		return "Veiculo " + this.getClass().getSimpleName() + " [marca=" + marca + ", modelo=" + modelo + ", anoModelo="
				+ anoModelo + ", anoFabricacao=" + anoFabricacao + ", placa=" + placa + ", quantidadePortas="
				+ quantidadePortas + ", combustivel=" + combustivel + "]";
	}

}