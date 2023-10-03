package calculatorMVC.model;

import calculatorMVC.model.divideOperation.DivideOperation;
import calculatorMVC.model.divideOperation.IDivide;
import calculatorMVC.model.multiplyOperation.IMultiply;
import calculatorMVC.model.multiplyOperation.MultiplyOperation;
import calculatorMVC.model.substractOperation.ISubstract;
import calculatorMVC.model.substractOperation.SubstractOperation;
import calculatorMVC.model.sumOperation.ISum;
import calculatorMVC.model.sumOperation.SumOperation;

public class CalculationLayer {
    public double add(double a, double b) {
        ISum sumOperation = new SumOperation(a, b);
        return sumOperation.sum();
    }

    public double subtract(double a, double b) {
        ISubstract substractOperation = new SubstractOperation(a, b);
        return substractOperation.substract();
    }

    public double multiply(double a, double b) {
        IMultiply multiplyOperation = new MultiplyOperation(a, b);
        return multiplyOperation.multiply();
    }

    public double divide(double a, double b) {
        IDivide divideOperation = new DivideOperation(a, b);
        return divideOperation.divide();
    }
}
