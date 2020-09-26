package DecoratorV2;

import java.util.Calendar;
import java.util.Date;

public class Conta {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Calendar getDataAbertura(){
        return Calendar.getInstance();
    }
}
