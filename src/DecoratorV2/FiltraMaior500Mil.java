package DecoratorV2;

import java.util.ArrayList;
import java.util.List;

public class FiltraMaior500Mil extends Filtro {

    public FiltraMaior500Mil(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltraMaior500Mil() {
        super();
    }

    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtrada = new ArrayList<Conta>();
        for(Conta c : contas) {
            if(c.getValor() > 500000) filtrada.add(c);
        }

        filtrada.addAll(proximo(contas));
        return filtrada;
    }
}