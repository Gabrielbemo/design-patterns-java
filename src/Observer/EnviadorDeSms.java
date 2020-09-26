package Observer;

import Builder.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNota {
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("enviando por sms");
    }
}