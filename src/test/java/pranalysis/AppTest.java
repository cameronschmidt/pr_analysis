package pranalysis;

import org.junit.Test;

import pranalysis.App;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testApp()
    {
    	new App().aMethod(null);
    	String[] testVals = {"ONE"};
    	new App().aMethod(testVals);
    }
}
