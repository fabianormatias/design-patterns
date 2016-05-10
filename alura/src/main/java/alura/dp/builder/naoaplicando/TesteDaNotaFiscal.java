package alura.dp.builder.naoaplicando;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		List<ItemDaNota> lista = Arrays.asList(new ItemDaNota("item 1", 100), new ItemDaNota("item 2", 200));
		
		double valorTotal = 0;
		
		for (ItemDaNota itemDaNota : lista) {
			valorTotal += itemDaNota.getValor();
		}
		
		double impostos = valorTotal * 0.05;
		
		NotaFiscal nf = new NotaFiscal("razao socia", "cnpj", Calendar.getInstance(), valorTotal, impostos, lista, "bla bla bla");
	}

}
