package alura.dp.decorator.aplicando;

public class TesteImpostosComplexos {
	
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS());
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
	}

}
