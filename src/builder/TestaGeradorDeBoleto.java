package builder;

public class TestaGeradorDeBoleto {
	
	public static void main ( String [] args ) {
		BoletoBuilder boletoBuilder = new BBBoletoBuilder () ;
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto ( boletoBuilder ) ;
		Boletos boletos = geradorDeBoleto . geraBoleto () ;
		System . out . println ( boletos ) ;
		}

}
