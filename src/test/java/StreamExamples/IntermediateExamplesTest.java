package StreamExamples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IntermediateExamplesTest {

    private IntermediateExamples student1 = new IntermediateExamples(1, 45);
    private IntermediateExamples student2 = new IntermediateExamples(2, 38);
    private IntermediateExamples student3 = new IntermediateExamples(3, 78);
    private IntermediateExamples student4 = new IntermediateExamples(4, 78);
    private List<IntermediateExamples> list = Arrays.asList(student1, student2, student3, student4);
    private IntermediateExamples intermediateExamples = new IntermediateExamples(list);

    @Test
    public void filterExample() throws Exception {

        assertEquals(intermediateExamples.filterExample(list),3,0);
    }

    @Test
    public void distinctExample() throws Exception {

        assertEquals(intermediateExamples.distinctExample(list),3,0);
    }

    @Test
    public void skipLimitExample() throws Exception {

        assertEquals(intermediateExamples.skipLimitExample(list),78,0);
    }

    @Test
    public void sortedExamples() throws Exception {

        assertEquals(intermediateExamples.sortedExamples(list),38,0);
    }

}