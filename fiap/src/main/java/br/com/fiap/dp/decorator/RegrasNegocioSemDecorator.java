package br.com.fiap.dp.decorator;

import java.io.File;

import br.com.fiap.dp.decorator.common.InfoEstrutura;

public class RegrasNegocioSemDecorator {

	public InfoEstrutura obterTamanhoEstrutura(File file, byte tipoRetorno) {
		InfoEstrutura info = new InfoEstrutura();
		if (tipoRetorno == 1) {
			info.setTamanho(file.length());
		} else if (tipoRetorno == 2) {
			info.setTamanho(file.length() / 1024);
		}
		return info;
	}
}
