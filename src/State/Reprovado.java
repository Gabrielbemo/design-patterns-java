package State;

public class Reprovado implements OrcamentoState{
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {

    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("orçamento em analise n pode ser aprova");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("orçamento em analise n pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.orcamentoState = new Finalizado();
    }
}
