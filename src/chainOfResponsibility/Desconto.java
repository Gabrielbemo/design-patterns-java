package chainOfResponsibility;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setNext(Desconto desconto);
}
