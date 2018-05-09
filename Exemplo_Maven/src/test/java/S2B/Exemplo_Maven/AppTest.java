package S2B.Exemplo_Maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;


public class AppTest 
{
	@Test
    public void testApp()
    {
        assertTrue( true );
    }
	
	@Test
	public void TestSoma_01() {		
		
		if( App.Soma(20, 30)!=50)
		fail("Not yet implemented");

	}
	
	@Test
	public void TestSoma_02() {		
		
		int expected = 50;
		int actual = App.Soma(20, 30);
		
		assertEquals(expected, actual);

	}
}
