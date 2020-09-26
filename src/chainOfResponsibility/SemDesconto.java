package chainOfResponsibility;

public class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setNext(Desconto desconto) {

    }
}
