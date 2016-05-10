package alura.dp.decorate.aplicando;

public class TesteDeImpostosComplexos {
	
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS());
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calculaImposto(orcamento);
		
		System.out.println(valor);
	}

}
