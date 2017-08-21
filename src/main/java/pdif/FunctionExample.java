package pdif;

import java.util.function.Function;

class FunctionExample {

    boolean eligibleToVote(int age){
        Function<Integer,Boolean> function = value -> value>18;
        return function.apply(age);
    }

}
