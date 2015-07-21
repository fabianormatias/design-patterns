package br.com.fiap.dp.decorator;

import java.io.File;

import br.com.fiap.dp.decorator.common.InfoEstrutura;
import br.com.fiap.dp.decorator.common.InterfaceNegocio;

public class RegrasNegocio implements InterfaceNegocio {

	public InfoEstrutura obterTamanhoEstrutura(File file) {
		InfoEstrutura info = new InfoEstrutura();
		info.setTamanho(file.length());
		return info;
	}

}
