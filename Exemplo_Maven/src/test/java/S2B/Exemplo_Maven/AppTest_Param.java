package S2B.Exemplo_Maven;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class AppTest_Param {

	private int fInput_01;
    private int fInput_02;
    private int fExpected;

    public AppTest_Param(int a, int b, int expected) {
        fInput_01= a;
        fInput_02= b;
        fExpected= expected;
    }
    
    
    @Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	 { 0, 0, 0 }, 
             { 1, 1, 2 }, 
             { 2, 1, 3 }, 
             { 3, 2, 5 }, 
             { 4, 3, 7 }, 
             { 5, 5, 10}, 
             { 6, 8, 14}  
        });
    }
     
    @Test
      public void test() {
         assertEquals(fExpected, App.Soma(fInput_01, fInput_02));
      }
       
}
