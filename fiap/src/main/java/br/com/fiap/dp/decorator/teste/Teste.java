package br.com.fiap.dp.decorator.teste;

import java.io.File;

import br.com.fiap.dp.decorator.RegrasNegocio;
import br.com.fiap.dp.decorator.common.InfoEstrutura;
import br.com.fiap.dp.decorator.common.InterfaceNegocio;
import br.com.fiap.dp.decorator.pattern.RegrasNegocioDecorator;

public class Teste {

	public static void main(String[] args) {

		// tela 1
		InterfaceNegocio objeto = new RegrasNegocio();
		InfoEstrutura info = objeto.obterTamanhoEstrutura(new File("c:\\windows\\system32\\sethc.exe"));
		System.out.println("\nTela 1\n" + info.getTamanho() + " bytes");

		// tela 2 com decorator
		InterfaceNegocio objetodecorado = new RegrasNegocioDecorator(objeto);
		InfoEstrutura info2 = objetodecorado.obterTamanhoEstrutura(new File("c:\\windows\\system32\\sethc.exe"));
		System.out.println("\nTela 2\n" +info2.getTamanho() + " MB");
		
		// tela 3
		System.out.println("\nTela 3\n" + info.getTamanho() + " bytes");
		
		// tela 4
		System.out.println("\nTela 4\n" +info.getTamanho() + " bytes");
		
		// tela 5
		System.out.println("\nTela 5\n" +info.getTamanho() + " bytes");
		
	}
}
