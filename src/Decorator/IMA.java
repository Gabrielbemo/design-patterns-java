package Decorator;

import TemplateMethod.Orcamento;

public class IMA extends Imposto {

    public IMA(){
        super();
    }

    public IMA(Imposto outroImposto){
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
    }
}
