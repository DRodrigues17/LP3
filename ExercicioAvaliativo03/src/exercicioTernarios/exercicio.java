package exercicioTernarios;

import java.math.BigDecimal;

public class exercicio {

    public static void main(String[] args) {
            String frase = "piadas internas";

            String validacaoDeValor =  frase.isBlank()? "parece que a frase é um espaco em branco" : "utilização de ternarios";
            System.out.println(validacaoDeValor);

            String nomeCliente = "João da Silva";
//        if (nomeCliente != null) {
//            String nomeClienteEmMaiusculo = nomeCliente.toUpperCase();
//            System.out.println(nomeClienteEmMaiusculo);
//        }

            String nomeClienteEmMaisculo = nomeCliente == null ?  null : nomeCliente.toUpperCase();
            System.out.println(nomeClienteEmMaisculo);


            BigDecimal salarioFuncionario = new BigDecimal(6000);







        }

}
