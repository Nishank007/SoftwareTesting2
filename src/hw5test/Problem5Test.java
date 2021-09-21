package hw5test;

import static org.junit.Assert.*;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import hw5src.Problem5Class;
import hw5src.Problem5ServerData;

@RunWith(JUnitParamsRunner.class)
public class Problem5Test 
{
	Problem5Class problem5;
	Problem5ServerData mockobj;
	
	@Before
	public void setUp() throws Exception 
	{
		problem5 = new Problem5Class();
		mockobj = EasyMock.strictMock(Problem5ServerData.class);	
	}
	
	@FileParameters("src/hw5test/Problem5TestCaseTable.csv")
	@Test
	public void test(int testcase,double usage, double total_price_expected, String comments) 
	{
		EasyMock.expect(mockobj.getUsage()).andReturn(usage);
		EasyMock.replay(mockobj);
		assertEquals(total_price_expected,problem5.calcBill(mockobj),0.01);
	}
}