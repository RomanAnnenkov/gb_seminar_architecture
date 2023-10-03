package calculatorMVC.view.output;

public class FileOutput implements IOutput {
    @Override
    public void displayOutput(String result) {
        System.out.println("save to file: " + result);
    }
}
