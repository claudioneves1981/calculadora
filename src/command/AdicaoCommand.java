package command;

import enums.Operacoes;
import service.impl.CalculadoraImpl;

public class AdicaoCommand extends Command {

    CalculadoraImpl calculadora = new CalculadoraImpl();

    @Override
    public void execute(int a, int b) {
        System.out.println(calculadora.calcular(a,b, Operacoes.ADICAO));
    }

}
