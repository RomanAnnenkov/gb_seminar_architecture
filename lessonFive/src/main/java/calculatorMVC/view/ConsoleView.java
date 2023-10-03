package calculatorMVC.view;

import calculatorMVC.model.CalculationLayer;
import calculatorMVC.view.input.IInput;
import calculatorMVC.view.output.IOutput;


public class ConsoleView implements IView {
    IInput input;

    IOutput output;
    CalculationLayer calcLayer;

    public ConsoleView(IInput input, IOutput output) {
        this.input = input;
        this.output = output;
        calcLayer = new CalculationLayer();
    }

    @Override
    public void runCalculator() {
        calcLayer.subtract(Double.parseDouble(input.getInput()), Double.parseDouble(input.getInput()));
    }
}
