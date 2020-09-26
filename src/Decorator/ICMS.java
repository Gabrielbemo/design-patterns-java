package Decorator;

import TemplateMethod.Orcamento;

public class ICMS extends Imposto {
    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICMS() {
        super();
    }

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.04 + calculoDoOutroImposto(orcamento);
    }
}
