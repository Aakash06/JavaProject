package pdif;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnaryExampleTest {

   UnaryExample unaryExample=new UnaryExample();

    @Test
    public void libraryzFineComputation() throws Exception {

    assertEquals(unaryExample.libraryzFineComputation(25),125,10);

    }


}