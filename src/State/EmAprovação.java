package State;

public class EmAprovação implements OrcamentoState {
    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado) {
            orcamento.valor = -orcamento.valor * 0.05;
        }else {
            throw new RuntimeException("Desconto já aplicado!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.orcamentoState = new Aprovado();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.orcamentoState = new Reprovado();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("orçamento em analise n pode ser finalizado");
    }
}
