package Strategy;

public class RealizadorDeInvestimentos {

    public void realizaInvestimento(Conta conta, Investimento investimento){
        conta.setSaldo(conta.getSaldo() + (investimento.calculaLucro(conta) * 0.75));
        System.out.println("Investido");
    }
}
