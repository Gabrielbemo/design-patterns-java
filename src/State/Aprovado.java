package State;

public class Aprovado implements OrcamentoState{
    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado) {
            orcamento.valor = -orcamento.valor * 0.03;
        }else {
            throw new RuntimeException("Desconto já aplicado!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("orçamento em analise n pode ser aprovado");
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
