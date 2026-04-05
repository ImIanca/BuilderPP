package builder;
import java.util.Date;
public class GeradorDeBoleto {
	
	private BoletoBuilder boletoBuilder ;
	
	public GeradorDeBoleto ( BoletoBuilder boletoBuilder ) {
	this . boletoBuilder = boletoBuilder ;
	}
	
	public BoletoPadrao geraBoleto (String sacado, String cedente, double valor) {

	this . boletoBuilder . buildSacado (sacado) ;
	
	this . boletoBuilder . buildCedente (cedente) ;
	
	this . boletoBuilder . buildValor (valor) ;
	
	Date agora = new Date();
	Date vencimento = new Date(agora.getTime() + 30L * 24 * 60 * 60 * 1000);
	this . boletoBuilder . buildVencimento ( vencimento ) ;
	
	this . boletoBuilder . buildNossoNumero () ;

	BoletoPadrao boletos = boletoBuilder . getBoleto () ;

	return boletos ;
	}

}
