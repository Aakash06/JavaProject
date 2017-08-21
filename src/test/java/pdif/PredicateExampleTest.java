package pdif;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateExampleTest {

    PredicateExample predicateExample=new PredicateExample();
    @Test

    public void passOrNot() throws Exception {

    assertTrue(predicateExample.passOrNot(58.4));

    }

}