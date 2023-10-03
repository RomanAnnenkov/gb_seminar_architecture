package calculatorMVC;

import calculatorMVC.view.ConsoleView;
import calculatorMVC.view.IView;
import calculatorMVC.view.input.SystemInInput;
import calculatorMVC.view.output.ConsoleOutput;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView(new SystemInInput(), new ConsoleOutput());
        view.runCalculator();
    }
}

