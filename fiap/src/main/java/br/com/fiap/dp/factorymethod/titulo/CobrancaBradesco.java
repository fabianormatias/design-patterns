package br.com.fiap.dp.factorymethod.titulo ;

public class CobrancaBradesco extends Cobranca
{

	TituloPagamento criarTituloPagamento( )
	{
		return new TituloPagamentoBradesco( "987654321" ) ;
	}

}
