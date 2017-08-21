package pdif;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FunctionExampleTest {

    FunctionExample functionExample = new FunctionExample();
    @Test
    public void eligibleToVote() throws Exception {

        System.out.println("Test for true Condition");
        assertTrue(functionExample.eligibleToVote(25));

        System.out.println("Test for false Condition");
        assertFalse(functionExample.eligibleToVote(12));

    }

}