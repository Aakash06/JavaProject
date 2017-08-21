package defaultStaticExamples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefaultStaticTest {

    private DefaultStatic defaultStatic = new DefaultStatic();

    @Test
    public void developer() throws Exception {
        assertEquals(defaultStatic.developer(),"Welcome to all");
    }

    @Test
    public void developer2() throws Exception {
        assertEquals(defaultStatic.developer2(),"Welcome to all");
    }

    @Test
    public void profile() throws Exception{
        assertEquals(defaultStatic.profile(),"Hello I am Java Developer");

        assertEquals(JavaDeveloper.salary(),25000,100);
    }

    @Test
    public void profile1() throws Exception{
        assertEquals(defaultStatic.profile1(),"Hello I am Scala Developer");

        assertEquals(ScalaDeveloper.salary(),25000,100);
    }

}