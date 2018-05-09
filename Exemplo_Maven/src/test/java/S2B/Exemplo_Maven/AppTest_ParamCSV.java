package S2B.Exemplo_Maven;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;


import static org.junit.Assert.assertEquals;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class AppTest_ParamCSV {

    
    @Test
	@FileParameters("/Users/lucasplautzprestes/Documents/GitHub/S2B_Maven/file.csv")
	public void loadParamsFromAnyFile(int a, int b, int expected) {
		
		assertEquals(expected, App.Soma(a,b));
		
	}
    
    /*
    @Test
	@FileParameters("/Users/lucasplautzprestes/Documents/GitHub/S2B_Maven/file.csv")
    public void loadParamsFromAnyFile(int a, int b, int output) {
    	
    	AppTest_ParamCSV obj = new AppTest_ParamCSV(a,b,output);
    	assertEquals(fExpected, App.Soma(obj.fInput_01, obj.fInput_02));
    }
    */
}
