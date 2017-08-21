package pdif;

import org.junit.Test;

import static org.junit.Assert.*;

public class SupplierExampleTest {

    SupplierExample supplierExample= new SupplierExample();

    @Test
    public void greetMessage() throws Exception {
        assertEquals(supplierExample.greetMessage(),"Welcome to Knoldus!!");
    }

}