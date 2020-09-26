package Strategy;

public class Conservador implements Investimento {
    @Override
    public double calculaLucro(Conta conta) {
        return conta.getSaldo() * 0.008;
    }
}
