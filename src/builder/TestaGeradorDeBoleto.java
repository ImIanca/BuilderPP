package builder;

public class TestaGeradorDeBoleto {
	
	public static void main ( String [] args ) {
		BoletoBuilder boletoBuilder1 = new BoletoBradescoBuilder () ;
		GeradorDeBoleto geradorDeBoleto1 = new GeradorDeBoleto ( boletoBuilder1 ) ;
		BoletoPadrao boletos1 = geradorDeBoleto1 . geraBoleto ("Fabinho", "Banco Bradesco", 100) ;
		System . out . println ( boletos1.toString() ) ;
		
		BoletoBuilder boletoBuilder2 = new BoletoNubankBuilder () ;
		GeradorDeBoleto geradorDeBoleto2 = new GeradorDeBoleto ( boletoBuilder2 ) ;
		BoletoPadrao boletos2 = geradorDeBoleto2 . geraBoleto ("Pedro", "Caixa eletrônico", 1000) ;
		System . out . println ( boletos2.toString() ) ;
		
		BoletoBuilder boletoBuilder3 = new BoletoItauBuilder () ;
		GeradorDeBoleto geradorDeBoleto3 = new GeradorDeBoleto ( boletoBuilder3 ) ;
		BoletoPadrao boletos3 = geradorDeBoleto3 . geraBoleto ("Ianca", "Banco Unibanco", 20) ;
		System . out . println ( boletos3.toString() ) ;
		}

}
