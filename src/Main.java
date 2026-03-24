import enums.Operacoes;
import service.Calculadora;
import service.impl.CalculadoraImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      CalculadoraImpl calculadora = new CalculadoraImpl();

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

          int a;
          int b;

          switch(inputNumber){
              case 1:
                  System.out.println("Digite um numero: ");
                  a = input.nextInt();
                  System.out.println("Digite outro numero: ");
                  b = input.nextInt();
                  System.out.println(calculadora.calcular(a,b, Operacoes.ADICAO)+"\n");
                  break;
                  case 2:
                  System.out.println("Digite um numero: ");
                  a = input.nextInt();
                  System.out.println("Digite outro numero: ");
                  b = input.nextInt();
                  System.out.println(calculadora.calcular(a,b, Operacoes.SUBTRACAO)+"\n");
                  break;
                  case 3:
                  System.out.println("Digite um numero: ");
                  a = input.nextInt();
                  System.out.println("Digite outro numero: ");
                  b = input.nextInt();
                  System.out.println(calculadora.calcular(a,b, Operacoes.MULTIPLICACAO)+"\n");
                  break;
                  case 4:
                  System.out.println("Digite um numero: ");
                  a = input.nextInt();
                  System.out.println("Digite outro numero: ");
                  b = input.nextInt();
                  System.out.println(calculadora.calcular(a,b, Operacoes.DIVISAO)+"\n");
                  break;
                  case 0:
                      System.exit(0);
                      break;
                      default:
                          System.out.println("Opção invalida");
                          break;


          }

      }while(inputNumber > 0);

    }
}