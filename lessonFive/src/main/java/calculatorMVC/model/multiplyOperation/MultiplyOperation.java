package calculatorMVC.model.multiplyOperation;

public class MultiplyOperation implements IMultiply {
    public MultiplyOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    double firstArg;
    double secondArg;

    public double multiply() {
        return firstArg * secondArg;
    }
}
