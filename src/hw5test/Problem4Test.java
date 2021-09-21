package hw5test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import hw5src.Problem4Class;

	@RunWith(JUnitParamsRunner.class)
	public class Problem4Test 
	{ 		
		Problem4Class problem4 ;
				
		@Before
		public void setUp() throws Exception 
		{
			problem4 = new Problem4Class();			
		}	
	
		@Test
		@FileParameters("src/hw5test/Problem4TestCaseTable.csv")
		public void test(int testcase, double roomTotal, boolean coupon, int memberPoints, int days, boolean member, double taxRate,double expected_result, String bp, String comments) 
		{		
		assertEquals(expected_result,problem4.hotelDiscount(roomTotal,coupon,memberPoints,days,member,taxRate),0.01);
		}
	
	}