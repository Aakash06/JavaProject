package pdif;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class BinaryOperatorExample {

    public double computeInterestOfYear(double rate, double principal) {
        BinaryOperator<Double> interest = (r, p) -> (r * p * 1) / 100;
        double amount = interest.apply(rate, principal);
        return amount;
    }
}
