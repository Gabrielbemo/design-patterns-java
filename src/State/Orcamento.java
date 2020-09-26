package State;

public class Orcamento {
    protected double valor;

    protected OrcamentoState orcamentoState;

    public Orcamento() {
        this.orcamentoState = new EmAprovação();
    }

    public void aplicaDescontoExtra() {
        orcamentoState.aplicaDescontoExtra(this);
    }

    public void aprova() {
        orcamentoState.aprova(this);
    }

    public void reprova() {
        orcamentoState.reprova(this);
    }

    public void finaliza() {
        orcamentoState.finaliza(this);
    }
}
