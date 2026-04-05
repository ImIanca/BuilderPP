package builder;
import java.util.Date;
public interface Boletos {

	String getSacado () ;
	String getCedente () ;
	double getValor () ;
	Date getVencimento () ;
	int getNossoNumero () ;
	String toString () ;
	
}
