
package dz.univ.calculatrice;

public class DivideOperation implements Operation {

    @Override
    public double execute(double first, double second) {
        if (second == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return first / second;
    }

    @Override
    public String symbol() {
        return "/";
    }
}
