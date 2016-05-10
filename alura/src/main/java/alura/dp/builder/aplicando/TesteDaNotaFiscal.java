package alura.dp.builder.aplicando;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder
			.paraEmpresa("Supprema")
			.comCnpj("cnpj")
			.comItem(new ItemDaNota("item 1", 100))
			.comItem(new ItemDaNota("item 2", 200))
			.comItem(new ItemDaNota("item 3", 300))
			.comObservacoes("observacao")
			.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}

}