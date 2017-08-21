package pdif;

import java.util.function.Predicate;

public class PredicateExample {

    public boolean passOrNot(Double percentage){

        Predicate<Double> criteria = r-> r > 40;
        return criteria.test(percentage);
    }

}
