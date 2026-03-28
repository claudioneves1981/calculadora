import command.*;
import enums.Operacoes;
import registry.ProcessDataRegistry;
import service.impl.CalculadoraImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      final var registry = new ProcessDataRegistry();

      int inputNumber;

      do{

          Scanner input = new Scanner(System.in);
          System.out.println("""
              Calculadora
              
              1- Adição
              2- Subtração
              3- Multiplicar
              4- Dividir
              0- Sair
              """);

          inputNumber = input.nextInt();

          registry.register(1, new AdicaoCommand());
          registry.register(2, new SubtracaoCommand());
          registry.register(3, new MultiplicaoCommand());
          registry.register(4, new DivisaoCommand());

          if(inputNumber > 0 && inputNumber < 5) {

          final var command = registry.resolve(inputNumber);
          System.out.println("Digite um numero: ");
          int a = input.nextInt();
          System.out.println("Digite outro numero: ");
          int b = input.nextInt();
          command.execute(a, b);

          }


      }while(inputNumber !=0);

    }
}