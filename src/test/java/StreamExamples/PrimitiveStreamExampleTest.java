package StreamExamples;

import org.junit.Test;
import pdif.PredicateExample;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimitiveStreamExampleTest {

    PrimitiveStreamExample primitiveStreamExample =new PrimitiveStreamExample();

    List<Integer> list = Arrays.asList(2,4,6,8,10);

    @Test
    public void averageExample() throws Exception {
        assertEquals(primitiveStreamExample.averageExample(list),6.0,0);
    }

    @Test
    public void iterateExample() throws Exception {
        assertEquals(primitiveStreamExample.iterateExample(5,1),4.0,0);
    }

}