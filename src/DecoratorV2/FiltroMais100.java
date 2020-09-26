package DecoratorV2;

import java.util.ArrayList;
import java.util.List;

public class FiltroMais100 extends Filtro {

    public FiltroMais100(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltroMais100() {
        super();
    }

    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtrada = new ArrayList<Conta>();
        for(Conta c : contas) {
            if(c.getValor() < 100) filtrada.add(c);
        }

        filtrada.addAll(proximo(contas));
        return filtrada;
    }
}
