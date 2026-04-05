package builder;
import java.util.Date;
public interface BoletoBuilder {
	
	void buildSacado ( String sacado ) ;
	void buildCedente ( String cedente ) ;
	void buildValor ( double valor ) ;
	void buildVencimento ( Date vencimento ) ;
	void buildNossoNumero () ;
	
	BoletoPadrao getBoleto () ;

}
