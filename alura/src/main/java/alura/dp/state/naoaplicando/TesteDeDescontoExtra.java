package alura.dp.state.naoaplicando;

public class TesteDeDescontoExtra {
	
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	}

}
