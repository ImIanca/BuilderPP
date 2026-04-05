package builder;
import java.util.Date;
public class BoletoBradescoBuilder implements BoletoBuilder {

    private BoletoPadrao boleto;

    public BoletoBradescoBuilder() {
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
        
        double tarifa = 2.50;
        double percentual = valor * 0.01; // 1%
        boleto.setValor(valor + tarifa + percentual);
    }

    @Override
    public void buildVencimento(Date vencimento) {
        boleto.setVencimento(vencimento);
    }

    @Override
    public void buildNossoNumero() {

        // Código do banco Bradesco = 237
        String banco = "237";

        
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

      
        boleto.setNossoNumero(nossoNumeroCompleto);
    }

    @Override
    public BoletoPadrao getBoleto() {
        return boleto;
    }
}