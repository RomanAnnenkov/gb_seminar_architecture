package calculatorMVC.model.sumOperation;

public class SumOperation implements ISum {
    public SumOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    double firstArg;
    double secondArg;

    public double sum() {
        return firstArg + secondArg;
    }
}
