package chainOfResponsibility;

import java.util.List;

public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if(contemItemDeNome(new String[]{"CANETA","LAPIS"},orcamento)){
            return orcamento.getValor() * 0.05;
        }
        return 0;
    }

    @Override
    public void setNext(Desconto proximo) {
        this.proximo = proximo;
    }

    public boolean contemItemDeNome(String[] nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
}
