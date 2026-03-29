package command;



public class DivisaoCommand extends Command {

    @Override
    public void execute(double a, double b) {
        System.out.println(b == 0 ? "divisao por 0" : String.valueOf(a / b));
    }
}
