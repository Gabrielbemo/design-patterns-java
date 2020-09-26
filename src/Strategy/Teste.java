package Strategy;

public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta(100);
        RealizadorDeInvestimentos r = new RealizadorDeInvestimentos();

        Arrojado a = new Arrojado();
        Moderado m = new Moderado();
        Conservador co = new Conservador();

        r.realizaInvestimento(c,a);
        System.out.println("Saldo: " + c.getSaldo());
        r.realizaInvestimento(c,m);
        System.out.println("Saldo: " + c.getSaldo());
        r.realizaInvestimento(c,co);
        System.out.println("Saldo: " + c.getSaldo());
    }
}
