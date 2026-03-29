package command;

public class AdicaoCommand extends Command {

    @Override
    public void execute(double a, double b) {
        System.out.println(a + b);
    }

}
