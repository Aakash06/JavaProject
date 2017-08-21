package StreamExamples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class MarkSheetTest {

    private MarkSheet student1 = new MarkSheet(1, 8);
    private MarkSheet student2 = new MarkSheet(2, 45);
    private MarkSheet student3 = new MarkSheet(3, 8);
    private MarkSheet student4 = new MarkSheet(4, 8);
    private List<MarkSheet> list = Arrays.asList(student1, student2, student3, student4);
    private MarkSheet markSheet = new MarkSheet(list);

    private Predicate<MarkSheet> result = n->n.marks>40;

    BiFunction<MarkSheet,MarkSheet,Float> sum = (m1, m2) -> m1.marks + m2.marks;

    @Test
    public void allMatchResult() throws Exception {
        assertFalse(markSheet.allMatchResult(result,list));
    }

    @Test
    public void anyMatchResult() throws Exception {
        assertTrue(markSheet.anyMatchResult(result,list));
    }

    @Test
    public void noneMatchResult() throws Exception {
        assertFalse(markSheet.noneMatchResult(result,list));
    }

    @Test
    public void findAnyResult() throws Exception {
        assertEquals(markSheet.findAnyResult(list),45,1);
    }

    @Test
    public void findFirstResult() throws Exception {
        assertEquals(markSheet.findFirstResult(list),8,0);
    }

    @Test
    public void findMin() throws Exception{
        assertEquals(markSheet.findMin(list),8,0);
    }

    @Test
    public void findMax() throws Exception{
        assertEquals(markSheet.findMax(list),45,0);
    }

    @Test
    public void computeCount() throws Exception{
        assertEquals(markSheet.computeCount(list),4,0);
    }

    @Test
    public void computeCollect() throws Exception{
        assertEquals(markSheet.computeCollect(list),69,0);
    }

    @Test
    public void reduceExample() throws Exception{
        assertEquals(markSheet.reduceExample(list),69,0);
    }


}