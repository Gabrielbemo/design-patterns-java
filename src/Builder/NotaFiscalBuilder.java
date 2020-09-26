package Builder;

import Observer.AcaoAposGerarNota;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
    private String razaoSocial;
    private String cnpj;
    private double valorTotal;
    private double impostos;
    private Calendar data = null;
    private String observacoes;
    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

    public NotaFiscalBuilder(List<AcaoAposGerarNota> a) {
        this.todasAcoesASeremExecutadas = a;
    }

    public NotaFiscalBuilder() {
        this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
    }

    public void adicionaAcao(AcaoAposGerarNota novaAcao) {
        this.todasAcoesASeremExecutadas.add(novaAcao);
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder com(ItemDaNota item) {
        todosItens.add(item);
        this.valorTotal += item.getValor();
        impostos += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naData(Calendar calendar) {
        this.data = calendar;
        return this;
    }

    public NotaFiscal constroi() {
        if(data == null) this.data = Calendar.getInstance();
        NotaFiscal n = new NotaFiscal(razaoSocial,cnpj,data,valorTotal,impostos,todosItens,observacoes);
        for(AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
            acao.executa(n);
        }
        return n;
    }
}
