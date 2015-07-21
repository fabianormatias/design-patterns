package br.com.fiap.dp.factorymethod.titulo ;

public class CobrancaItau extends Cobranca
{

	TituloPagamento criarTituloPagamento( )
	{
		return new TituloPagamentoItau( "123456789" ) ;
	}
}
