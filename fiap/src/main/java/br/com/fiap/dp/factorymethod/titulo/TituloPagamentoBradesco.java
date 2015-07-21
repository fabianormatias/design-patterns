package br.com.fiap.dp.factorymethod.titulo ;

public class TituloPagamentoBradesco implements TituloPagamento
{

	private String codigoBarras ;

	public TituloPagamentoBradesco( String codigoBarras )
	{
		this.codigoBarras = codigoBarras ;
	}

	public String getCodigoBarras( )
	{
		return codigoBarras ;
	}

}
