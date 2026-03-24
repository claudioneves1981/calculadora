package service.impl;

import enums.Operacoes;
import service.Calculadora;

public class CalculadoraImpl implements Calculadora {


    @Override
    public String calcular(double num1, double num2, Operacoes operacao) {

        return switch (operacao) {
            case MULTIPLICACAO -> String.valueOf(num1 * num2);
            case DIVISAO -> num2 == 0 ? "divisao por 0" : String.valueOf(num1 / num2);
            case ADICAO -> String.valueOf(num1 + num2);
            case SUBTRACAO -> String.valueOf(num1 - num2);
        };


    }
}
