package LocalDateExample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BirthTimeExampleTest {

    private BirthTimeExample birthTimeExample= new BirthTimeExample();

    @Test
    public void ageCalculator() throws Exception {
    assertEquals(birthTimeExample.ageCalculator(6,3,1995),"Your age is 22 years 5 months");
    }

}