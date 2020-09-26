package Strategy;

public class Moderado implements Investimento{

    @Override
    public double calculaLucro(Conta conta) {
        return new java.util.Random().nextDouble() > 0.50 ?
                conta.getSaldo() * 0.025: conta.getSaldo() * 0.007;
    }
}
