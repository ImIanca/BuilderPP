package builder;
import java.util.Calendar;
public interface Boletos {

	String getSacado () ;
	String getCedente () ;
	double getValor () ;
	Calendar getVencimento () ;
	int getNossoNumero () ;
	String toString () ;
	
}
