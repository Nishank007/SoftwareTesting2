package hw5test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import hw5src.Problem2CORRECTEDClass;
import hw5src.Problem2CORRECTEDClass.gDoorStates;

	@RunWith(JUnitParamsRunner.class)
	public class Problem2Test 
	{ 	
		Problem2CORRECTEDClass problem2 ;
		
		@Before
		public void setUp() throws Exception 
		{
			problem2 = new Problem2CORRECTEDClass();	
		}	

		@Test
		@FileParameters("src/hw5test/Problem2TestCaseTable.csv")
		public void test(int testcase,gDoorStates currentstate,boolean top, boolean bottom, boolean obstacle, boolean remote,boolean expected_door_raise, boolean expected_lights_on, boolean expected_door_stop,gDoorStates endstate) 
		{		
			problem2.garageDoorOpener(currentstate);
			problem2.setState(currentstate);
			problem2.setT(top);
			problem2.setB(bottom);
			problem2.setO(obstacle);
			problem2.setR(remote);
			problem2.setDR(expected_door_raise);
			problem2.setLO(expected_lights_on);
			problem2.setDS(expected_door_stop);
			assertEquals(currentstate,problem2.getState());
			assertEquals(top,problem2.isT());
			assertEquals(bottom,problem2.isB());
			assertEquals(obstacle,problem2.isO());
			assertEquals(remote,problem2.isR());
			assertEquals(expected_door_raise,problem2.isDR());
			assertEquals(expected_lights_on,problem2.isLO());
			assertEquals(expected_door_stop,problem2.isDS());
		}
	
	}