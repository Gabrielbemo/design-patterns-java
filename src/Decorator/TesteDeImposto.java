package Decorator;

import TemplateMethod.Orcamento;

public class TesteDeImposto {

    public static void main(String[] args) {
        Imposto impostoComplexo = new ISS(new ICMS(new IMA()));

        Orcamento orcamento = new Orcamento(500.0);

        double valor = impostoComplexo.calcula(orcamento);

        System.out.println(valor);
    }
}
