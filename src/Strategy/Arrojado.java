package Strategy;

public class Arrojado implements Investimento{

    @Override
    public double calculaLucro(Conta conta) {
        double rand = new java.util.Random().nextDouble();
        return rand < 0.20 ? conta.getSaldo() * 0.05 :
                rand >= 0.20 && rand < 0.50 ? conta.getSaldo() * 0.03 :
                        conta.getSaldo() * 0.006;
    }
}
