package hw5test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import hw5src.Problem1Class;

	@RunWith(JUnitParamsRunner.class)
	public class Problem1Test 
	{ 
		Problem1Class problem1 ;	
		
		@Before
		public void setUp() throws Exception 
		{
			problem1 = new Problem1Class();
		}	

		@Test
		@FileParameters("src/hw5test/Problem1TestCaseTable.csv")
		public void test(int testcase, double agl_expected, double velocity_expected, boolean autoLandEng_expected, double retroforce_expected, boolean applyRockets_expected, String comments) 
		{
			 problem1.retroRocket(agl_expected,velocity_expected,autoLandEng_expected);
			 problem1.setRetroForce(retroforce_expected);
             problem1.setApplyRockets(applyRockets_expected);
			 assertEquals(applyRockets_expected,problem1.isApplyRockets());
			 assertEquals(retroforce_expected,problem1.getRetroForce(),0.01);
		}
	
	}