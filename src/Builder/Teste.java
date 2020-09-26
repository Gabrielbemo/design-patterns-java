package Builder;

import Observer.*;

import java.util.Calendar;

public class Teste {
    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();

        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDao());
        builder.adicionaAcao(new EnviadorDeSms());
        builder.adicionaAcao(new Impressora());
        builder.adicionaAcao(new Multiplicador(2));

        builder.paraEmpresa("FTeste")
                .comCnpj("adasdasd")
                .com(new ItemDaNota("nome", 100))
                .com(new ItemDaNota("nome2", 200))
                .comObservacoes("ob");
                //.naData();

        NotaFiscal n = builder.constroi();

        System.out.println(n.getValorBruto());
    }
}
