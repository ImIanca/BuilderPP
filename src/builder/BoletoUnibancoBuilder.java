package builder;
import java.util.Date;
public class BoletoUnibancoBuilder implements BoletoBuilder {

    private BoletoPadrao boleto;

    public BoletoUnibancoBuilder() {
        boleto = new BoletoPadrao();
    }

    @Override
    public void buildSacado(String sacado) {
        boleto.setSacado(sacado);
    }

    @Override
    public void buildCedente(String cedente) {
        boleto.setCedente(cedente);
    }

    @Override
    public void buildValor(double valor) {
        
        double taxa = 3.00; // taxa fixa
        double percentual = valor * 0.015; 
        boleto.setValor(valor + taxa + percentual);
    }

    @Override
    public void buildVencimento(Date vencimento) {
        boleto.setVencimento(vencimento);
    }

    @Override
    public void buildNossoNumero() {

        // Código do banco (Itaú/Unibanco) = 341
        String banco = "341";

        
        int sequencial = (int) (Math.random() * 1000000);

        String numeroBase = banco + String.format("%06d", sequencial);

      
        int soma = 0;
        int peso = 2;

        for (int i = numeroBase.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(numeroBase.charAt(i));
            soma += num * peso;
            peso = (peso == 9) ? 2 : peso + 1;
        }

        int resto = soma % 11;
        int dv;

        if (resto == 0 || resto == 1) {
            dv = 0;
        } else {
            dv = 11 - resto;
        }

        String nossoNumeroCompleto = numeroBase + dv;

        boleto.setNossoNumero (nossoNumeroCompleto);
    }

    @Override
    public BoletoPadrao getBoleto() {
        return boleto;
    }
}
