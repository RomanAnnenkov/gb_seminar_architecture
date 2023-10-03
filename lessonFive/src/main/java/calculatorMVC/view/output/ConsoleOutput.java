package calculatorMVC.view.output;

public class ConsoleOutput implements IOutput {

    @Override
    public void displayOutput(String result) {
        System.out.println(result);
    }
}
