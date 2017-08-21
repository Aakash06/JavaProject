package pdif;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryOperatorExampleTest {

    private BinaryOperatorExample binaryOperatorExample = new BinaryOperatorExample();

    @Test
    public void computeInterestOfYear() throws Exception {
    assertEquals(binaryOperatorExample.computeInterestOfYear(58,58.5),33.93,0.1);
    }

}