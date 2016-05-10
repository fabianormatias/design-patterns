package alura.dp.decorate.naoaplicando;

public class TesteDeImpostosComplexos {
	
	public static void main(String[] args) {
		Imposto iss = new ISS();
		//Seria necessário criar diversos impostos
//		Imposto icmsComIcpp = new ICMSComIcpp();
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calculaImposto(orcamento);
		
		System.out.println(valor);
	}

}
