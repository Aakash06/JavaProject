package pdif;

import java.util.function.UnaryOperator;

public class UnaryExample {

    public int libraryzFineComputation(int day){
        UnaryOperator<Integer> unaryOperator = x-> 5*x;

        return unaryOperator.apply(25);

    }

}
