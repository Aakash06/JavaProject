package StreamExamples;

import java.util.List;
import java.util.stream.IntStream;

class PrimitiveStreamExample {

    double averageExample(List<Integer> list){

        IntStream average = list.stream().mapToInt(i->i);

        return average.average().orElse(0);
    }

    double iterateExample(int limit,double otherValue){

        IntStream hello= IntStream.iterate(0,n->n+2);

        return hello.limit(limit).average().orElse(otherValue);
    }

}
