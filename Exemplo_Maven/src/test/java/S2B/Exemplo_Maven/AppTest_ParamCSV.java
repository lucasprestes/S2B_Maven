package S2B.Exemplo_Maven;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junitparams.FileParameters;



@RunWith(Parameterized.class)
public class AppTest_ParamCSV {

	private int fInput_01;
    private int fInput_02;
    private int fExpected;

    public AppTest_ParamCSV(int a, int b, int expected) {
        fInput_01= a;
        fInput_02= b;
        fExpected= expected;
    }
	
    @Test
    @FileParameters("/Users/lucasplautzprestes/Documents/GitHub/S2B_Maven/file.csv")
    public void loadParamsFromAnyFile(int a, int b, int output) {
    	
    	AppTest_ParamCSV obj = new AppTest_ParamCSV(a,b,output);
    	assertEquals(fExpected, App.Soma(obj.fInput_01, obj.fInput_02));
    
    }
    
}
