package dp.builder2;

public class Sistema {

	public static void main(String[] args) {

		Builder automovelBuilder = new AutomovelBuilder();

		automovelBuilder.marca("Fiat").modelo("Siena").anoFabricacao(2011).anoModelo(2012);

		Veiculo v = automovelBuilder.build();

		Diretor d = new Diretor(automovelBuilder);

		Veiculo automovel = d.buildVeiculo();

		System.out.println(automovel);

	}

}