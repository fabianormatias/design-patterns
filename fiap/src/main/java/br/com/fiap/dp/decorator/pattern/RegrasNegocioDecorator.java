package br.com.fiap.dp.decorator.pattern;

import java.io.File;

import br.com.fiap.dp.decorator.common.InfoEstrutura;
import br.com.fiap.dp.decorator.common.InterfaceNegocio;

public class RegrasNegocioDecorator implements InterfaceNegocio {

	InterfaceNegocio regrasNegocioOriginal;

	public RegrasNegocioDecorator(InterfaceNegocio interfaceNegocio) {
		this.regrasNegocioOriginal = interfaceNegocio;
	}

	public InfoEstrutura obterTamanhoEstrutura(File file) {
		InfoEstrutura info = regrasNegocioOriginal.obterTamanhoEstrutura(file);
		info.setTamanho(info.getTamanho() / 1024);
		return info;
	}

}
