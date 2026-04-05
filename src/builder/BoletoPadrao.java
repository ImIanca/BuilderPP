package builder;

import java.util.Date;

public class BoletoPadrao {

	private String sacado ;
	private String cedente ;
	private double valor ;
	private Date vencimento ;
	private String nossoNumero ;
	
	public String getSacado() {
		return sacado;
	}
	public void setSacado(String sacado) {
		this.sacado = sacado;
	}
	public String getCedente() {
		return cedente;
	}
	public void setCedente(String cedente) {
		this.cedente = cedente;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public String getNossoNumero() {
		return nossoNumero;
	}
	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}
	
	public String toString () {
		return ("Sacado: "+ this.sacado + 
				"\nCedente: "+ this.cedente + 
				"\nValor: "+ this.valor + 
				"\nVencimento: " + this.vencimento.toString() + 
				"\nNosso Numero: "+ this.nossoNumero);
	}
}
